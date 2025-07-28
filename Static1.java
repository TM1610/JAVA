class Mobile{
    String brand;//instance variable
    
    int price ;
    static String model;

    public void show(){
      System.out.println(brand+" "+price+" "+model);

    }
}



public class Static1{
    public static void main(String[] args)
    {
      Mobile m1=new Mobile();
      m1.brand ="Samsung";
      m1.price=12000;
      m1.model="galaxy";
     
     Mobile m2=new Mobile();
      m2.brand ="Apple";
      m2.price=15000;
      m2.model="19pro";


      m1.model="iPhone"; // changing model for m1 will also change for m2 as model is static
    
    
    m1.show();
     m2.show();
     
    }

}