package task;

import java.util.Comparator;

public interface ITask extends Comparable<ITask>, Comparator<ITask>
{
	
	public Status execute();	

}
