package myproject;

import static org.junit.Assert.*;

//import org.junit.Assert;
import org.junit.Test;

public class gifttest {

	@Test
	public void test() {
		int i;
		New_years_gift g=new New_years_gift();
		String s;
		String nm1[] = { "jalebi","laddu","sompapadi" };
		String nm2[] = { "3star","milkbar","kopiko" };
		int weigh1[] = { 9,4,3 };
		int weigh2[] = { 8,2,5 };
		New_year_gift gif1[] = new New_year_gift[3];
		New_year_gift gif2[] = new New_year_gift[3];
		for (i = 0; i < 3; i++) {
			gif1[i] = new Sweets(nm1[i], weigh1[i]);
			gif2[i] = new chocolates(nm2[i], weigh2[i]);
		}
		s=g.display(3, 5, gif1, gif2);
		assertEquals("sompapadi laddu kopiko ", s);
	}

}
