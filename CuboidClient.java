
import java.util.*;
import java.util.ArrayList;

public class CuboidClient {
//Done by Alexander Mitchell for CSC 1302 lab final on April 20, 2017
	
	public static void main(String[] args) {
		ArrayList<Cuboid> cList = new ArrayList <Cuboid>();
		
		cList.add(new Cuboid(2,4,5));
		cList.add(new Cuboid(5,9,3));
		cList.add(new Cuboid(6,9,8));
		cList.add(new Cuboid(10,4,8));
		cList.add(new Cuboid(12,3,4));
		cList.add(new Cuboid(1,2,3));
		cList.add(new Cuboid(7,13,9));
		cList.add(new Cuboid(9,8,7));
		cList.add(new Cuboid(11,2,6));
		cList.add(new Cuboid(8,13,7));
		
		Collections.sort(cList);
		System.out.print(cList.toString());
		//cList.toString();
		
		

	}

}
