import java.util.Scanner;
public class Practice10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String name=sc.nextLine();
        char c='a';
        System.out.println(name.indexOf(c));
    }
}
