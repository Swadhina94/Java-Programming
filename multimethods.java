class Multiple{
    public int mul(int a,int b){
        return a*b;
    }
}


public class multimethods {
    public static void main(String[] args) {
        
        Multiple mult=new Multiple();

        int y= mult.mul(15,4);

        System.out.println("multiple of two number is :-"+ y);
        
    }
    
}
