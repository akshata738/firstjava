
public class NextgenArray <T> {
	T[] elements;

	public NextgenArray(T[] elements) {
		super();
		this.elements = elements;
	}
	public T get(int index) {
		return this.elements[index - 1];
	}
    public void set(int index,T elements) {
    this.elements[index - 1] = elements;
    }
    
    @Override
    public String toString() {
    	String result = "";
    	for (int i=0; i<this.elements.length;i++) {
    		result += this.elements[i];
    		if(i != this.elements.length-1) {
    			result+=",";
    		}
    	 
    	}
    	return result;
    	
    	
    }
}
