package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello... Welcome to SourceTechTalents, the project platform for BecomeATechPro.com. We are learning to use Maven today, " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "SourceTechTalents";
		return new Date();

	}

}
