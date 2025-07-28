class Loops {
    public static void main (String args[])
    {
        //types of Loops
        //while,do-while,for
/* 
        //While //To print statement multiple time
        
        // nested while
        int i =0;

       while(i<=10) 
           
       
        {
            System.out.println("Hello Tanmay"+i);
           int j=1;
            while(j<=3){            System.out.println("Hii");
            j++;}
            i++;

        } 

 */
  /* // Do While  
  int a =3;
    do { System.out.println("hi");
        
    } while (a<=2);
    //---- even the the condition i wrong it will run once because it is do while loop


     //For Loop
     for(int b=9;b>=2;b--)
     {System.out.println("hi"+b);} */

     for(int i=1;i<8;i++)
     {
        System.out.println("Day"+i);

        for(int j=1;j<=9;j++)
        {
            System.out.println( (j+8) + "  -  "+ (j+9));
        }
     }



    }
}