package house_construction_cost;

import org.junit.Assert;
import org.junit.Test;

/*In the standards column 'S' implies standard materials
 *                        'A' implies Above standard materials
 *                        'H' implies high standard materials
 *In the automation column 'Y' implies automation is needed
                           'N' implies automation is not needed  
 */
public class Cost_test {

	@Test
	public void test() {
		
		Construction_cost c_cost=new Construction_cost();
		Assert.assertEquals(18240.0,c_cost.cost('S',15.2,'N'), 0.1);
		Assert.assertEquals(20250.0,c_cost.cost('A',13.5,'N'), 0.1);
		Assert.assertEquals(28774.8,c_cost.cost('H',15.986,'N'), 0.1);
		Assert.assertEquals(57450.0,c_cost.cost('H',22.98,'Y'), 0.1);
		Assert.assertEquals(0.0,c_cost.cost('A',15.2,'Y'), 0.1);
	}

}
