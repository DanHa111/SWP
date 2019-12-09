package sort;

import java.util.ArrayList;

public class InsertionSort {

	public static ArrayList<Integer> InsertionSort(ArrayList<Integer> List)	{
		while(!sorted(List))	{
			for (int i = 0; i < List.size(); i++) {
				if(List.get(i + 1) < List.get(i))	{
					
				}
			}
		}
		return List;
	}
	
	public static boolean sorted(ArrayList<Integer> List)	{
		for(int i = 1; i < List.size(); i++)	{
			if(List.get(i) < List.get(i - 1))	{
				return false;
			}
		}
		return true;
	}

	public static void printList(ArrayList<Integer> List)	{
		for(int i = 0; i < List.size(); i++)	{
			System.out.print(List.get(i) + ", ");

		}
		System.out.println();
	}
	
	public static ArrayList<Integer> randomList(int length, int bereich)	{
		ArrayList<Integer> List = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			List.add((int)(Math.random() * bereich));
		}
		return List;
	}

	public static void main(String[] args) {
		ArrayList<Integer> List = randomList(10, 100);
		printList(List);
		long time = System.currentTimeMillis();
		List = InsertionSort(List);
		time = System.currentTimeMillis() - time;
		printList(List);
		System.out.println();
		System.out.println("Zeit: " + time);
	}


}
