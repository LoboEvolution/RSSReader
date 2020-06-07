/*
 * $Id: ChannelEvent.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.model;

import java.util.EventObject;

public final class ChannelEvent extends EventObject {
	private final int m_itemIndex;

	public ChannelEvent(Channel source) {
		this(source, -1);
	}

	public ChannelEvent(Channel source, int index) {
		super(source);
		m_itemIndex = index;
	}

	public int getItemIndex() {
		return m_itemIndex;
	}

}