package com.mooc;
//创建子类Truck货车，继承父类Vehicle，且遵循接口ICargoCapacity具有载货容量
public class Truck extends Vehicle implements ICargoCapacity{
	public int cargoWeight;
	public Truck(int id, String name, int rentPrice, int cargoWeight){
		this.id = id;
		this.name = name;
		this.rentPrice = rentPrice;
		this.cargoWeight = cargoWeight;
	}
	public String toString (){
		return id + "\t" + name +"\t" + rentPrice +"元/天\t" + cargoWeight + "吨";
	}
	public int getCargoCapacity(){
		
		return cargoWeight;
	}
}
