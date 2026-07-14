package obj;

class ComplexNo {
    int a, b;

    ComplexNo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + "+" + b + "i");
    }

    static ComplexNo add(ComplexNo x, ComplexNo y) {
        return new ComplexNo(x.a + y.a, x.b + y.b);
    }
}

public class complexadd {

    public static void main(String[] args) {

        ComplexNo x = new ComplexNo(2, 3);
        ComplexNo y = new ComplexNo(4, 5);

        x.print();
        y.print();

        ComplexNo z = ComplexNo.add(x, y);

        System.out.print("Sum = ");
        z.print();
    }
}