class NonNegativeDivision extends Exception{
    @Override
    public String toString(){
        return "Division by Negative";
    }
}



public class UserDefinedException{
    public static float devide(float a, float b) throws NonNegativeDivision{
        if(a < 0 || b < 0){
            throw new NonNegativeDivision();
        }
        return a/b;
    }
    public static void main(String[] args) {
        float num1 = -5;
        float num2 = 9;

        try{
            System.out.println(devide(num1,num2));
        }catch (NonNegativeDivision e){
            System.out.println(e.toString());
        }





    }
}