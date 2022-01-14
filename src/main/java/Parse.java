import org.apache.commons.cli.*;

public class Parse {
    public static String parse(String[] args){
        Options options = new Options();
        Option poly = new Option("poly", "poly", true, "poly");
        poly.setRequired(true);
        options.addOption(poly);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());

            System.exit(1);
        }

        String inputPoly = cmd.getOptionValue("poly");

        return(inputPoly);

    }
}