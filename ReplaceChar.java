import java.util.Scanner;
public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter index to replace: ");
        int index = sc.nextInt();
        System.out.print("Enter the character to replace with: ");
        char replacementChar = sc.next().charAt(0);
        String resultString = replaceCharacterAtIndex(inputString, index, replacementChar);
        System.out.println("Resulting string after replacement: " + resultString); 
        sc.close();
    }
    
    public static String replaceCharacterAtIndex(String input, int index, char replacement) {
        if (index < 0 || index >= input.length()) {
            System.out.println("Index out of bounds!");
            return input;
        }
        char[] chars = input.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}
