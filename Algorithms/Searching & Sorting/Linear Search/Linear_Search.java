import java.util.ArrayList;

public class Queue {
	
	static int findItemLinear(ArrayList<Integer> queue, int item) {
		for (int i = 0; i < queue.size(); i++) {
			if (queue.get(i) == item) {
				System.out.println("The position of '"+item+"' is: "+queue.indexOf(item));
				return queue.indexOf(item);
			}
		}
		System.out.println("The item could not be found.");
		return -1;
	}

	public static void main(String[] args) {
  		//test
		
		ArrayList<Integer> queue = new ArrayList<Integer>();
		
  		queue.add(5);
  		queue.add(2);
  		queue.add(10);
  		queue.add(1);
  		findItemLinear(queue, 10);
	}
}
