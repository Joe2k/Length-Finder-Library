/*
 * This Java source file was generated by the Gradle 'init' task.
 */
 
package pairprogramming;

public class Library {
    
    public static double findLength(double x1, double y1, double x2, double y2) {
        Point P1 = new Point(x1, y1);
        Point P2 = new Point(x2, y2);

        Line L = new Line(P1, P2);

        return L.getLineLength();
    }
    
    public static void main(String[] args) {    

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double lineLength = findLength(x1, y1, x2, y2);

        System.out.println("Length of the line is " + Double.toString(lineLength));
  
    }
}
