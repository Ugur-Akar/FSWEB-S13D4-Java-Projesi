public class Point {
    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.getX() - x),2) + Math.pow((p.getY() - y),2));
    }
    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(x-a,2) + Math.pow(y-b,2));
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
