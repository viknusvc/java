import java.util.Scanner;


public class calc {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the First Value:");
        int a=scan.nextInt();
        System.out.println("Enter the Second Value:");
        int b=scan.nextInt();
        int c=a+b;
        System.out.println("The Addition Answer is \t"+ c);
        int d=a-b;
        System.out.println("The Subraction Answer is \t"+ d);
        int e=a*b;
        System.out.println("The Multip Answer is \t"+ e);
        int f=a/b;
        System.out.println("The Divi Answer is \t"+ f);
       scan.close(); 
    }
    
}
