public class CountDigitsnum {
    public static void main(String[] args){
        
    
        int num = 12345;  // you can change the number
        int count = 0;

        while (num != 0) {
            num = num / 10;  // remove last digit
            count++;         // increase count
        }

               System.out.println("pamu");

       
        System.out.println("Number of digits: " + count);
    }
}
    


