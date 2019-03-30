package wilson.lab.jep;

import jep.Jep;
import jep.JepConfig;
import jep.JepException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JepException {
//		System.setProperty("java.library.path", "E:\\Anaconda3\\Lib\\site-packages\\jep");
        JepConfig config = new JepConfig();
        config.addIncludePaths("src/main/java/wilson/lab/jep");

		Jep jep = new Jep(config);
//		jep.eval("from java.lang import System");
//	    jep.eval("s = 'Hello World'");
//	    jep.eval("System.out.println(s)");
//	    jep.eval("print(s)");
//	    jep.eval("print(s[1:-1])");
//		
		
		jep.eval("import JyUtils");
		String result2 = (String) jep.getValue("JyUtils.getHello()");
		System.out.println("Hello World!" + result2);
	}
}
