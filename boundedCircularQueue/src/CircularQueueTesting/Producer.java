package CircularQueueTesting;

import java.util.Random;
import CircularQueue.ICircularQue;

public class Producer implements Runnable{

		private final ICircularQue  m_queue;
		private int 		          m_nElToPush = 0;
		private final int[]			  m_numArray;	         		
		
		public Producer(ICircularQue _queue, int[] _numArray, int _numArraySize){
			m_queue     = _queue;
			m_nElToPush = _numArraySize;
			m_numArray	= _numArray;	
		}
		
		static void ProducerMsg(String _msg){
			String threadName = Thread.currentThread().getName();
			System.out.format("%s: %s%n", threadName, _msg);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			int indxInNumArray = 0; 
			
			while(indxInNumArray < m_nElToPush){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				int elToPush = m_numArray[indxInNumArray++];
				try {
					 
					 m_queue.pushElement(elToPush);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String msg ="pushed el = " + elToPush;
				ProducerMsg(msg);
			}
		}

		public ICircularQue getCircularQueue() {
			return m_queue;
		}
}


