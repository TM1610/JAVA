class Calculator{
    public int add(int a,int b){
        return a+b;

    }

    public double add(double a, int b ,int c){

    
    return a+b+c;

    }

}

public class Methodoverloading{
    public static void main(String[] args) {
        Calculator calc =new Calculator();
        
        double result=calc.add(1,1,3);
        System.out.println("result is "+result);
        
}
}