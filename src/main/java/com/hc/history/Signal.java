package com.hc.history;

public enum Signal {
	Mon("星期一"), Tue("星期二"), Wed("星期三"),Thu("星期四"),Fri("星期五"),Sat("星期六"),Sun("星期日");
	
	String name;
	private Signal(){
		
	}
    private Signal(String name){
		this.name=name;
	}
  
    
	public  void  print(){
		System.out.println(name);
	}
}
