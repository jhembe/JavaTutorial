public class RandomDemo {
    public static void randomGenerator(){
        int count =0;
        for (int i=0; i< 100; i++){
            int num = (int)(Math.random()*10);
            if(num%2 == 0){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        randomGenerator();

    }
}
