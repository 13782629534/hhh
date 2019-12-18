package com.woniu.c_method1;

import java.util.Arrays;

public class Dept {
	
	private String[] arr;

	
	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Dept [arr=" + Arrays.toString(arr) + "]";
	}
		
	

}
