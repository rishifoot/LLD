package singletondesignpattern;

public class Singleton {
	public static Singleton inst;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		
		if(inst==null) {
			synchronized(Singleton.class) {
				if(inst==null) {
					inst=new Singleton();
				}
			}
			
		}
		return inst;
	}
}
