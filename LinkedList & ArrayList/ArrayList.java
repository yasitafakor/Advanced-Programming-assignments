package List;

public class ArrayList {

	private int arrayLength = 1;
	private int[] array = new int[arrayLength];
	private int tail = -1;
	
	public void insert(int data, int index) {
		if(index > tail + 1 || index < 0) {
			throw new IllegalArgumentException("IndexOutOfBound");
		} else{
			if (tail == arrayLength - 1){
				expand();
			}
			shiftForward(index);
			array[index] = data;
			tail += 1;
		}
	}
	
	private void shiftForward(int index) {


		if(getTail() == arrayLength - 1) {
			expand();
		}
		
		for(int i = getTail(); i > index ; i--) {
			array[i] = array[i - 1];
		}
		
	}

	private void expand() {
		int[] a = new int[arrayLength];
		
		for(int i = 0 ; i< arrayLength;i++)
			a[i] = array[i];
		
		array = new int[2 * arrayLength];
		
		for(int i = 0 ; i< arrayLength; i++)
			array[i] = a[i];
		
		arrayLength *= 2;
	}
	
	public void delete(int index){
		
		if(index > tail || index<0 ) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}else {
			shiftBackward(index);
			tail--;
		}

		
	}
	
	private void shrink() {
	    if (arrayLength == 1) 
	    	return;
	    
		int[] a = new int[arrayLength];
		
		for(int i = 0 ; i<= tail;i++)
			a[i] = array[i];
		
		array = new int[arrayLength/2];
		
		for(int i = 0 ; i<=tail; i++)
			array[i] = a[i];
		
		arrayLength /= 2;
	}

	private void shiftBackward(int index) {
	    //TODO
		
		for(int i = index; i <= tail; i++) {
			array[i] = array[i + 1];
		}
		
		if(tail <= arrayLength/4) {
			shrink();
		}
		
	}
	
	void replace(int data, int index) {
		
		if(index > tail || index<0) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}
		
		array[index] = data;
	}
	
	public int getData(int index) {
		
		if(index >tail || index <0) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}
		
		return array[index];
	}
	
	public void setArrayLength(int n) {
		this.arrayLength = n;
	}
	
	public int getArrayLength() {
		return this.arrayLength;
	}
	
	public void setArray(int[] arr) {
		this.array = arr;
	}
	
	public int[] getArray() {
		return this.array;
	}
	
	public void setTail(int n) {
		this.tail = n;
	}
	
	public int getTail() {
		return this.tail;
	}
	
	
}
