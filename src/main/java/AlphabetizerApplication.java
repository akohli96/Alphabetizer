import core.Alphabetizer;

public class AlphabetizerApplication {

    private static final String USAGE = "USAGE: java -jar Alphabetizer.jar input";

    public static void main(String[] args) {
        if(args.length<1){
            System.out.println(USAGE);
            System.exit(1);
        }

        for(String argument:args){
            System.out.println(Alphabetizer.alphabetize(argument));
        }
        System.exit(0);
    }
}
