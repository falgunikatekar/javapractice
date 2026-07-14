package obj;
class complexno{
    int a;
    int b;

    complexno(int a,int b){
        this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println(a+"+"+b+"i");
    }
   
}
public class complex {
    public static void main(String[] args) {
        complexno x =new complexno(2,3);
        complexno y = new complexno(4, 5);
        x.print();
        y.print();
      
    }
}
