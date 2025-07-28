class Demoarray {
   /*  public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        for(int i=0;i<=array.length;i++){

        
        System.out.println("these are the elements of array:  "+ array[i]);
    }}  */

  // MULTIDIMENSIONAL ARRAYimport java.util.Random;  // ✅ Import the Random class



    // MULTIDIMENSIONAL ARRAY
  /*   public static void main(String a[]) {
        int array[][] = new int[3][4];  // 3 rows and 4 columns
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = r.nextInt(100);  // Random value from 0 to 99
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    } */



   //Multidimensional array using Math.random()

   public static void main(String[] args) {
       
       int array[][]=new int[4][4];
       for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            array[i][j]=(int)(Math.random()*100);
            System.out.print(array[i][j]+" ");
            }
                    System.out.println();
       
   }
}
}

