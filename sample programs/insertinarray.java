import java.util.Scanner;
class insertinarray{
	public static void main(String[] args) {
		int size,loc,item,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size=s.nextInt();
		int a[]=new int[size+1];
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the location:");
		loc=s.nextInt();
		System.out.println("enter new elements:");
		item=s.nextInt();
		for(i=size;i>loc;i--)
		{
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		System.out.println("the elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}

	}
}