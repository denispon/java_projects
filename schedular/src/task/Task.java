package task;

public class Task implements ITask
{
	private final float interval;
	private Status   	status; //TODO:Status is enum, can be Success, Error, Finish
	private Timer 		timer;
	
	
	public Task(final float interval)
	{
		this.interval = interval;
		status = Status.BeforeStart;
	}
	
	public Status execute()
	{
		
		return status;
		
	}

	@Override
	public int compareTo(ITask o) 
	{
		
		return 0;
	}

	@Override
	public int compare(ITask arg0, ITask arg1)
	 {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
