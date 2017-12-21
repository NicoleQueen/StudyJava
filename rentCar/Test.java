package com.mooc;
/**
 * imooc.com,JAVA第二季
 * @nuanchazy
 */
import java.util.Scanner;
public class Test {
	int rentSum = 0;//总租金
	int peopleSum = 0;//总载客数
	int cargoSum = 0;//总载货数
	String peopleVehicle ="", cargoVehicle = "";//租用载人车型，载客车型
public void method(){
	//通过父类Vehicle的引用指子类car,truck,pickup的对象，存放在Vehicle[]数组中
	Vehicle[] Vehicles = { new Car(1, "奥迪A4", 500, 4),
						new Car(2, "马自达6", 400, 4),
						new Pickup(3, "皮卡雪6", 450, 4, 2),
						new Car(4, "金龙", 800, 20),
						new Truck(5, "松花江", 400, 4),
						new Truck(6, "依维柯", 1000, 20)};
	System.out.println("欢迎使用嗒嗒租车系统：");
	System.out.println("您是否要租车：1.是; 2.否");
	Scanner input1 = new Scanner(System.in);
	switch(input1.nextInt()){
		case 1: {
			System.out.println("您可租用的类型及其价目表:" + "\n" + "序号\t" + "车型\t" + "租金\t" + "容量");
			for (int i = 0; i < Vehicles.length; i++){
				//通过for循环遍历数组下标的方式输出所能租用的所有车辆信息
				System.out.println(Vehicles[i]);
			}
			System.out.println("请输入您要租用的汽车数量:");
			Scanner input2 = new Scanner(System.in);
			int vehicleNum = input2.nextInt();
			if (vehicleNum > 0) {
				for(int j = 1; j <= vehicleNum; j++) {
					System.out.println("请输出第" + j + "辆车的序号:");
					Scanner input3 = new Scanner(System.in);
					int v = input3.nextInt();//将输入的车序号保存在变量v中
					if (Vehicles[v - 1].getClass() == Car.class){
						//判断输入的租用车型是否为Car
						peopleVehicle += Vehicles[v - 1].name + "";//将其车型名称加入载人车型中
						rentSum += Vehicles[v - 1].rentPrice;//计算租金
						peopleSum += ((Car)Vehicles[v - 1]).getPeopleCapacity();//计算载客数
					} else if(Vehicles[v - 1].getClass() == Truck.class){         
						cargoVehicle += Vehicles[v - 1].name + "";//将其车型名称加入载货车型中
						rentSum += Vehicles[v - 1].rentPrice;//计算租金
						cargoSum += ((Truck)Vehicles[v - 1]).getCargoCapacity();//计算载货数
					} else if(Vehicles[v - 1].getClass() == Pickup.class){
						peopleVehicle += Vehicles[v - 1].name + "";//将其车型名称加入载人车型中
						cargoVehicle += Vehicles[v - 1].name + "";//将其车型名称加入载货车型中
						rentSum += Vehicles[v - 1].rentPrice;//计算租金
						peopleSum += ((Pickup)Vehicles[v -1]).getPeopleCapacity();//计算载客数
						cargoSum += ((Pickup)Vehicles[v - 1]).getCargoCapacity();//计算载货数
					}
				}
				System.out.println("请输入租车天数:");
				Scanner input4 = new Scanner(System.in);
				int day = input4.nextInt();
				if(day > 0){
						rentSum =rentSum * day;
						System.out.println("****您的账单: \n****您租用的可载人的车:" + peopleVehicle + "\n****共可载客:" + peopleSum + "人");
						System.out.println("****您可租用的可载货的车:" + cargoVehicle + "\n****共可载货:" + cargoSum + "吨");
						System.out.println("****租车总价格:" + rentSum + "元");
						System.out.println("\n******感谢使用嗒嗒租车系统，祝您生活愉快！******");
						System.exit(0);
				} else{
					System.out.println("输入的租车天数有误，系统无法验证！");
					System.exit(0);
				}
				break;
			}
		}
			case 2: {
				System.out.println("******感谢使用嗒嗒租车系统，祝您生活愉快！******");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("您输入的数字有误，系统无法验证！");
				System.out.println("******感谢使用嗒嗒租车系统，祝您生活愉快！******");
				System.exit(0);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test service = new Test();
		service.method();
	}

}
