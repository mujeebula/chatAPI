package com.mindfire.dto;

/*
 * SearchContactDTO.java
 * 
 * A DTO used for searching contacts in the database
 * @author
 *
 */
public class SearchContactDTO{
	public String username;
	public String keyword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getData() {
		return keyword;
	}
	public void setData(String data) {
		this.keyword = data;
	}
}