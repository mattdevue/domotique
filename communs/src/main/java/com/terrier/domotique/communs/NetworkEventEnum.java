/**
 * 
 */
package com.terrier.domotique.communs;

/**
 * @author vzwingma
 *
 */
public enum NetworkEventEnum {

	ID("smartphoneEvent.id"),
	PRESENT("smartphoneEvent.presents");
	
	
	private String id;
	
	private NetworkEventEnum(String id){
		this.id = id;
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}




	public NetworkEventEnum getEnumById(String id){
		for (NetworkEventEnum event : NetworkEventEnum.values()) {
			if(event.getId().equals(id)){
				return event;
			}
		}
		return null;
	}
}