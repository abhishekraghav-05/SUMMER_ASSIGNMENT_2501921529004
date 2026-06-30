class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void displayPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

// Test class
class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(); // default constructor
        p1.displayPoint();

        Point p2 = new Point(5, 10); // parameterized constructor
        p2.displayPoint();

        p2.setX(20);
        p2.setY(30);
        p2.displayPoint();

        p2.setXY(100, 200);
        p2.displayPoint();
    }
}
