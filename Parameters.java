/**
 * The Parameters class is a container class of two queues. 
 * An integer queue holds the integers, a string queue holds every other value that cannot be parsed into int. 
 * The reason to use queues it to provide a flexibility for new instructions where the order 
 * and number of strings and integers are not know. 
 * 
 * @author Zsolt Balvanyos
 * 
 */

package sml;

import java.util.LinkedList;
import java.util.Queue;

public class Parameters {
	private Queue<Integer> intQueue;
	private Queue<String> strQueue;
	
	/**
	 * Constructor
	 * 
	 * Creates the integer and string queues. 
	 */
	public Parameters(){
		intQueue = new LinkedList<Integer>();
		strQueue = new LinkedList<String>();
	}
	
	/**
	 * Adds an integer to the integer queue. 
	 * 
	 * @param number
	 */
	public void addInt(int number) {
		intQueue.add(number);
	}
	
	/**
	 * Adds a string to the string queue. 
	 * 
	 * @param str
	 */
	public void addString(String str) {
		strQueue.add(str); 
	}
	
	/**
	 * Returns the first integer in the queue. 
	 * 
	 * @return first integer
	 */
	public int removeInt() {
		return intQueue.remove();
	}
	
	/**
	 * Returns the first string in the queue. 
	 * 
	 * @return first string in the queue. 
	 */
	public String removeStr() {
		return strQueue.remove();
	}
}