package sort;

import java.util.ArrayList;

public class InsertionSort {

	public static ArrayList<Integer> insertionSort(ArrayList<Integer> List)	{
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(List.get(0));
		for(int i = 1; i < List.size(); i++)	{
			for(int j = 0; j < newList.size(); j++)	{
				if(List.get(i) < newList.get(j) || j == newList.size() - 1)	{
					newList.add(j, List.get(i));
					break;
				}
			}
		}
		return newList;
	}

	public static void printList(ArrayList<Integer> List)	{
		System.out.println();
		for(int i = 0; i < List.size(); i++)	{
			System.out.print(List.get(i) + ", ");
		}
		System.out.println();
		System.out.println(List.size());
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
		List = insertionSort(List);
		time = System.currentTimeMillis() - time;
		printList(List);
		System.out.println();
		System.out.println("Zeit: " + time);
	}


}
