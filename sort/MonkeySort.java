  
package sort;

import java.util.ArrayList;

public class MonkeySort {
	
	public static ArrayList<Integer> shotgunSort(ArrayList<Integer> List)	{
		ArrayList<Integer> sortedList = List;
		ArrayList<Integer> used = new ArrayList<>();
		while(!sorted(sortedList))	{
			used = new ArrayList<>();
			sortedList = new ArrayList<>();
			for(int i = 1; i <= List.size(); i++)	{
				int x = -1;
				used.add(-1);
				while(in(x, used))	{
					x = (int)(Math.random()*List.size());
				}
				used.add(x);
				sortedList.add(List.get(x));
			}
		}
		return sortedList;
	}
	
	public static boolean sorted(ArrayList<Integer> List)	{
		for(int i = 1; i < List.size(); i++)	{
			if(List.get(i) < List.get(i - 1))	{
				return false;
			}
		}
		return true;
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
		List = shotgunSort(List);
		time = System.currentTimeMillis() - time;
		printList(List);
		System.out.println();
		System.out.println("Zeit: " + time);
	}

}