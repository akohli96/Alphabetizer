package client.grpc;

import client.AlphabetizerClientApplication;
import io.alphabetizer.alphabetize.grpc.AlphabetizeGrpc;
import io.alphabetizer.alphabetize.grpc.AlphabetizeRequest;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlphabetizerClient {
  private static final Logger logger = Logger.getLogger(AlphabetizerClientApplication.class.getName());
  private static final int TIMEOUT = 5;
  private static final String ERROR = "Failed trying to alphabetize input";
  private final ManagedChannel channel;
  private AlphabetizeGrpc.AlphabetizeBlockingStub blockingStub;

  /*
    Input : hostname and port
    Output : GRPC client
    Binds channel to host and port and creates blocking stub with channel so each call to server is blocking
  */
  private AlphabetizerClient(String hostname, int port) {
    channel = ManagedChannelBuilder.forAddress(hostname, port).usePlaintext().build();
    blockingStub = AlphabetizeGrpc.newBlockingStub(channel);
  }

  /*
   Input : hostname and port
   Output : GRPC client
   Utilize factory method to create a client encapsulating all creation logic
  */
  public static AlphabetizerClient createClient(String hostname, int port) {
    return new AlphabetizerClient(hostname, port);
  }

  /*
  Input : string to alphabetize
  Output : Alphabetzie grpc response
  Submits a blocking grpc request to server and returns grpc response
  */
  public AlphabetizeResponse alphabetize(String input) {
    try {
      AlphabetizeRequest request = AlphabetizeRequest.newBuilder().setInput(input).build();
      return blockingStub.alphabetize(request);
    } catch (RuntimeException e) {
      logger.log(Level.INFO, ERROR, e);
      throw e;
    }
  }

  /*
  Input : None
  Output : None
  Wrapper to shut down the channel with a timeout specified
  */
  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(TIMEOUT, TimeUnit.MINUTES);
  }
}
