//State Design Pattern Assignment by Jay-Rads Villanueva
public class DeliveredState implements State
{
	public Package pkg;
	public DeliveredState(Package p)
	{
		pkg=p;
	}
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is here for you");
	}
	public void displayETA()
	{
		System.out.println(pkg.getName()+" is here");
	}
}
