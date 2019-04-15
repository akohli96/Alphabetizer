package server.grpc;

import io.alphabetizer.alphabetize.grpc.AlphabetizeGrpc;
import io.alphabetizer.alphabetize.grpc.AlphabetizeRequest;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;
import io.grpc.stub.StreamObserver;
import server.core.Alphabetizer;

public class AlphabetizeGrpcImpl extends AlphabetizeGrpc.AlphabetizeImplBase {

  @Override
  public void alphabetize(AlphabetizeRequest request, StreamObserver<AlphabetizeResponse> responseObserver) {
    AlphabetizeResponse response = AlphabetizeResponse.newBuilder()
                                    .setOutput(Alphabetizer.alphabetize(request.getInput()))
                                    .build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
