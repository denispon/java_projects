package CircularQueue;

public class CircularQueue implements ICircularQue {
	
	private int   		m_nElements  		= 0;
	private final int   MAX_CAPACITY;
	private final int[]	m_array;
	private int   		m_indxToPush 		= 0;	
	private int   		m_indxToPop  		= 0;
	
	Object 		  		m_hasAnyCond 	   	= new Object();
	Object        		m_hasEmptyPlaceCond = new Object();
	
	public CircularQueue(){
		this(64);
	}
	
	public CircularQueue(int _maxCapacity){
		MAX_CAPACITY = _maxCapacity;
		m_array		 = new int[MAX_CAPACITY];	
	}
	
	
	/* (non-Javadoc)
	 * @see multThrededCyclicQueue.ICircularQue#pushElement(int)
	 */
	@Override
	public void pushElement(int _elem) throws InterruptedException{
		/* synchronized(this) statement should be into synchronized(m_hasEmptyPlaceCond)
		 * to synchronize reading and writing of m_nElements
		 *  
		 * */
		synchronized(m_hasEmptyPlaceCond){	
			while(m_nElements == MAX_CAPACITY){
				m_hasEmptyPlaceCond.wait(); 
			}
			
			synchronized(this){
				m_array[m_indxToPush++] = _elem;
				m_indxToPush %= MAX_CAPACITY;
				++m_nElements; 
			}
		}

		
		synchronized(m_hasAnyCond){
			m_hasAnyCond.notifyAll();
		}
		
		
	}
	
	/* (non-Javadoc)
	 * @see multThrededCyclicQueue.ICircularQue#popElement()
	 */
	@Override
	public int popElement() throws InterruptedException{
		int elToPop = 0;
		synchronized(m_hasAnyCond){
			while(m_nElements == 0){
				m_hasAnyCond.wait();
			}
			
			synchronized(this){
				elToPop = m_array[m_indxToPop++];
				m_indxToPop %= MAX_CAPACITY;
				--m_nElements;
			}
		}
		
		synchronized(m_hasEmptyPlaceCond){
			m_hasEmptyPlaceCond.notifyAll();
		}
		return elToPop;
	}
	
	public void printCircularQueue(){
		int elToPrint = m_indxToPop;
		
		if(m_nElements == 0){
			return;
		}
		
		if(elToPrint == m_indxToPush){
			System.out.println(m_array[elToPrint++]);
		}
		
		while(elToPrint > m_indxToPush){
			System.out.println(m_array[elToPrint++]);
			elToPrint %= MAX_CAPACITY;
		}
		
		while(elToPrint < m_indxToPush){
			System.out.println(m_array[elToPrint++]);		
		}
	}

	@Override
	public boolean isQueueEmpty() {
		// TODO Auto-generated method stub
		return m_nElements == 0 ? true : false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return m_nElements;
	}
}

