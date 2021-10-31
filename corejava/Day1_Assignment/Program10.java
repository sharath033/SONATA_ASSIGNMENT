package Assignment;
//program to print the 2 largest numbers in the array(neglect the duplicate value)
public class Program10 {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		System.out.println("The array elements are :\n");
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " \n");  
        }  
        
       int largest1 = arr[0];
       int largest2 = arr[1];
       
       if(largest1>largest2) {
    	   int temp =largest1;
    	   largest1 =largest2;
    	   largest2 =temp;
       }
       for(int i=2;i< arr.length;i++) {
    	   if(arr[i] > largest1) {
    		   largest2 =largest1;
    		   largest1 =arr[i];
    	   }
    	   else if (arr[i] > largest2 && arr[i] != largest1)
    	   {
    		   largest2 =arr[i];
    	   }
       
       }
       System.out.println("\nThe First Largest Number in array : \n"+largest1);
       System.out.println("The Second Largest Number in array : \n"+largest2);
       
	}

}
