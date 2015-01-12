package CircularQueueTesting;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

import CircularQueue.CircularQueue;
import CircularQueue.ICircularQue;

public class CircularQueueTest {

	static ICircularQue m_queue = null;
	static int[] s_numArray;
	final int NUM_ARRAY_SIZE;
	
	public CircularQueueTest(){
		NUM_ARRAY_SIZE = 20;
		fillNumQueue();
	}
	
	public void fillNumQueue(){
		s_numArray = new int[NUM_ARRAY_SIZE];
		
		Random random = new Random();
		int i =0;
		while(++i < NUM_ARRAY_SIZE){
			s_numArray[i] = random.nextInt(1111) + 1;
		}
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		m_queue = new CircularQueue(10);	
	}

	public static void setUpAfterClass(){
		m_queue    = null;
		s_numArray = null;
	}
	
	
	@Test(timeout = 50000)
	public void pushTest(){
		final int ARRAY_SIZE = 20;
		Producer prod = new Producer(m_queue, s_numArray, ARRAY_SIZE);
		Thread producerThread = new Thread(prod);
		producerThread.start();
		
		try {
			producerThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prod.getCircularQueue().getSize());
		assertTrue(prod.getCircularQueue().getSize() == 10);

	}

}
