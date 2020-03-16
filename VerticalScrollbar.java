package com.yuxiang.design.pattern.decorator.winsystem;

public class VerticalScrollbar extends Scrollbars {

	public VerticalScrollbar(Windows windows) {
		super(windows);
	}

	@Override
	public void read() {
		System.out.println("VerticalScrollbar is actived.");
	}
}
