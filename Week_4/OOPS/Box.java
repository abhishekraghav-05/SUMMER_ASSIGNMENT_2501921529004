class Box {
    double length;
    double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3d extends Box {
    double height;

    public Box3d(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}

class TestBox {
    public static void main(String[] args) {
        Box box = new Box(10, 5);
        System.out.println("Area of Box: " + box.area());

        Box3d box3d = new Box3d(10, 5, 8);
        System.out.println("Area of Box3d: " + box3d.area());
        System.out.println("Volume of Box3d: " + box3d.volume());
    }
}