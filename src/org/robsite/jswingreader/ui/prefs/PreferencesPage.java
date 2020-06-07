/*
 * $Id: PreferencesPage.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.ui.prefs;

import java.awt.Component;
import java.util.Map;

import javax.swing.Icon;

public interface PreferencesPage {
	Component getPage();

	String getName();

	Icon getIcon();

	void onEntry();

	void onExit();

	Map getProperties();

	void setProperties(Map map);

	Object getKey();
}