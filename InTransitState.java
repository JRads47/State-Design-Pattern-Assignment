//State Design Pattern Assignment by Jay-Rads Villanueva
public class InTransitState implements State
{
	public Package pkg;
	public InTransitState(Package p)
	{
		pkg=p;
	}
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is out for delivery");
	}
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive within 5 days");
	}
}
