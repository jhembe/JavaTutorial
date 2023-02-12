public class PrimeAlgoLinux {
    public static void main(String[] args) {

        for(int a=2; a<=13; a++){
            boolean isPrime = true;
            for (int i=2; i<=a/2; i++){
                if(a%i == 0){
                    isPrime = false;
//                    System.out.println(a + " Is not Prime");
                    break;
                }
            }
            if(isPrime){
                System.out.println(a + " Is PRIME!!");
            }

        }
    }
}
