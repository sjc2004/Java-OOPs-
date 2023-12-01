public class DisplayStringInLines {
    public static void main(String[] args) {
        // Check if both the number and string are provided as command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java DisplayStringInLines <number> <string>");
            return;
        }

        // Parse the first argument as an integer (number of lines)
        int numberOfLines;
        try {
            numberOfLines = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: The first argument must be a valid integer.");
            return;
        }

        // Extract the string from the second argument
        String inputString = args[1];

        // Display the string in the specified number of lines
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(inputString);
        }
    }
}
//java DisplayStringInLines 3 "Hello, World!"
