/*
 * $Id: Channels.java 12 2005-01-07 05:33:54Z rcleveng $
 */
package org.robsite.jswingreader.model;

import java.util.ArrayList;

public class Channels {
	ArrayList _channels;

	public Channels() {
		_channels = new ArrayList();
	}

	public ArrayList getChannelsList() {
		return _channels;
	}

	public void setChannels(Channel[] channels) {
		_channels.clear();
		int num = channels.length;
		for (int i = 0; i < num; i++) {
			_channels.add(channels[i]);
		}
	}

	public Channel[] getChannels() {
		return (Channel[]) _channels.toArray(new Channel[_channels.size()]);
	}

}