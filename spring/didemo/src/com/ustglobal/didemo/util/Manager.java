package com.ustglobal.didemo.util;

import com.ustglobal.didemo.dao.I;
import com.ustglobal.didemo.dao.impl.A;

public class Manager {
public I getI() {
	return new A();
}
}
