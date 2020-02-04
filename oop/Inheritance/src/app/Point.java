package app;

import java.util.Objects;

/**
 * Point
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // comparing references
        if (this == obj)
            return true;

        if (!(obj instanceof Point))
            return false;
        var other = (Point) obj;
        return other.x == x && other.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}