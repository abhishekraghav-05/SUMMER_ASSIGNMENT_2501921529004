interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    @Override
    public int square(int n) {
        return n * n;
    }
}

class ToTestInt {
    public static void main(String[] args) {
        Arithmetic ar = new Arithmetic();
        int num = 3;
        System.out.println("Square of " + num + " is: " + ar.square(num));
    }
}