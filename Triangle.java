import java.util.Scanner;

public class Triangle {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        Triangle ob=new Triangle();
        ob.isoscelesTriangle(num);
    }

    void isoscelesTriangle(int n)
    {

            int space,i,ask;
            for( i=0,space=n-1,ask=1;i<n;i++,space--,ask=ask+2)
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
