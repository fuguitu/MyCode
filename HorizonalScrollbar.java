package com.yuxiang.design.pattern.decorator.winsystem;

public class HorizonalScrollbar extends Scrollbars {

	public HorizonalScrollbar(Windows windows) {
		super(windows);
	}

	@Override
	public void read() {
		System.out.println("HorizonalScrollbar is actived.");
	}
}
