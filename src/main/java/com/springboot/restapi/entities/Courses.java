package com.springboot.restapi.entities;

public class Courses {
	
	private long id;
	private String titleString;
	private String descriptionString;
	public Courses(long id, String titleString, String descriptionString) {
		super();
		this.id = id;
		this.titleString = titleString;
		this.descriptionString = descriptionString;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public String getDescriptionString() {
		return descriptionString;
	}
	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", titleString=" + titleString + ", descriptionString=" + descriptionString
				+ ", getId()=" + getId() + ", getTitleString()=" + getTitleString() + ", getDescriptionString()="
				+ getDescriptionString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
