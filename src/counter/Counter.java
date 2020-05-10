package counter;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list = new	ArrayList<Integer>();
	
	public void addNumber(Integer x) {	list.add(x);	}
	public void clearCounter() {	list.clear();	}
	
	public int getEvenOcurrences() {
		int counter = 0;
		for(Integer n : this.list) {
			counter += ((n % 2) == 0) ? 1 : 0;
		}
		return counter;
	}
	
	public int getOddOcurrences() {
		int counter = 0;
		for(Integer n : this.list) {
			counter += ((n % 2) == 1) ? 1 : 0;
		}
		return counter;
	}
	
	public int multiplosDe(int x) {
		int counter = 0;
		for(Integer n : this.list) {
			counter += ((n % x) == 0) ? 1 : 0;
		}
		return counter;
	}
	
	public Integer suma() {
		Integer	sum = 0;
		for(Integer n : this.list) {
			sum += n;
		}
		return sum;
	}
	
	public Integer resta() {
		return -this.suma();
	}
	
	public Integer mul() {
		Integer	mul = 1;
		for(Integer n : this.list) {
			mul *= n;
		}
		return mul;
	}
}
