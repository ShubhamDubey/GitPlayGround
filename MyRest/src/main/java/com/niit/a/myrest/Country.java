package com.niit.a.myrest;

public class Country {
	int id;
	String country;
	long poulation;
	public Country(int id, String country, long poulation) {
		super();
		this.id = id;
		this.country = country;
		this.poulation = poulation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPoulation() {
		return poulation;
	}
	public void setPoulation(long poulation) {
		this.poulation = poulation;
	}
	public Country() {
		super();
	}

}
