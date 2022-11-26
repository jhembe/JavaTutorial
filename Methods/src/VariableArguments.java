public class VariableArguments {

    static void show(int ...x){
        // the 3 dots define the variable argument, where x is the variable argumet
        for(int i:x){
            System.out.println(i);
        }
    }
    // we can also define a function that takes one of the arguments
    // as compulsory and others as optional. For that we use variable Args
    static void showw(int x,int ...y){
    }
    // the above function will only accept

    //NOTE IMPORTANT : Variable arguments should be the last one.

    public static void main(String[] args){
        show();
    }

}
