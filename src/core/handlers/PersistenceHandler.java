package core.handlers;
import java.io.*;
import core.*;
import org.apache.commons.lang3.StringUtils;

public class PersistenceHandler {
	private boolean osIsWindows = StringUtils.containsIgnoreCase(System.getProperty("os.name"), "Windows");
	public File perSetts = new File(osIsWindows ? "src/core/perCSV/Settings.csv" : "");
	
	protected String system = System.getProperty("os.name");
	
	public void persInit() throws IOException {
		if (!perSetts.exists()) {
			perSetts.createNewFile();
		}
		System.out.println(perSetts);
	}
}
