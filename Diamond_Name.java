import java.util.Scanner;

public class Diamond_Name {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        Diamond_Name ob=new Diamond_Name();
        ob.diamond2(num);
    }

    void diamond2(int n)
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
        System.out.println("Priyanka");
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
