import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		ArrayList fruit = new ArrayList();
		fruit.add("banana");
		fruit.add("apple");
        fruit.add("orange");
        fruit.add(fruit.remove(1));
        fruit.set(1, fruit.remove(2));
        System.out.println(fruit);
	}
}