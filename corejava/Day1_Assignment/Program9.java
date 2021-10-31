package Assignment;
import java.util.Arrays;
public class Program9 {

	public static void main(String[] args) {
		int element = 0,max_count=1, count=1;
	    
	    //initial array
	    int arr[] = {2, 4, 6, 4, 2, 4, 5, 8};
	    
	    //sort array in the ascending Order
	    Arrays.sort(arr);
	    
	    //loop through the array elements
	    for(int i=1; i<arr.length; i++){
	        //count the successive elements as long as they are same
	        if(arr[i] == arr[i-1])
	            count++;
	        else{
	            //compare the count with max_count
	            if(count>max_count){
	                //update if count is greater
	                max_count = count;
	                element = arr[i-1];
	            } 
	            //reset count to 1
	            count =1;
	        }
	    }
	    
	    //output the most repeated element along with the count
	    System.out.println("The number" +element+" is repeated "+max_count+"times");    

	}

}
