package WO.Test;

import java.io.IOException;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void FirstTestNG() throws IOException{
		CommandExecutor.exeCmd(null, "dir");
		System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		
	}
	
}
