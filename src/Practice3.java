import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString = scanner.nextLine();
        char character[] = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            if (character[i] == 'a' || character[i] == 'e' || character[i] == 'i' || character[i] == 'o'
                    || character[i] == 'u') {
                System.out.print(inputString.replace(character[i],'='));
            }
        }
    }
    }


