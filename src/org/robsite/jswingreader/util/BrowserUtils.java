/*
 * $Id: BrowserUtils.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.util;

import java.io.IOException;
import java.net.URL;

import org.robsite.jswingreader.ui.Main;

public class BrowserUtils {
	public BrowserUtils() {
	}

	/**
	 * Opens the OS default web browser on <code>url</code>
	 * 
	 * @param url The URL to send to the browser
	 * @todo Implement this for other OS's
	 */
	public static boolean openBrowserOnURL(URL url) {
		if (url == null) {
			return false;
		}

		Main.getMainWindow().setStatusBarText("Opening " + url.toString());
		try {
			Runtime.getRuntime().exec("cmd /c start " + url.toString());
			return true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/** Test Main */
	public static void main(String[] args) {
		try {
			openBrowserOnURL(new URL("http://www.oracle.com"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}