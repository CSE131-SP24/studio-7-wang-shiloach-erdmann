package studio7;

public class die {
	
	private int sides;
	
public die(int n) {
	this.sides = n;
}

public int integer() {
	return (int)(Math.random()*(sides)) + 1;
}

public static void main(String[] args) {
	die die1 = new die(100);
	System.out.println(die1.integer());
}

}