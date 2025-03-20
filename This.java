class This {
    int num;

    This(int num) {
        this.num = num;  // `this` differentiates instance variable from parameter
    }

    void display() {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        This obj = new This(10);
        obj.display();
    }
}
