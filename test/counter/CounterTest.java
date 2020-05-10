package counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(7);
		counter.addNumber(8);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(1);
		counter.addNumber(4);
		counter.addNumber(2);
		counter.addNumber(3);
		counter.addNumber(2);
	}
	
	@Test
	public void testEven() {
		assertEquals(counter.getEvenOcurrences(),4);
	}
	
	@Test
	public void testOdd() {
		assertEquals(counter.getOddOcurrences(),6);
	}
	
	@Test
	public void testMultiplosDe() {
		assertEquals(counter.multiplosDe(3),2);
	}
	
	@Test
	public void suma() {
		assertEquals(counter.suma(),36);
	}
	
	@Test
	public void resta() {
		assertEquals(counter.resta(),-36);
	}
	
	@Test
	public void mul() {
		assertEquals(counter.mul(),40320);
	}
}