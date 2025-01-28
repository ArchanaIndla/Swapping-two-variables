import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        sc.close();
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
