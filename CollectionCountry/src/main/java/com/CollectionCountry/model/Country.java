
/*
 * javaBean class country
 * code by : krushikesh
 * date :25-10-2022
 * 
 */

package com.CollectionCountry.model;

//declaring class
public class Country {
	// instance variable
	private String countrycode;
	private String cName;
	private String capital;

	// constructor
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor
	public Country(String countrycode, String cName, String capital) {
		super();
		this.countrycode = countrycode;
		this.cName = cName;
		this.capital = capital;
	}

	// generate getter setter
	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override //
	public String toString() {
		return "Country [countrycode=" + countrycode + ", cName=" + cName + ", capital=" + capital + "]";
	}

}
