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
  private static final Logger logger =
      Logger.getLogger(AlphabetizerClientApplication.class.getName());

  private final ManagedChannel channel;
  private AlphabetizeGrpc.AlphabetizeBlockingStub blockingStub;
  private static final int TIMEOUT = 5;
  private static final String ERROR = "Failed trying to alphabetize input";

  private AlphabetizerClient(String hostname, int port) {
    channel = ManagedChannelBuilder.forAddress(hostname, port).usePlaintext().build();
    blockingStub = AlphabetizeGrpc.newBlockingStub(channel);
  }

  public static AlphabetizerClient createClient(String hostname, int port) {
    return new AlphabetizerClient(hostname, port);
  }

  public AlphabetizeResponse alphabetize(String input) {
    try {
      AlphabetizeRequest request = AlphabetizeRequest.newBuilder().setInput(input).build();
      return blockingStub.alphabetize(request);
    } catch (RuntimeException e) {
      logger.log(Level.INFO, ERROR, e);
      throw e;
    }
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(TIMEOUT, TimeUnit.SECONDS);
  }
}
