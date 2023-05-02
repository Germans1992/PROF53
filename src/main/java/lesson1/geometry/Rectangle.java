package lesson1.geometry;

public class Rectangle {

    public static void main(String[] args) {
    }
point se;
point nw;

double area(){
    return 0;
}

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
}
