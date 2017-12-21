package com.mooc;
//创建子类Car汽车，继承父类Vehicle，且遵守接口IPeopleCapacity具有载人容量
public class Car extends Vehicle implements IPeopleCapacity{
	public int peopleNum;
	public Car(int id, String name, int rentPrice, int peopleNum){
		this.id = id;
		this.name = name;
		this.rentPrice = rentPrice;
		this.peopleNum = peopleNum;
	}
	public String toString(){
		return id + "\t" + name + "\t" + rentPrice + "元/天\t" + peopleNum + "人";
	} 
	public int getPeopleCapacity(){
	
		return peopleNum;
	}
}
