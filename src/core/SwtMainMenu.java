package core;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import core.handlers.*;

import java.nio.file.FileSystems;

import org.eclipse.swt.layout.FormLayout;
import javafx.scene.media.*;
import javafx.embed.swt.*;

public class SwtMainMenu {

	protected Shell shlFairyQuest;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SwtMainMenu window = new SwtMainMenu();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFairyQuest.open();
		shlFairyQuest.layout();
		while (!shlFairyQuest.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFairyQuest = new Shell();
		shlFairyQuest.setSize(450, 300);
		shlFairyQuest.setText("Fairy Quest");
		shlFairyQuest.setLayout(new FormLayout());
		//MediaHandler mh = new MediaHandler();
		PersistenceHandler ph = new PersistenceHandler();
		String os = System.getProperty("os.name");
		
		try {
			ph.persInit();
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println(System.getenv("USERPROFILE"));
		

	}

}
