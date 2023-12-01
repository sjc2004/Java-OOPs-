import java.util.Scanner;

public class CharacterWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        int charCount = countCharacters(paragraph);
        int wordCount = countWords(paragraph);

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
    }

    private static int countCharacters(String text) {
        return text.length();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
