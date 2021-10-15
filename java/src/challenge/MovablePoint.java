package challenge;

public class MovablePoint extends Point{
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString() {
        return "X좌표: "+x+" Y좌표: "+y+" X속도: "+xSpeed+" Y속도: "+ySpeed;
    }
}
