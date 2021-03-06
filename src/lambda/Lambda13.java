package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda13 {

	public static void main(String[] args) {
		//Convert all letters to upper case and print on the console by using "Functional" programmin
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Jackson");
		list.add("Jackson");
		list.add("Tucker");
		list.add("Christ");
		
		toUpperCaseByLambdaExpression(list);
		System.out.println("====");
		toUpperCaseByMethodReference(list);
		System.out.println("====");
		toUpperCaseByReplacAll(list);
		System.out.println("====");
		removeForSomeConditions(list);
	}
	
	//By using Lambda Expression
	public static void toUpperCaseByLambdaExpression(List<String> list) {
		list.stream()
		    .map(t->t.toUpperCase()) 
		    .forEach(System.out::println);
	}
	
	//By using Method Reference
	public static void toUpperCaseByMethodReference(List<String> list) {
		list.stream()
		    .map(String::toUpperCase) //Although toUpperCase is not static method (instance method) we can use in Method Reference
		    .forEach(System.out::println);
	}
	
	//By using replaceAll()
	public static void toUpperCaseByReplacAll(List<String> list) {
		list.replaceAll(t->t.toUpperCase());
		System.out.println(list);
	}
	
	//How to use removeIf()
	public static void removeForSomeConditions(List<String> list) {
		list.removeIf(t->t.length()<5);
		System.out.println(list);
	}
	

}
