package sort;

import java.util.ArrayList;

public class QuickSort {
	
	public static ArrayList<Integer> quickSort(ArrayList<Integer> List)	{
		if(List.size() <= 1)	{
			return List;
		}
		ArrayList<Integer> smaller = new ArrayList<Integer>();
		ArrayList<Integer> bigger = new ArrayList<Integer>();
		int x = (int)(Math.random()*List.size());
		for(int i = 0; i < List.size(); i++)	{
			if(List.get(i) >= List.get(x))	{
				bigger.add(List.get(i));
			} else	{
				smaller.add(List.get(i));
			}
		}
		quickSort(smaller).addAll(quickSort(bigger));
		return smaller;
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
		List = quickSort(List);
		printList(List);
	}

}
