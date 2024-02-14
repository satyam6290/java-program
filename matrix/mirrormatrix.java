import java.util.Scanner;
class matrix{
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter arrays elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
              a[i][j]=s.nextInt();
			}
		}
		System.out.println("the matrix elements are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
             System.out.print(a[i][j]+" ");
			}
             System.out.print("\n");
		}
	
    System.out.println("the mirror matrix elements are:");
		for(int i=0;i<2;i++)
		{
			for(int j=1;j>=0;j--)
			{
             System.out.print(a[i][j]+" ");
			}
             System.out.print("\n");
		}
    }
}