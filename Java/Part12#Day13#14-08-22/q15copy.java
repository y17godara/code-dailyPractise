

class Solution { 
    
	// Method for maximum amount of water
public static int trap(int height[])
	{
        int n = height.length;

		int left[] = new int[n];
		int right[] = new int[n];

		// Initialize result
		int water = 0;

		// Fill left array
		left[0] = height[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], height[i]);

		// Fill right array
		right[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], height[i]);


		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - height[i];

		return water;
	}

public static void main(String[] args)
	{
        int height[] = new int[] {4,2,0,3,2,5};

		System.out.println(trap(height));

        // Time Complexity: O(N). Only one traversal of the array is needed, So time Complexity is O(N).
        // Space Complexity: O(N). Two extra arrays are needed, each of size N.
	
    }
}
