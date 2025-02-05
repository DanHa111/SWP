package sort;

import java.util.ArrayList;

public class SelectionSort {
	
	public static ArrayList<Integer> SelectionSort(ArrayList<Integer> List)	{
		ArrayList<Integer> newList = new ArrayList<>();
		int biggest = getBiggest(List);
		for(int i = 0; i < List.size(); i++)	{
			int smallest = biggest;
			for(int j = 0; j < List.size(); j++)	{
				if(List.get(j) < smallest && !in(List.get(j), newList))	{
					smallest = List.get(j);
				}
			}
			newList.add(smallest);
		}
		return newList;
	}
	
	public static int getBiggest(ArrayList<Integer> List)	{
		int biggest = List.get(0);
		for(int i = 0; i < List.size(); i++)	{
			if(List.get(i) > biggest)	{
				biggest = List.get(i);
			}
		}
		return biggest;
	}
	
	public static boolean in(int i, ArrayList<Integer> numbers)	{
		for (int j = 0; j < numbers.size(); j++) {
			if(i == numbers.get(j))	{
				return true;
			}
		}
		return false;
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
		List = SelectionSort(List);
		time = System.currentTimeMillis() - time;
		printList(List);
		System.out.println();
		System.out.println("Zeit: " + time);
	}

}