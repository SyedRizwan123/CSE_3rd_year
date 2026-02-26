/*package CSE_1;
//Import the java.util package which contains List, ArrayList, etc.
import java.util.*;
public class Session_6 {

	public static void main(String[] args) {
		
		  // Create a List of Strings using ArrayList implementation
	     List<String> list = new ArrayList<>();
	  // Add the string "Java" to the list
	     list.add("Java");
	  // Add the string "Python" to the list
	     list.add("Python");
	     // Add "Java" again — List allows duplicates, so this is valid
	     list.add("Java"); // Duplicate allowed
	     list.add(".net");
	     // Print the contents of the list to the console
	     System.out.println(list);  // Output: [Java, Python, Java]

	     System.out.println(list.get(1));
	     System.out.println(list.remove(1));
	     System.out.println(list);
	     System.out.println(list.size());
	     System.out.println(list.contains("Java"));
	     
	}
}*/


/*package CSE_1;
//Import the java.util package which contains List, ArrayList, etc.
import java.util.*;
public class Session_6 {

	public static void main(String[] args) {
	
		 Set<String> set = new HashSet<>();
		  set.add("Java");
		     // Adds "Java" to the set
		     set.add("Python");
		     // Adds "Python" to the set
		     set.add("Java");
		     // "Java" is a duplicate and will be ignored because Set does not allow duplicates
		     System.out.println(set);
}

}*/


/*package CSE_1;
//Import the java.util package which contains List, ArrayList, etc.
import java.util.*;
public class Session_6 {

	public static void main(String[] args) {
	
		// Creating a FIFO queue using LinkedList implementation
        // LinkedList maintains insertion order (FIFO)
        Queue<String> queue = new LinkedList<>();
        // Adding elements to the queue
        queue.add("Java");    // "Java" is added first
        queue.add("Python");  // Then "Python"
        queue.add("C++");     // Then "C++"
     // Display the full queue before removal
        // Output: [Java, Python, C++]
        System.out.println("Initial Queue: " + queue);
        
     // poll() removes and returns the head (first element) of the queue
        // FIFO: "Java" is the first added, so it will be removed first
        System.out.println("Removed: " + queue.poll()); // Output: Java
        
     // Display the queue after one element is removed
        // Output: [Python, C++]
        System.out.println("Queue after poll: " + queue);
        
     // Again, remove the head - next in line is "Python"
        System.out.println("Removed: " + queue.poll()); // Output: Python
        
        System.out.println("Queue after poll: " + queue);
}

}*/

/*package CSE_1;
//Import the java.util package which contains List, ArrayList, etc.
import java.util.*;
public class Session_6 {

	public static void main(String[] args) {
	
		// Creating a Map interface reference with HashMap implementation
	     Map<Integer, String> map = new HashMap<>();
	     // Adding key-value pairs to the map
	     map.put(1, "Java");     // Key 1 mapped to "Java"
	     map.put(2, "Python");   // Key 2 mapped to "Python"
	     //map.put(1, "C++");      // Key 1 now mapped to "C++" (overwrites previous value)
	     map.put(3, ".Net");

	  // Displaying the map
	     System.out.println(map);  // Output: {1=C++, 2=Python}
	     // The value for key 1 was replaced with "C++"
	     
	     //Access methods
	     String value = map.get(1);  // Access value by key
	     String value_1 = map.get(3);  // Access value by key
	     System.out.println(value);  // Output: C++ (for key 1)
	     System.out.println(value_1);  // Output: C++ (for key 1)

	     //Update methods
	     map.put(1, "JavaScript");  // Updates value for key 1
	     System.out.println(map.get(1));  // Output: JavaScript
	    
	     //Remove values
	     map.remove(1);  // Removes key 1 and its value
	     System.out.println(map);  // Output: {2=Python}
	    
	   //loop
	     for (Map.Entry<Integer, String> entry : map.entrySet()) {
	    	    System.out.println(entry.getKey() + " => " + entry.getValue());
	    	}


	}

}*/


package CSE_1;

class car {
	String color = "Red";
	int speed = 120;
	
	void display() {
	    System.out.println("Color: " + color);
	    System.out.println("Speed: " + speed);
	}
public class Session_6 {

	    public static void main(String[] args) {
	        car myCar = new car(); // Creating object
	        myCar.display();       // Calling method
	    }

}

}













