package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Demo {
	@Id
	private Integer Number;
	private Integer Count;
	public Integer getNumber() {
	    return Number;
	}
	public void setNumber(Integer Number) {
		this.Number = Number;
	}
	
	public Integer getCount() {
	    return Count;
	}
	public void setCount(Integer Count) {
		this.Count = Count;
	}
}
	 

