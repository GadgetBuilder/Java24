package com.Java24Local;

import java.awt.*;

public class  Point4D extends Point{

public int z;
public int t = 0;

	
	public Point4D(int x, int y, int z, int t) {
		super(x,y);
		this.z = z;
		this.setTime(t);
	}
	
	public void move(int x, int y, int z, int t) {
		this.z =z;
		this.setTime(t);
		super.move(z, z);
		super.move(t, t); 
	}
	
	public void translate(int x, int y, int z, int t) {		
		this.z += z;
		this.setTime(this.t + t);		
		super.translate(x, y);
	}
	
	public void setTime(int t){
		if (t > 0) {
			this.t = t;
		}
	}
	
	public int getTime(){
		return this.t;
	}
}
