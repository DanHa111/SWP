package sort;

import java.util.ArrayList;

public class BubbleSort {
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> List)	{
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

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(8);
		List.add(4);
		List.add(7);
		List.add(9);
		List.add(3);
		List.add(5);
		printList(List);
		List = bubbleSort(List);
		printList(List);
	}

}
