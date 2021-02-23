package com.javarefresh;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof Point))
            return false;
        Point other = (Point)obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);      
    }
}

// framework