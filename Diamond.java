import java.util.Scanner;

public class Diamond {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int nu = sc.nextInt();
        Diamond ob=new Diamond();
        ob.diamond(nu);
    }

    void diamond(int n)
    {
        int space,i,ask;
        for( i=0,space=n-1,ask=1;i<n-1;i++,space--,ask=ask+2)
        {

            for(int j=0;j<space;j++)
            {

                System.out.print(" ");
            }
            for(int k=0;k<ask;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for( i=0,space=1,ask=ask-2;i<n-1;i++,space++,ask=ask-2)
        {

            for(int j=0;j<space;j++)
            {

                System.out.print(" ");
            }
            for(int k=0;k<ask;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
