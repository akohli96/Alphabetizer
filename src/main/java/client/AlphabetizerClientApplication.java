package client;

import client.grpc.AlphabetizerClient;
import common.Constants;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;

import java.util.logging.Logger;

public class AlphabetizerClientApplication {
  private static final Logger logger =
      Logger.getLogger(AlphabetizerClientApplication.class.getName());

  public static void main(String[] args) throws Exception {
    if (args.length < 1) { //check to prevent code from going further if no parameters specified
      logger.warning("Need to run client with atleast one parameter");
      System.exit(1);
    }

    AlphabetizerClient alphabetizerClient = AlphabetizerClient.createClient(Constants.ADDRESS, Constants.PORT);

    logger.info("Client created");
    try {
      for (String argument : args) {
        AlphabetizeResponse alphabetize = alphabetizerClient.alphabetize(argument); // client runs the function
        System.out.println(alphabetize.getOutput());
      }
    } finally {
      alphabetizerClient.shutdown();
    }
  }
}
