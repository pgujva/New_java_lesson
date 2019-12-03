import java.util.ArrayList;
public class MyFirstProgram {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int e = 14;
        int f = 22;
        String s = "Test";
        int m = min2(a, b);
        int m3 = min3(a, b, e);
        int m4 = min4(a, b, e, f);
        //System.out.println(m);
        //System.out.println(m3);
        System.out.println(m4);
        print3("ввцв");


    }


    public static int min2(int c, int d) {
        int m2;
        if (c > d) m2 = d;
        else m2 = c;
        return m2;

    }

    public static int min3(int c, int d, int e) {
        int m3;
        if (c < d & c < e) m3 = c;
        else if (d < c & d < e) m3 = d;
        else m3 = e;
        return m3;

    }

    public static int min4(int c, int d, int e, int f) {
        int m4;
        int m1 = min2(c, d);
        int m2 = min2(e, f);
        if (m1 > m2) m4 = m2;
        else m4 = m1;
        return  m4;

    }

    public static void print3(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
    }

