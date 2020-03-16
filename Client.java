package com.yuxiang.design.pattern.decorator.winsystem;

public class Client {

    public static void main(String[] args) {
        Windows windows;
        windows = new Window();
        windows.read();
        System.out.println("-----------------------------");
        Scrollbars scrollbar1= new HorizonalScrollbar(windows);
        Scrollbars scrollbar2= new VerticalScrollbar(windows);
        scrollbar1.read();
        scrollbar2.read();
    }
}
