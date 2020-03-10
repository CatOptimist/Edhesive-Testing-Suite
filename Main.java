import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		ArrayList fruit = new ArrayList();
		fruit.add("banana"); // Index 0
		fruit.add("apple"); // Index 1
        fruit.add("orange"); // Index 2
        fruit.add(fruit.remove(1));
        fruit.set(1, fruit.remove(2)); // Removes "orange"
        System.out.println(fruit); // Prints out [banana, apple]
	}
}