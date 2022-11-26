public class TaskMaxNumVarargs {
    // here in this challenge we're going to use Variable arguments to make sure we get
    // the maximum number in the arguments we pass in the function
    static void max(int ...x){
        // i'll be using for loop to complete this task
        int max=0;
        for(int i=0; i<x.length;i++){
            if(x[i] > max){
                max = x[i];
            }
        }
        System.out.println("The Largest number is : "+max);
    }

    public static void main(String ...args){
        max(34,34,567,3,2,765);
        // for an array
        max(new int[]{34,32,54,655,23,542,543,2432,2,2,2,2,2,2,3,4,4,4,4,4,4,4});
    }
}
