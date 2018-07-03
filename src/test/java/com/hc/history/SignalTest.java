package com.hc.history;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class SignalTest {
	@Test 
	public  void  test1(){
		Signal mon = Signal.Mon;
		for ( Signal s : Signal.values()) {
			System.out.println(s.name());
			
		}
	}
	
	
	
	@Test @Ignore
	public void test() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入0-7随意数字");
		String str=scanner.nextLine();
		switch(str)
		{
		case "1":
			Signal mon= Signal.Mon;
			mon.print();
			System.err.println(mon);
		
		  break;
		case "2":
			Signal tue= Signal.Tue;
			tue.print();
			System.err.println(tue);
		  break;
		  
		case "3":
			Signal wed= Signal.Wed;
			wed.print();
			System.err.println(wed);
		  break;
		  
		case "4":
			Signal thu= Signal.Thu;
			thu.print();
			System.err.println(thu);
		  break;
		  
		case "5":
			Signal fri= Signal.Fri;
			fri.print();
			System.err.println(fri);
		  break;
		  
		case "6":
			Signal sat= Signal.Sat;
			sat.print();
			System.err.println(sat);
		  break;
		  
		case "7":
			Signal sun= Signal.Sun;
			sun.print();
			System.err.println(sun);
		  break;
		}
		
		
		
	}

}
