public class Visitor {

    private int age;
    private int height;
    private double wallet;

    public Visitor(int age, int height, double wallet) {
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight(){
        return this.height;
    }

    public double getWallet(){
        return this.wallet;
    }
}
