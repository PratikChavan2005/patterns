class Landscapepyramid{
public static void p9(int x){

        for(int i = 1;i<=2*x-1;i++){
            int stars=i;
            if(i>x){
                stars = 2*x-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }  
     public static void main(String[] args) {
         
         p9(5);
     } 
}