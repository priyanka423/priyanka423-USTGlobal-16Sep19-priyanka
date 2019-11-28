package com.ustglobal.atmmachine;

public class Machine {
	public void slot(ATM a) {
		a.validateCard();
		a.getInfo();
	}
}
