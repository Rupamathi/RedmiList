package org.phone;

public class Phone {
	public void phoneInfo(String mobileName,String model) {
		System.out.println("Mobile Name:"+mobileName);
		System.out.println("Mobile Model:"+model);
	}
	public void phoneInfo(int cost) {
		System.out.println("Mobile Cost:"+cost);
	}
	public void phoneInfo(double inch,String warranty) {
		System.out.println("Mobile Size:"+inch);
		System.out.println("Mobile warranty:"+warranty);
	}
	public static void main(String[]arg) {
		Phone p = new Phone();
		p.phoneInfo("OnePlus","Oneplus Nord");
		p.phoneInfo(50000);
		p.phoneInfo(5.5, "5 Years");
				
	}

}
