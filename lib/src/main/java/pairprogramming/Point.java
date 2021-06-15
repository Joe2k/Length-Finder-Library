package pairprogramming;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setXCoordinate(x);
        setYCoordinate(y);
    }

    public double getXCoordinate(){
        return this.x;
    }

    public double getYCoordinate(){
        return this.y;
    }

    public void setXCoordinate(double x){
        this.x = x;
    }

    public void setYCoordinate(double y){
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
