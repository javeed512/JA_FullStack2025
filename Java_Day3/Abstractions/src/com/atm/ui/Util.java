package com.atm.ui;

import com.atm.service.BankImp2;
import com.atm.service.IBank;

// @author:Javeed
public class Util {
	
	
		public static  IBank    getObject(){  // abstraction
			
			
			return new BankImp2();
			
		}

}
