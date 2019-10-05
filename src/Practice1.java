import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String inputString=scanner.nextLine();
        int length=inputString.length();
        for(int i=0;i<length;i++){
            System.out.print("\t"+i);
        }
        System.out.print("\n");
        for(int j=0;j<length;j++){
            System.out.print("\t"+inputString.charAt(j));
        }
    }
}
