package server.grpc;

import io.alphabetizer.alphabetize.grpc.AlphabetizeGrpc;
import io.alphabetizer.alphabetize.grpc.AlphabetizeRequest;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;
import io.grpc.stub.StreamObserver;
import server.core.Alphabetizer;

public class AlphabetizeGrpcImpl extends AlphabetizeGrpc.AlphabetizeImplBase {

  /*
  Input : Alphabetize request and the responseObserver
  Output : Nothing
  Actually calls the alphabetize method.
  */
  @Override
  public void alphabetize(AlphabetizeRequest request, StreamObserver<AlphabetizeResponse> responseObserver) {
    AlphabetizeResponse response = AlphabetizeResponse.newBuilder()
                                    .setOutput(Alphabetizer.alphabetize(request.getInput()))
                                    .build();
    responseObserver.onNext(response); //used to return response
    responseObserver.onCompleted(); //used to specify that RPC call is finished.
  }
}
