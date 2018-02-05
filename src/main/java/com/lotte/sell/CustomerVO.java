package com.lotte.sell;

public class CustomerVO {
	Integer customerAge;
	String customerGender;
	Integer customerCount;
	Integer maleCount;
	Integer femaleCount;
	
	
	
	public CustomerVO() {
		super();
	}
	
	public CustomerVO(Integer customerAge, String customerGender, Integer customerCount, Integer maleCount,
			Integer femaleCount) {
		super();
		this.customerAge = customerAge;
		this.customerGender = customerGender;
		this.customerCount = customerCount;
		this.maleCount = maleCount;
		this.femaleCount = femaleCount;
	}

	public CustomerVO(Integer customerAge, Integer maleCount, Integer femaleCount) {
		super();
		this.customerAge = customerAge;
		this.maleCount = maleCount;
		this.femaleCount = femaleCount;
	}
	public Integer getMaleCount() {
		return maleCount;
	}
	public void setMaleCount(Integer maleCount) {
		this.maleCount = maleCount;
	}
	public Integer getFemaleCount() {
		return femaleCount;
	}
	public void setFemaleCount(Integer femaleCount) {
		this.femaleCount = femaleCount;
	}
	public Integer getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public Integer getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(Integer customerCount) {
		this.customerCount = customerCount;
	}
	
	
}
