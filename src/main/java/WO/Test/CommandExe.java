package WO.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CommandExe {

	public static   void ExecuteCommand() throws IOException{
		String[] cmd = new String[4];
		cmd[0]="cmd.exe";
		cmd[1]="cd..";
		cmd[2]="cd C:\test";
		cmd[3]="dir";
		//Process process=Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd c:/Workspace/Seleniumnew && java -Dwebdriver.gecko.driver=C:/Workspace/Seleniumnew/geckodriver.exe -Dwebdriver.ie.driver=C:/Workspace/Seleniumnew/IEDriverServer.exe -Dwebdriver.chrome.driver=C:/Workspace/Seleniumnew/chromedriver.exe -jar selenium-server-standalone-3.5.3.jar -port 4443\" &");
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd c:/Workspace/Seleniumnew && java -jar selenium-server-standalone-3.5.3.jar -port 4443"); 
		 builder.redirectErrorStream(true);
	        try {
				Process p = builder.start();
				BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line;
				while (true) {
				    line = r.readLine();
				    if (line == null) { break; }
				    System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static void main(String args[]) throws IOException{
		
		ExecuteCommand();
		System.out.println("YOU ARE HREREEEEEEEEEEEEEEEEE  ");
	}
}
 