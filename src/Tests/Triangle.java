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
        if (!validCheck(a, b, c)){
            return "ikke gyldig";
        }
        if((a==b) && (b==c)){
            return "Ligesidet";
        }
        if((a==b)&&(b!=c) || (a!=b)&&(b==c) || (a==c)&&(b!=c)){
            return "ligebenet";
        }
        if((a!=b&&b!=c)){
            return "Scalene";
        }
        return "Skejs";
    }
    public void triangleType(){
        System.out.println("Trekanten er " + getType());
    }
    public boolean validCheck(int a, int b, int c) {
        int tempTest;
        int temp1;
        int temp2;
        if (a==b&&b==c){
            return true;
        }
        else if (a == b) {
            tempTest = a+b;
            temp1 = Math.max(tempTest, c);
            temp2 = Math.min(tempTest, c);
        }else if (a == c) {
            tempTest = a+c;
            temp1 = Math.max(tempTest, b);
            temp2 = Math.min(tempTest, b);
        }else if (b == c) {
            tempTest = b+c;
            temp1 = Math.max(tempTest, a);
            temp2 = Math.min(tempTest, a);
        }else {
            tempTest = Math.max(a,b);
            temp1 = Math.max(tempTest, c);
            temp2 = Math.min(tempTest, c) + Math.min(a,b);
        }
        if (temp1 >= temp2) {
            return false;//invalid
        } else {
            return true;//valid
        }
    }

    public String toString(){
        return "Side a: " + a +
                "\nSide b: " + b +
                "\nSide c: " + c +
                "\nTrekanten er " + getType();
    }







}
