
public class Point {
    public double x;
    public double y;

   public Point(double x,double y) {
        this.x=x;
       this.y=y;

    }

    public static void main (String[] args) {
        Point p1 = new Point(5,7);

        Point p2 = new Point(4444,222);

        System.out.println(distance(p1,p2));
    }


    public static double distance(Point p1,Point p2) {
       return Math.sqrt((p2.x-p1.y)*2 + (p2.y-p1.y)*2);
    }
}
