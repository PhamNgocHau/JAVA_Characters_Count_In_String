import java.util.Scanner;

public class CharacterCountInString {
    public static void main(String[] args) {
        String characters;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Character: ");
        characters = sc.nextLine();

        countCharacter(characters, 'a');

        System.out.println("The number of occurrences Characters in String: "
                + countCharacter(characters, 'a'));
    }

    public static int countCharacter(String characters, char characterToCount) {
        int count = 0;
        for (int i = 0; i < characters.length(); i++) {
            if (characters.charAt(i) == characterToCount) {
                count++;
            }
        }
        return count;
    }
}
