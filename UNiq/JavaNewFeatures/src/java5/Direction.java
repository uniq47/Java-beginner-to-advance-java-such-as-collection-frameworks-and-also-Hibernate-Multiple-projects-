package java5;

public enum Direction {

	NORTH(9),SOUTH(3),WEST(2);
	
	final static int [] ar = {5,4,6,2};
	
	private int value;
	Direction(int value)
	{
		this.value= value; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Direction d = Direction.NORTH;
		System.out.println(d);
	}

}
