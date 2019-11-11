package sort;

import java.util.ArrayList;

public class SelectionSort {
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> List)	{
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

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(8);
		List.add(4);
		List.add(7);
		List.add(9);
		List.add(3);
		List.add(5);
		printList(List);
		List = selectionSort(List);
		printList(List);
	}

}
