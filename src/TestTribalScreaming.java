import static org.junit.Assert.*;

import org.junit.Test;

public class TestTribalScreaming {

	@Test
	public void testScreamName() {
		TribalScreaming t=new TribalScreaming();
		
				String actualoutput=t.scream("peter");
		
		
		assertEquals("peter is amazing",actualoutput);
		
		}
	@Test
	public void testScreamNameNull() {
		TribalScreaming t=new TribalScreaming();
		
				String actualoutput=t.scream("");
		
		
		assertEquals("you are amazing",actualoutput);
		
		}
	@Test
	public void testScreamNameUpper() {
		TribalScreaming t=new TribalScreaming();
		
				String actualoutput=t.scream("KIRAN");
		
		
		assertEquals("KIRAN IS AMAZING",actualoutput);
		
		}

}
