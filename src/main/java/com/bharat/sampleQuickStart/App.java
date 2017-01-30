package com.bharat.sampleQuickStart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
		LOG.info("app start");
    	readFromSystemIn();
        LOG.info("end of app");
    }
    
	public static void readFromSystemIn() {
		Scanner scanner = new Scanner(System.in);
		String help = "help: use following commands \n ";
		while (true) {
			try {
				String command = scanner.nextLine();
				String[] x = command.split(" ");
				if ("case1".equalsIgnoreCase(x[0])) {
					
				} else if ("case2".equals(x[0])) {
					
				} else if ("quit".equals(x[0])) {
					scanner.close();
					break;
				} else {
					System.out.println(help);
				}
			} catch (Exception e) {
				System.out.println(help);
			}

		}
		scanner.close();
	}
   }
