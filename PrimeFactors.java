import java.util.Scanner;
public class PrimeFactors {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        PrimeFactors ob=new PrimeFactors();
        ob.generate(num);

    }
     void generate(int n)
    {
        while(n%2==0)
        {
            System.out.print("2");
            n/=2;
        }

            for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
                while(n % i == 0)
                {
                    System.out.print(" " + i);
                    n = n / i;
                }

            }
            if (n > 2)
                System.out.print(" " + n);

    }
}
