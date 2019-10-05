import java.util.Scanner;
public class Practiceindex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        char array[]=str.toCharArray();
        char ch='a';
        for(int i=0;i<str.length();i++)
        {
            if(array[i]==ch){
                System.out.println(i);
            }
        }

    }

}
