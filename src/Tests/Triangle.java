package Tests;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(){}
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String getType(){
        if(!validCheck(a, b, c)){
            return "ikke gyldig";
        }
        if((a==b) && (b==c)){
            return "Ligesidet";
        }
        if((a==b)||(b==c)||(a==c)){
            return "ligebenet";
        }
        return "Scalene";
    }
    public void triangleType(){
        System.out.println("Trekanten er " + getType());
    }
    public boolean validCheck(int a, int b, int c) {
        if((a>=b+c)||(b>=a+c)||(c>=a+b)){
            return false;
        }
        return true;
    }
    public String toString(){
        return "Side a: " + a +
                "\nSide b: " + b +
                "\nSide c: " + c +
                "\nTrekanten er " + getType();
    }
}
