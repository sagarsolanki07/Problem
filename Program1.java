import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Haystack String");
        String A = sc.nextLine();
        System.out.println("Enter Needle String");
        String B = sc.nextLine();
        int index  = A.indexOf(B);
        System.out.println("index of first occurence of needle: " + index);
    }
}