/*
 * $Id: ChannelListener.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.model;

import java.util.EventListener;

public interface ChannelListener extends EventListener {
	void itemsChanged(ChannelEvent ce);
}