package com.Java24Local;

public class Sleep {
	static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ie) {
            // do nothing
        }
    }

}
