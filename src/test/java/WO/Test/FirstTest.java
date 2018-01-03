package WO.Test;

import java.io.IOException;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void FirstTestNG() throws Exception{
		
		String command ="C:/Users/boset/AppData/Local/UiPath/UiPathStudio.exe"+"/file:"+"C:/Users/boset/Documents/UiPath/WON_Final_Scenarios/WONDeal_v1_maximize.xaml";
		CommandExecutor.exeCmd(null, command);

		System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		
	}
	
}
