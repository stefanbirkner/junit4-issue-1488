import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Issue1488Test {

	    private final String mInput;

	        @Parameters
		    public static Iterable<Object[]> data() {
			            return Arrays.asList(new Object[][] { {null} });
				        }

		    public Issue1488Test(String input) {
			            mInput = input;
				        }
		        @Test
			    public void test() {
				            assertEquals(null, mInput);
					        }
}
