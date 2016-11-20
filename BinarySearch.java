package binarySearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args){
		int mid,low,high;
		int[] array = {1,4,12,22,36,48,49,57,60,73,79,82};
		Scanner sc = new Scanner(System.in);
		
		low = 0;//lower bound
		high = array.length-1;//upper bound
		int x = sc.nextInt();
		
		do{
			mid = low + (high-low)/2;
			
			if (array[mid] == x){
				System.out.println(x+" is at "+(mid+1));
				return;
			}
			
			else{
				if (array[mid] > x) high = mid-1;
				else low = mid+1;
			}
		}while(low<=high);
		
		System.out.println("data not found");
		
		/*binarySearch is the way searching data by always comparing the middle
		 * of the sorted range with data, if it's larger than data, then change the
		 * index of upper bound into middle, otherwise, change the index of lower
		 * bound into middle
		 */
		
		/*binarySearch only can be applied on sorted(in order) array,
		 * otherwise it'll result in wrong consequence
		 */
	}
}
