
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

        System.out.println(p1.distance(p2));
    }


    public double distance(Point p) {
       return Math.sqrt((p.x-x)*2 + (p.y -y)*2);
    }
}
