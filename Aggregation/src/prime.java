public class prime {
    public static void main(String[] args) {
        int count=0;

        for (int a=2; a<=15;a++){
            for(int i=1; i<=a/2; i++){
                if(a%i == 0){
                    count++;
                }
            }
            if(count <=1){
                System.out.println(a + "PRIME");
            }
            else{
                System.out.println(a + " NOT Prime");
            }
            count=0;
        }


    }

}
