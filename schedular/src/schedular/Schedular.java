package schedular;

import java.util.PriorityQueue;

import task.ITask;

public class Schedular
{
	
	private final PriorityQueue<ITask> queue;
	
	public Schedular(int initialCapacity)
	{
		queue = new PriorityQueue<ITask>(initialCapacity);
	}
	
	/* add task to Scheduler.
	 * on success: returns unique task id > 0 created by scheduler 
	 * on fail  : returns -1
	 * 
	 * */
	public int addTask(ITask task)
	{
		return -1;
	}
	
	/*
	 *  remove task specified by id from scheduler only if task is not in the middle of executing.
	 *  If there is task in execution - make it to finish the current iteration
	 *  on success: returns true
	 *  on fail   : returns false
	 * */
	public boolean remoteTaskFromSchedular(final int taskid )
	{
		return false;	
	}
	
	/*
	 *  remove all tasks from scheduler. If there is task in execution - make it to finish the current iteration
	 *  on success: returns true
	 *  on fail   : returns false
	 * */
	public boolean remoteAllTaskFromSchedular()
	{
		return false;
	}
	
	/*
	 * returns number of task that failed
	 */
	public int start()
	{
		return 0;
	}
	
	private void printToLog()
	{
		
	}
	
	private void makeStatistic()
	{
		
	}
}
