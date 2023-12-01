import java.util.Scanner;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line:");
        String line = scanner.nextLine();

        System.out.println("Enter the character to find:");
        char targetChar = scanner.next().charAt(0);

        int occurrenceCount = countCharacterOccurrence(line, targetChar);

        System.out.println("Occurrence of '" + targetChar + "': " + occurrenceCount);
    }

    private static int countCharacterOccurrence(String text, char targetChar) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}
