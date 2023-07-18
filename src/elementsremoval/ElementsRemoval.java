package elementsremoval;

import java.util.Scanner;

public class ElementsRemoval {

	public static int elementsRemoval(int array[],int size) {
		int cost = 0;
		for (int i = 0; i < size; i++){  
			for (int j = i + 1; j < size; j++) {  
				int temp = 0;  
				if (array[i] > array[j])   
				{  
					temp = array[i];  
					array[i] = array[j];  
					array[j] = temp;  
				}  
			}  
		}
		for(int i =0;i<size;i++) {
			cost += array[i]*(i+1);
		}
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = elementsRemoval(array,n);
		System.out.println(results);
	}
}
