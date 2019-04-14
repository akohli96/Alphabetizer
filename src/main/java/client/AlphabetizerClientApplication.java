package client;

import client.grpc.AlphabetizerClient;
import common.Constants;
import io.alphabetizer.alphabetize.grpc.AlphabetizeResponse;

import static io.grpc.okhttp.internal.Platform.logger;

public class AlphabetizerClientApplication {

    public static void main(String[] args) throws Exception{
        if(args.length<1){
            System.out.println("Need to run client with atleast one parameter");
            System.exit(1);
        }

        AlphabetizerClient alphabetizerClient = AlphabetizerClient.createClient(Constants.ADDRESS,Constants.PORT);

        logger.info("Client created");
        try {
            for(String argument: args){
                AlphabetizeResponse alphabetize = alphabetizerClient.alphabetize(argument);
                System.out.println(alphabetize.getOutput());
            }
        }
        finally {
            alphabetizerClient.shutdown();
        }
    }
}
