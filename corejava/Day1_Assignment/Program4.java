package Assignment;
//java program to calculate the sum of an array
public class Program4 {

	public static void main(String[] args) {
		int a[] = new int [6];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		int sum = 0;
		System.out.println("The elements in the array are : ");
		for( int num : a) {
			
			System.out.println(+num);
		}
		for( int num : a) {
			
			sum += num;
		}
		System.out.println("The sum of elements in the array is :" +sum);
		

	}

}
