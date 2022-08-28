// Java program to find maximum amount of water that can
// be trapped within given set of bars.

class q15 { 
	// Method for maximum amount of water
public static int findWater (int arr[])
	{
        int n = arr.length;
		// left[i] contains height of tallest bar to the
		// left of i'th bar including itself
		int left[] = new int[n];

		// Right [i] contains height of tallest bar to
		// the right of ith bar including itself
		int right[] = new int[n];

		// Initialize result
		int water = 0;

		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		// Calculate the accumulated water element by
		// element consider the amount of water on i'th bar,
		// the amount of water accumulated on this
		// particular bar will be equal to min(left[i],
		// right[i]) - arr[i] .
		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - arr[i];

		return water;
	}

	// Driver method to test the above function
public static void main(String[] args)
	{
        int arr[] = new int[] {4,2,0,3,2,5};

		System.out.println(findWater(arr));

        // Time Complexity: O(N). Only one traversal of the array is needed, So time Complexity is O(N).
        // Space Complexity: O(N). Two extra arrays are needed, each of size N.
	
    }
}
