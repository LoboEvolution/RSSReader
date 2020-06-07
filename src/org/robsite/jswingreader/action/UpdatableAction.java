/*
 * $Id: UpdatableAction.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.action;

import javax.swing.Action;

/**
 * Action which is told when to update it's internal state.
 */
public interface UpdatableAction extends Action {
	/**
	 * Causes this action to update it's state (enabled, icon, etc)
	 * 
	 * @param source The object calling this method
	 */
	void update(Object source);
}