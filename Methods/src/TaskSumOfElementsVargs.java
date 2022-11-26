public class TaskSumOfElementsVargs {
    // in this task, we're supposed to find the sum of all the arguments passed through the function using varargs
    static void sum(int ...num){
        // I'll use for loop for this
        int sum = 0;
        // using enhanced for loop
        for(int i:num){
            sum += i;
        }
        System.out.println("The sum is : "+sum);
    }
    public static void main(String ...args){
        sum(1,1,1,1,1,1,1,1);
        sum(456,34,345,2324,43);
        // let's try for an array
        int[] arr={34,321,455,34,33,76,887,67,55,45,344};

        sum(arr);
    }
}
