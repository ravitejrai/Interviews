package Intuit;

import java.util.Map;

public class Television {
	/*Constructor**
	@param
	channelNumberToNameMap A map of	every channel number and its corresponding channel name
	**NOTE:	It is safe to assume that the channelNumberToNameMap's keys will all be	numeric and positive*
	and the	values will	be non-null/whitespace. In addition, channelNumberToNameMap	will not be empty.*
	Do not make any	other assumptions about channelNumberToNameMap or the data it contains.*/
	
	//currentChannel will be the current channel set by user if none is given it will be set to one in this case
	private	int currentChannel = 1;
	//for use when validating channels when changing channels
	private int listSize = 0;
	//to store the channel list locally 
	Map<Integer,String> channelList;
	//Changing Map<String, String> to Map<Integer,String) Will allow navigation of the map using numbers allowing for single increments
	
	//includes overloaded constructor in the case user decides to include a starting channel
	public Television(Map<Integer, String> channelNumberToNameMap){
		channelList.putAll(channelNumberToNameMap);
		listSize = channelList.size();
	}
	public Television(Map<Integer, String> channelNumberToNameMap, int channel){
		channelList.putAll(channelNumberToNameMap);
		currentChannel = channel;
		listSize = channelList.size();
	}

	/**
	* Changes the Television to the desired channel.
	*
	* @param channelNumber The desired channel number
	* @return
	The name of the desired channel
	*/
	//will check if channel is in list. THe code will use the boolean containsKey(Object k) method to check if the channel is valid.
	public String goToChannel(int channelNumber) {
		//Case1:
		if (channelList.containsKey(channelNumber))
			return channelList.get(channelNumber);
		else
			return channelList.get(currentChannel);
	}

	/**
	* Changes the Television channel once in an ascending direction.
	*
	* @return
	The name of the next channel
	*/
	//Checks if channel will go higher than list size(or max channel), if so will loop to beginning of map. Otherwise, will change channel up one value
	public String channelUp() {
		if (listSize == currentChannel){
			currentChannel = 1;
			return channelList.get(currentChannel);
		}
		else{
			currentChannel++;
			return channelList.get(currentChannel);
		}
		

	}

	/**
	* Changes the Television channel once in a descending direction.
	*
	* @return
	The name of the previous channel
	*/
	//Checks if channel will go lower than the value 1, if so will loop around to the end of the map. Otherwise, will change channel down one value
	public String channelDown() {
	// TODO
		if (currentChannel == 1){
			currentChannel = listSize;
			return channelList.get(currentChannel);
		}
		else{
			currentChannel--;
			return channelList.get(currentChannel);
		}
	}

}
