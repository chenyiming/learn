package com.future.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: School
 *
 */
@Entity

public class School implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public School() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
