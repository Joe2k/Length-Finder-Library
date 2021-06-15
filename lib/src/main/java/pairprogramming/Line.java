package pairprogramming;


public class Line {
    private Point P1;
    private Point P2;
    private double length;

    public Line(Point P1, Point P2) {
        this.P1 = P1;
        this.P2 = P2;
        countLineLength();
    }

    // length = sqrt((x1-x2)^2 + (y1-y2)^2)
    private void countLineLength(){
        double x1 = P1.getXCoordinate();
        double y1 = P1.getYCoordinate();
        double x2 = P2.getXCoordinate();
        double y2 = P2.getYCoordinate();
        
        double xDifference = x1 - x2;
        double yDifference = y1 - y2;

        double length = Math.sqrt(xDifference * xDifference + yDifference * yDifference);
        this.length = length;
    }
    
    public double getLineLength(){
        return this.length;
    }

    public String toString(){
        return P1.toString() + "," + P2.toString() + " is " + length + " unit.";
    }
}
