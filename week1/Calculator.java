package week1;

public class Calculator {
int fno;
int sno;
int total;

void add()
{
	int total = fno+ sno;
	System.out.println(total);
}

void sub()
{
	int total = fno- sno;
	System.out.println(total);
}

void mul()
{
	int total = fno * sno;
	System.out.println(total);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calculator c = new Calculator();
	c.fno = 4;
	c.sno= 6;
	c.mul();
	c.add();
	c.sub();
	
	}

}