class Outer {
    public void display() {
        System.out.println("Display outer class");
    }

    class Inner {
        public void display() {
            System.out.println("Display outer class");
        }
    }
}

class TestOuterInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}