import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char str[] = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                System.out.println("\t*");
            } else {
                System.out.println("\t"+str[i]);
            }
        }
    }
}
