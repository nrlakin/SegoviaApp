package com.fujitsu.frontech.palmsecure_smpl.segovia;

import java.awt.Desktop;
import java.net.URI;

// ...

public class Profile {
	private String name;
	private static String user_pedro = "54373fa27b111f3c11bcf04a";
	private static String user_andres = "54373fe97b111f3c11bcf697";
	private static String user_lucas = "54373f847b111f3c11bcec26";
	private static String user_neil = "54373f7d7b111f3c11bceabc";
	private static String url_base = "https://uganda.demo.thesegovia.com:8000/recipients/single/";
	
	public Profile(String name) {
		this.name = name;
	}
	
	public void show() {
		if(Desktop.isDesktopSupported())
		{
			try {
				String url_end;
				if(this.name.equals("PEDRO"))url_end = user_pedro;
				else if(this.name.equals("ANDRES"))url_end = user_andres;
				else if(this.name.equals("LUCAS"))url_end = user_lucas;
				else if(this.name.equals("NEIL"))url_end = user_neil;
				else url_end = "";
				String url = url_base + url_end;
				Desktop.getDesktop().browse(new URI(url));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
