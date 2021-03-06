package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		// Print the squares of even numbers on the console by using "Functional" programming
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		printSquaresOfEvensInListByFunctional01(list);

	}
	
	public static void printSquaresOfEvensInListByFunctional01(List<Integer> list) {		
		list.stream()                                                              
		    .filter(t->t%2==0)// To filter even numbers from the list
		    .map(t->t*t)      // To update the elements use map()
		                      // "t->t*t" and "public int squared(int x){ return x*x; }" are same
		    .forEach(System.out::println); 
    }

}
