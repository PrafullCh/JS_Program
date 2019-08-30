import java.util.*;
class Sample{
	int i;
}
class Vector{
	public static void main(String args[]) 
    { 
  
        // Creating an empty Vector 
        Vector<String> vec_tor = new Vector<String>(); 
  
        // Use add() method to add elements in the vector 
        vec_tor.add("Geeks"); 
        vec_tor.add("for"); 
        vec_tor.add("Geeks"); 
        vec_tor.add("10"); 
        vec_tor.add("20"); 
  
        // Output the present vector 
        System.out.println("The vector is: " + vec_tor); 
  
        // Adding new elements to the end 
        vec_tor.addElement("Last"); 
        vec_tor.addElement("Element"); 
  
        // Printing the new vector 
        System.out.println("The new Vector is: " + vec_tor); 
    } 
}