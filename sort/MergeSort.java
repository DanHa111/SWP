package sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static List<Integer> mergeSort(List<Integer> List)	{
		if(List.size() <= 1)	{
			return List;
		}
		List<Integer> left = List.subList(0, List.size()/2);
		List<Integer> right = List.subList(List.size()/2, List.size());
		return sort(mergeSort(left), mergeSort(right));
	}
	
	private static ArrayList<Integer> sort(List<Integer> left, List<Integer> right)	{
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i + j <= left.size() + right.size())	{
			if(left.size() == i)	{
				list.addAll(right.subList(j, right.size()));
				return list;
			}
			if(right.size() == j)	{
				list.addAll(left.subList(j, left.size()));
				return list;
			}
			
			if(left.get(i) <= right.get(j))	{
				list.add(left.get(i));
				i++;
			} else	{
				list.add(right.get(j));
				j++;
			}
		}
		return list;
	}
	
	public static void printList(List<Integer> List)	{
		for(int i = 0; i < List.size(); i++)	{
			System.out.print(List.get(i) + ", ");

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Integer> List = new ArrayList<>();
		List.add(8);
		List.add(4);
		List.add(7);
		List.add(9);
		List.add(3);
		List.add(5);
		printList(List);
		List = mergeSort(List);
		printList(List);
	}

}
