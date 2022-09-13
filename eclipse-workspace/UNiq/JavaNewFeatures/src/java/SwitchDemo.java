package java;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String game = "Cricket";
		switch(game)
		{
		
		case "Hockey":
		case "Football":
			System.out.println("Lets play outdoor game");
		break;
		
		case "Cricket":
			System.out.println("lets play cricket");
		break;
		default:
			System.out.println("Choose Any one of it ");
			
		
		}
	}

}
