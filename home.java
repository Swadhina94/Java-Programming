class Innerhome {

    float length;
    float breadth;
    public void data(float a, float b){
        length =a;
        breadth =b;
    }
}


public class home {
    public static void main(String[] args) {
        float area;
        Innerhome inh=new Innerhome();
        inh.data(10,8);

        area = inh.length * inh.breadth ;

        System.out.println(area);
    }    
}
