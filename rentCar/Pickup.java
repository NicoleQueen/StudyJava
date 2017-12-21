package com.mooc;
//创建子类Pickup皮卡，继承父类Vehicle，且遵循接口IPeopleCapacity和ICargoCapacity
public class Pickup extends Vehicle implements IPeopleCapacity, ICargoCapacity {
	public int peopleNum;
	public int cargoWeight;
	public Pickup(int id, String name, int rentPrice, int peopleNum, int cargoWeight){
		this.id = id;
		this.name = name;
		this.rentPrice = rentPrice;
		this.peopleNum = peopleNum;
		this.cargoWeight = cargoWeight;
	}
	public String toString (){
		return id + "\t" + name + "\t" + rentPrice + "元/天\t" + peopleNum + "人," + cargoWeight + "吨" ;
	}
	public int getPeopleCapacity(){
		return peopleNum;
	}
	public int getCargoCapacity(){
		return cargoWeight;
	}
	
}
