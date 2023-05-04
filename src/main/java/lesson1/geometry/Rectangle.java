package lesson1.geometry;

public class Rectangle {

private point se;
private point nw;

    public Rectangle(point se, point nw) {
        this.se = se;
        this.nw = nw;
    }

    public point getSe() {
        return se;
    }

    public void setSe(point se) {
        this.se = se;
    }

    public point getNw() {
        return nw;
    }

    public void setNw(point nw) {
        this.nw = nw;
    }

double area(){
        double sizeX = se.getX() - nw.getX();
        double sizeY = se.getY() - nw.getY();
        return sizeY * sizeX;
    }
}
