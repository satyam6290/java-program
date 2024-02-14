import java.util.Scanner;
class matrix{
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter arrays elements for matrix 1:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
              a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter arrays elements for matrix 2:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
              b[i][j]=s.nextInt();
			}
		}
		System.out.println("the matrix 1 elements are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
             System.out.print(a[i][j]+" ");
			}
             System.out.print("\n");
		}
		System.out.println("the matrix 2 elements are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
             System.out.print(b[i][j]+" ");
			}
             System.out.print("\n");
		}
		System.out.println("the sum of  matrix elements are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
           c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+" ");
			}
             System.out.print("\n");
		}
	}
}