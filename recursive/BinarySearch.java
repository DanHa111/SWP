package recursive;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	
	public static int binarySearch(int gesuchteZahl, List<Integer> sortierteZahlenliste)	{
		int index = sortierteZahlenliste.size() / 2;
		if(gesuchteZahl == sortierteZahlenliste.get(index))	{
			return index;
		}
		if(sortierteZahlenliste.size() == 1)	{
			return -1;
		}
		if(gesuchteZahl > sortierteZahlenliste.get(index))	{
			int rueckgabe = binarySearch(gesuchteZahl, sortierteZahlenliste.subList(index, sortierteZahlenliste.size()));
			if(rueckgabe == -1)	{
				return -1;
			}
			return index + rueckgabe;
		}
		int rueckgabe = binarySearch(gesuchteZahl, sortierteZahlenliste.subList(0, index));
		if(rueckgabe == -1)	{
			return -1;
		}
		return rueckgabe;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = new ArrayList<>();
		liste.add(2);
		liste.add(2); 
		liste.add(3); 
		liste.add(4); 
		liste.add(4);
		liste.add(4);
		liste.add(5); 
		liste.add(6); 
		liste.add(7); 
		liste.add(8);
		System.out.println(binarySearch(8, liste));
	}

}
