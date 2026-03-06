package Assignment_02;

import java.util.*;

public class Main {

    private static final Set<String> VALID_POS = new HashSet<>(
            Arrays.asList(
                    "noun","verb","adjective","adverb",
                    "preposition","conjunction","interjection","pronoun"
            )
    );

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("! Loading data...");
        Dictionary dictionary = new Dictionary();
        System.out.println("! Loading completed...");
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords: " + dictionary.getKeywordCount());
        System.out.println("----- Definitions: " + dictionary.getDefinitionCount());

        int searchCount = 1;

        while (true) {

            System.out.print("Search [" + searchCount + "]: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("!help")) {
                printHelp();
                searchCount++;
                continue;
            }

            if (input.equalsIgnoreCase("!q")) {
                System.out.println("-----THANK YOU-----");
                break;
            }

            if (input.isEmpty()) {
                printHelp();
                searchCount++;
                continue;
            }

            String[] tokens = input.split("\\s+");

            String keyword = tokens[0];
            String pos = null;
            boolean distinct = false;
            boolean reverse = false;

            System.out.println("|");

            /* PARAM 2 */
            if (tokens.length >= 2) {
                String p2 = tokens[1].toLowerCase();

                if (VALID_POS.contains(p2)) pos = p2;
                else if (p2.equals("distinct")) distinct = true;
                else if (p2.equals("reverse")) reverse = true;
                else printParam2Error(tokens[1]);
            }

            /* PARAM 3 */
            if (tokens.length >= 3) {
                String p3 = tokens[2].toLowerCase();

                if (p3.equals("distinct")) distinct = true;
                else if (p3.equals("reverse")) reverse = true;
                else printParam3Error(tokens[2]);
            }

            /* PARAM 4 */
            if (tokens.length >= 4) {
                String p4 = tokens[3].toLowerCase();

                if (p4.equals("reverse")) reverse = true;
                else printParam4Error(tokens[3]);
            }

            /* TOO MANY PARAMS */
            if (tokens.length > 4) {
                printHelp();
                searchCount++;
                continue;
            }

            System.out.println("|");

            List<Entry> results =
                    dictionary.search(keyword, pos, distinct, reverse);

            dictionary.printResults(results);

            System.out.println("|");

            searchCount++;
        }
    }

    private static void printHelp() {
        System.out.println("|");
        System.out.println("PARAMETER HOW-TO, please enter:");
        System.out.println("1. A search key -then 2. An optional part of speech -then");
        System.out.println("3. An optional 'distinct' -then 4. An optional 'reverse'");
        System.out.println("|");
    }

    private static void printParam2Error(String bad) {
        System.out.println("<The entered 2nd parameter '" + bad + "' is NOT a part of speech.>");
        System.out.println("<The entered 2nd parameter '" + bad + "' is NOT 'distinct'.>");
        System.out.println("<The entered 2nd parameter '" + bad + "' is NOT 'reverse'.>");
        System.out.println("<The entered 2nd parameter '" + bad + "' was disregarded.>");
        System.out.println("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
        System.out.println("|");
    }

    private static void printParam3Error(String bad) {
        System.out.println("<The entered 3rd parameter '" + bad + "' is NOT 'distinct'.>");
        System.out.println("<The entered 3rd parameter '" + bad + "' is NOT 'reverse'.>");
        System.out.println("<The entered 3rd parameter '" + bad + "' was disregarded.>");
        System.out.println("<The 3rd parameter should be 'distinct' or 'reverse'.>");
        System.out.println("|");
    }

    private static void printParam4Error(String bad) {
        System.out.println("<The entered 4th parameter '" + bad + "' is NOT 'reverse'.>");
        System.out.println("<The entered 4th parameter '" + bad + "' was disregarded.>");
        System.out.println("<The 4th parameter should be 'reverse'.>");
        System.out.println("|");
    }
}
