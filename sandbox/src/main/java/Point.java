
public class Point {
    double x;
    double y;

    public static void main (String[] args) {
        Point p1 = new Point();
        p1.x=5;
        p1.y=7;

        Point p2 = new Point();
        p1.x=10;
        p2.y=90;

        System.out.println(distance(p1,p2));
    }


    public static double distance(Point p1,Point p2) {
       return Math.sqrt((p2.x-p1.y)*2 + (p2.y-p1.y)*2);
    }
}
