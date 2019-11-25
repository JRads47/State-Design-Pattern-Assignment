//State Design Pattern Assignment by Jay-Rads Villanueva
public class Package
{
	public String name;
	public State orderedState;
	public State inTransitState;
	public State deliveredState;
	public State state;
	public Package(String contents)
	{
		name=contents;
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
	}
	public String getName()
	{
		return name;
	}
	public void setState(State state)
	{
		this.state=state;
	}
	public void order()
	{
		state=orderedState;
		state.displayStatus();
		state.displayETA();
	}
	public void mail()
	{
		state=inTransitState;
		state.displayStatus();
		state.displayETA();
	}
	public void received()
	{
		state=deliveredState;
		state.displayStatus();
		state.displayETA();
	}
}
