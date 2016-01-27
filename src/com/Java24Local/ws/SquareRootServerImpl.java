package com.Java24Local.ws;

import java.util.*;
import javax.jws.*;
 
@WebService(endpointInterface = "com.Java24Local.ws.SquareRootServer")
 
public class SquareRootServerImpl implements SquareRootServer {
   
    public double getSquareRoot(double input) {
        return Math.sqrt(input);
    }
 
    public String getTime() {
        Date now = new Date();
        return now.toString();
    }
    
//    public double multiply(double input) {
//    	return input * 10;
//    }
    public double multiply(double input) {
        return input * 10;
    }
}
