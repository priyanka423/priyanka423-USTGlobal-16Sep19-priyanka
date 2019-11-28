package com.ustglobal.objectclass;

public class USBPart {
	public static void connect(Object obj){
		if(obj instanceof Mouse) {
			Mouse m=(Mouse) obj;
			m.click();
			m.scroll();
		}else if(obj instanceof Pendrive) {
			Pendrive p=(Pendrive) obj;
			p.read();
			p.write();
		}else {
			System.out.println("Invalid Object");
		}
	}
}
