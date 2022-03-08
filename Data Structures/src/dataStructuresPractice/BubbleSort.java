package dataStructuresPractice;

public class BubbleSort {
	
	public static void BubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
	}

	     
	void printarray(int arr[])
			{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			System.out.println();
		}
			}
	
	
	public static void main(String[] args) {
		 
		BubbleSort ob = new BubbleSort();
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		ob.BubbleSort(arr);
		System.out.println("Sorted Array :");
		ob.printarray(arr);

	}

}
