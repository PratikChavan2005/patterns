 class Patterns{

    
    //square pattern
     public void p1(int x){
         for(int i=0;i<=x;i++)
            {
            for(int j=0;j<=x;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
            }
            
     }
     //upper triangular triangle
    public int p2(int x){
        //upper triangular 1 // 22// 333// 4444
        
       for (int i = 0; i < x; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(" *");
        }
           System.out.println();
       }
       return 0;
    }
    public void p3(int x){

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
                
        }
    }
    public void p4(int x){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
                
        }
    }
    public void p5(int x){
    for (int i = 0; i <=x; i++) {
        for (int j = 0; j < x-i+1; j++) {
            System.out.print("*");
            
        }
    System.out.println();
    }
   }
  
    public void p6(int x){
    for (int i = x; i >=0; i--) {
        for (int j = 0; j < x-i+1; j++) {
            System.out.print("*");
            
        }
    System.out.println();
    }
   }

    public void p7(int x) {
    for (int i = 1; i <= x; i++) {
        for (int j =x-i+1; j >= 1; j--) {
            System.out.print(j); 
        }
    System.out.println();
    }
}
    public void p8(int x){
  for(int i=0;i<=x;i++){
    for(){
      for(int j=x-i-1;j>=0;j--){
        System.out.print(" ");
      }
      System.out.println();
  }
  }
}

     public static void main(String[] args){
        // System.out.println("Enter number of rows");
        // Scanner s1=new Scanner(System.in);
        // int x=s1.nextInt();

           Patterns pattern=new Patterns();
           pattern.p8(5);
           
        }
    
}
