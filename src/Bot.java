import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Bot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		int x =1;
		
		Robot robot = new Robot();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the text: ");
		String txt = s.nextLine();
		
		StringSelection stringSelection = new StringSelection(txt);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		System.out.println("the spamming starts inn 5 sec: ");
		Thread.sleep(1500);

		while (x <= 50) {

			
			Thread.sleep(999);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			x++;
		}
	}
}
