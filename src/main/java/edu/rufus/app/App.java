package edu.rufus.app;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger log = Logger.getLogger(App.class);
	
    public static void main( String[] args ) throws Exception
    {
        //1. Create layout object
//    	Layout layout = new SimpleLayout();
//    	Layout layout = new HTMLLayout();
//    	Layout layout=new XML Layout(); 
    	Layout layout=new PatternLayout("%p %d %C % %m%n");
    	
    	//2. Create appender object + link layout object
//    	Appender appender = new ConsoleAppender(layout);
    	Appender appender = new FileAppender(layout, "D:/mylogs/data.log");
    	
    	//3. Link appender to logger
    	log.addAppender(appender);
    	
    	log.info("FROM INFO");
    	log.debug ("FROM DEBUG");
    	log.fatal("FROM FATAL");
    	log.error("FROM ERROR");
    	log.warn("FROM WANR");
    }
}
