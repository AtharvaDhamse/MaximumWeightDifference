import java.util.Arrays;

public class MaxWeightDiff 
{
	public static int solve(int arr[], int n, int k)
	{
		//Sorting the array to make it easy to find weights in ascending order
		Arrays.sort(arr);
		int sonWeight = 0;
		int chefWeight = 0;
		
		//k is total number of weights carried by Son
		for(int i=0; i<k; i++)
		{
			sonWeight = sonWeight + arr[i];
		}
		
		for(int j=k; j<n; j++)
		{
			chefWeight = chefWeight + arr[j];
		}
		
		//returning the difference
		return Math.abs(chefWeight - sonWeight);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int k=2;
		int array[] = {8,4,5,2,10};
		
//		int k = 3;
//		int array[] = {1,1,1,1,1,1,1,1};
		int n = array.length;
		System.out.println("Total difference between the weights carried by Chef and his son is: ");
		System.out.println(solve(array, n, k));
	}

}
