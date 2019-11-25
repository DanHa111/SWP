package sort;

import java.util.ArrayList;

public class BubbleSort {
	
	public static ArrayList<Integer> BubbleSort(ArrayList<Integer> List)	{
		for(int i = 0; i < List.size() - 1; i++)	{
			for(int j = 0; j < List.size() - 1 - i; j++)	{
				if(List.get(j) > List.get(j + 1))	{
					int x = List.get(j);
					List.set(j, List.get(j + 1));
					List.set(j + 1, x);
				}
			}
		}
		return List;
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
		List = BubbleSort(List);
		time = System.currentTimeMillis() - time;
		printList(List);
		System.out.println();
		System.out.println("Zeit: " + time);
	}

}