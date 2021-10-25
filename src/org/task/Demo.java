package org.task;

public  class Demo {
	
	public Demo(){
	
		System.out.println("default");
		
	}
	
   public Demo(int i){
		this("ssdsd");
		System.out.println(" int argument :"+i);
		
	}
   
   public Demo(String i){
		
		System.out.println("string argument :"+i);
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		for(int i = 0; i < 100; i++){
			
		}
		
	}
	
	
}
