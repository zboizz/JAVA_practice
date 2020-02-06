package ch03;

import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
 
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
 
        for(int i : arrayList)
        {
            System.out.println("°ª : " + i );
        }
    }
}
