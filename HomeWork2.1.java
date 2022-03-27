/**
  * Java 2. HomeWork 2
  *
  * @author Nikita
  * @version 26.03.2022
  */
class HomeWork2 {
    
    public static void main(String[] args) {
        System.out.println(amountWithin(6, 5));   
        positiveOrNegativeIsPure(-1);     
        System.out.println(theMeaningIsPositiveNegative(-5));
        stringAndNumber(); 
    }
    
    static boolean amountWithin(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void positiveOrNegativeIsPure(int a){
        System.out.println(a >=0? "Positive" : "Negative");
    }
    
    static boolean theMeaningIsPositiveNegative(int a){
        return ( a <= 0);
    }                               
    
    static void stringAndNumber() {
        int[] number = new int[5];
        for(int a = 0; a < 5; a++){
            System.out.println(a);
        }
        
    }
}
