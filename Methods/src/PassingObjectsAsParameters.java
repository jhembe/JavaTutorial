public class PassingObjectsAsParameters {
    // here we'll learn how to pass objects as parameters

    static void update(int[] arr){
        arr[0] = 20;
    }

    static void updateTwo(int [] arr, int index, int value){
        arr[index] = value;
    }

    static String userName(String email){
        int a = email.indexOf('@');
        return email.substring(0,a);
    }

    public static void main(String[] args){
            // let's create an array object
        int[] array = {2,3,4,5,6};
        update(array);
        System.out.println(array[0]);

        updateTwo(array,2,129);
        System.out.println(array[2]);


        System.out.println(userName("jhembe202@gmail.com"));

    }
}
