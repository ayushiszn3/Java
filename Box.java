class Box {
    double width, height, depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    boolean isEqual(Box b) {
        return (this.width == b.width && this.height == b.height && this.depth == b.depth);
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(10, 20, 30);

        if (b1.isEqual(b2))
            System.out.println("Boxes are equal");
        else
            System.out.println("Boxes are not equal");
    }
}
