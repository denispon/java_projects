package CircularQueue;

public interface ICircularQue {

	public abstract void pushElement(int _elem) throws InterruptedException;

	public abstract int popElement() throws InterruptedException;
	
	public abstract boolean isQueueEmpty();
	
	public abstract int getSize();

}