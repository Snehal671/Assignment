package Prob1;

import Prob2.*;
public class Main {

	public static void main(String[] args) {
		
		Employee obj =new Employee(78978,"Snehal","Awasthi",5000);
		System.out.println(obj);
		Author au =new Author("Snehal","snehal@gmail.com",'M');
		Book ob1=new Book("Gold",500.0,5,au);
		System.out.println(ob1);
	}

}