import java.util.Scanner;
public class strgetprt {
    public static void main(String[] arg)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Name:\t");
        String n=scan.nextLine();
        System.out.print("Enter your Rank:\t");
        int r=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Father Name:\t");
        String f=scan.nextLine();
        System.out.println("Welcome to Our College");
        System.out.println(n);
        System.out.println(r);
        System.out.println(f);

        scan.close();
    }
}
