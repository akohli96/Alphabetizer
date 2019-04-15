import io.alphabetizer.alphabetize.grpc.AlphabetizeGrpc;
import io.alphabetizer.alphabetize.grpc.AlphabetizeRequest;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import io.grpc.testing.GrpcServerRule;
import server.grpc.AlphabetizeGrpcImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(JUnit4.class)
public class AlphabetizerServerTest {

  private static final String TEST = "TEST 123t";

  @Rule
  public final GrpcServerRule  grpcServerRule = new GrpcServerRule().directExecutor();
  private AlphabetizeGrpc.AlphabetizeBlockingStub blockingStub;


  @Before
  public void setUp(){
    grpcServerRule.getServiceRegistry().addService(new AlphabetizeGrpcImpl());
    blockingStub = AlphabetizeGrpc.newBlockingStub(grpcServerRule.getChannel());
  }

  @Test
  public void alphabetizerServerShouldSubmitCorrectResponse() {
    AlphabetizeResponse response = blockingStub.alphabetize(createRequest(TEST));
    assertThat(response.getOutput(),equalTo("ESTTt"));

  }

  private static AlphabetizeRequest createRequest(String input){
    return AlphabetizeRequest.newBuilder().setInput(input).build();
  }
}
