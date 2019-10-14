package sort;

import java.util.ArrayList;

public class AndereVariante {
	
	public static ArrayList<Integer> anderesSort(ArrayList<Integer> List, int range)	{
		ArrayList<Integer> sortedList = new ArrayList<>();
		int smaller = -1 * range;
		int x = range;
		
		for(int i = 0; i < List.size(); i++)	{
			for(int j = 0; j < List.size(); j++)	{
				if(smaller < List.get(j) && List.get(j) < x)	{
					x = List.get(j);
				}
			}
			sortedList.add(x);
			smaller = x;
			x = 100;
		}
		
		return sortedList;
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
		List = anderesSort(List, 100);
		printList(List);
	}

}
