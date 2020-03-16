package com.yuxiang.design.pattern.decorator.winsystem;

public class Window implements Windows {

	@Override
	public void read() {
		System.out.println("This is an active window.");
	}

}
