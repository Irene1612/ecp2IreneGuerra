package es.upm.miw.spai.ecp2;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }

    public Point midpoint(Point pt) {
        int midX=(getX()+pt.getX())/2;
        int midY=(getY()+pt.getY())/2;
        Point midPoint=new Point(midX,midY);
        return midPoint;
    }
    
}
