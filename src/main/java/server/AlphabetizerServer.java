package server;

import common.Constants;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import server.grpc.AlphabetizeGrpcImpl;

import java.io.IOException;
import java.util.logging.Logger;

public class AlphabetizerServer {
  private static final Logger logger = Logger.getLogger(AlphabetizerServer.class.getName());

  public static void main(String[] args) throws IOException, InterruptedException {

    Server server = ServerBuilder.forPort(Constants.PORT)
                      .addService(new AlphabetizeGrpcImpl())
                      .build();

    logger.info("Starting server...");
    server.start();
    logger.info("Server started!");
    server.awaitTermination();
  }
}
