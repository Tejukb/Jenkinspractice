package jenkins;

import org.testng.annotations.Test;

public class Jenkins04Test {
	
	@Test
	public void main() {
		
 String browser = System.getProperty("b");
 String url = System.getProperty("u");
 
 System.out.println(browser);
 System.out.println(url);
	}
}
