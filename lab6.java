import java.util.*;

public class lab6 {
//Done by Alexander Mitchell for CSC 1302 on February 16, 2017

	
	public static void main(String[] args) {
		
		int[] put = {4,7,9,2,7,7,5,3,5,1,7,8,6,7}; //Using the values from the lab doc.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//Putting the elements from put into list. 
		for (int i = 0; i < put.length; i++) {
			list.add(put[i]);
		}
		
		int[] put2 = {4,7,9,2,8,7,5,6,5,1,4,8,6,7};
		
		for (int i = 0; i < put2.length; i++) {
			list2.add(put2[i]);
		}
		
		
		System.out.println(list); // I want to check the list.
		maxToLast(list); // I want to check my mTL method
		filterRange(list, 7, 5); //I want to check my fR method
		System.out.println(union(list, list2));
		
		
	}
	
	
	public static void maxToLast(ArrayList<Integer> list) {
		int max = 0;
		int pos = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)> max){
				max = list.get(i);
				pos = i;
			}
		}
		/* I now have the max value and the position.
		 * Now I need to remove it and add it to the back. I have done this with the following statements below.
		 * For Me: list.size() because it is a method.
		*/
		list.remove(pos);
		list.add(list.size(),max);
		System.out.println(list);
		
	}
	
	public static void filterRange(ArrayList<Integer> list, int max, int min) {
		
		for(int i = 0; i < list.size(); i++) {
			if((list.get(i)>= min) && (list.get(i)<=max)) 
			{
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		
		
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list,ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		
		while (i<list.size()&&j<list2.size()) {
			if(list.get(i)==list2.get(j)) {
				list3.add(list.get(i));
				i++;
				j++;
			} else if(list.get(i)>list2.get(j)) {
				list3.add(list2.get(j));
				j++;
			} else {
				list3.add(list.get(i));
				i++;
			}
		}
		while(i<list.size()){
			list3.add(list.get(i));
			i++;
		}
		while(j<list2.size()){
			list3.add(list2.get(j));
			j++;
		}
		return list3;
		
		
	}

}
