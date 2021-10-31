package Assignment;
//java program to test if an array contains a specific value
public class Program5 {

	public static void main(String[] args) {
		
		int[]  arr = {2,4,6,8,10};
		int key= 6;
		//loop through the array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			if( key==arr[i])
			{
				System.out.println("Key is " +key+" found at index :"+i);
			    System.exit(0);
			}

		}
		System.out.println("Key not found");

	}

}
