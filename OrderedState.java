//State Design Pattern Assignment by Jay-Rads Villanueva
public class OrderedState implements State
{
	public Package pkg;
	public OrderedState(Package p)
	{
		pkg=p;
	}
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" was ordered");
	}
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days");
	}
}
