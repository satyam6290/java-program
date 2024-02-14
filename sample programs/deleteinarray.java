import java.util.Scanner;
class B{
	public static void main(String[] args) {
		int size,loc,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size=s.nextInt();
		int a[]=new int[size+1];
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the location whic you want to delete:");
		loc=s.nextInt();
		
		for(i=loc;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		
		size--;
		System.out.println("the new array elements :");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}

	}
}