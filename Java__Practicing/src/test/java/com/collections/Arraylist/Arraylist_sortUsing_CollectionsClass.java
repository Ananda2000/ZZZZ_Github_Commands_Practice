package com.collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_sortUsing_CollectionsClass 
{
	public static void main(String [] args)
	{
		int [] aa = {9,3,5,6};
		List<Integer> listt = new ArrayList<Integer>();
		int sizee = aa.length;
		
		for (int i = 0; i < aa.length; i++) {
			listt.add(aa[i]);
		}
		// Display of list data.....
		System.out.println(listt);
		Collections.sort(listt);
		for (Integer integer : listt) 
		{
			System.out.println(integer);
			
		}
	}

}
