package Interest;
import interest.*;

import org.junit.Assert;
import org.junit.Test;

public class Interest_test {

	@Test
	public void test() {
		Interest intrest=new Interest();
		Assert.assertEquals(40.0,intrest.simple_interest(1000,2,2),0.1);
		Assert.assertEquals(1333.099243,intrest.comp_interest(1200,5.4,2),0.1);
	}
}
