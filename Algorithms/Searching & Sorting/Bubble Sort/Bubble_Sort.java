import java.util.ArrayList;

public class Queue {
	
	static void sortBubble(ArrayList<Integer> queue) {
		for (int i = 0; i < (queue.size() - 1); i++) {
			for (int j = 0; j < (queue.size() - 1); j++) {
				if (queue.get(j) > queue.get(j+1)) {
					int temp = queue.get(j);
					queue.set(j, queue.get(j+1));
					queue.set((j+1), temp);
				}				
			}
		}
	}
	
	public static void main(String[] args) {
  
  ArrayList<Integer> queue = new ArrayList<Integer>();
  
  //test
  queue.add(5);
  queue.add(1);
  queue.add(13);
  queue.add(2);
  sortBubble(queue);
  
  System.out.println(queue);
  
	}
}
