
public class Cuboid implements Comparable<Cuboid> {
	
	//Done by Alexander Mitchell for CSC 1302 lab final on April 20, 2017
	
	private int length;
	private int width;
	private int height;
	
	public Cuboid(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	//Setting my variables
	
	public void setLength(int length){
		this.length = length;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	
	// Getting my variables
	
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	// Area
	
	public int CuboidArea(){
		return 2*((length*width)+(width*height)+(height*length));
	}
	
	//Comparing my area,length,width, and height
	
	public int compareTo(Cuboid other) {
		if(this.CuboidArea()<other.CuboidArea()){
			return -1;
		} else if(this.CuboidArea()>other.CuboidArea()){
			return 1;
		}else if(this.getLength()<other.getLength()){
			return -1;
		} else if(this.getLength()>other.getLength()){
			return 1;
		} else if(this.getWidth()<other.getWidth()){
			return -1;
		} else if(this.getWidth()>other.getWidth()){
			return 1;
		} else if(this.getHeight()<other.getHeight()){
			return -1;
		} else if(this.getHeight()<other.getHeight()){
			return 1;
		} else{
			return 0;
		}
		
		
	}

	public String toString()
	{
		return "The area is :"+this.CuboidArea()+" The length is: "+length+" The width is: "+width+" The height is: "+height+"\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
