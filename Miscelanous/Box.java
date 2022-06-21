package Miscelanous;

public class Box<T,V> {

//Instance variable
	private T t;
	private V v;
	
//Parameterized constructor
	public Box(T t,V v) {
		this.t=t;
		this.v=v;
	}
//Returns the casted values by methods signature
	public V getV(){
		return v;
	}
	
	
}
