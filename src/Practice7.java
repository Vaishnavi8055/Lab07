import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scanner.nextLine();
        char character[] = name.toCharArray();
        int length = name.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int a = (int) character[i];
            sum = sum + a;
        }
        System.out.println("Total Weight=" + sum);
    }
}
