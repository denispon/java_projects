package CircularQueueTesting;

import CircularQueue.ICircularQue;

public class Consumer implements Runnable {
	
	private ICircularQue  m_queue;
	private int 		  m_nPopedEls = 0;	
	private int[]		  m_numArray;	
	
	public int[] getNumArray() {
		return m_numArray;
	}

	public Consumer(ICircularQue _queue, int[] _numArray, int _numArraySize){
		m_queue     = _queue;
		m_nPopedEls = _numArraySize;
		m_numArray  = new int[_numArraySize];
	}
	
	static void ConsumerMsg(String _msg){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, _msg);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i < m_nPopedEls){
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int el = 0;
			
			try {
				el = m_queue.popElement();
				m_numArray[i++] = el;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String msg ="poped el = " + el;
			ConsumerMsg(msg);
		}
	}
	
}
		

