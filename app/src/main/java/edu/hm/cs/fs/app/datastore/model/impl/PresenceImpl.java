package edu.hm.cs.fs.app.datastore.model.impl;


import io.realm.RealmObject;

/**
 * Created by Fabio on 18.02.2015.
 */
public class PresenceImpl extends RealmObject {
	private String name;
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
