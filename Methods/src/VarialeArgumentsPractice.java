public class VarialeArgumentsPractice {

    static void show(int ...a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    static void showList(String ...names){
        for(int i=0; i< names.length;i++){
            System.out.println(i+1 + ". "+names[i]);
        }
        System.out.println("\n");
    }

    static void showListMod(int start, String ...names){
        for(int i=0; i<names.length;i++){
            System.out.println(start+". "+names[i]+" ");
            start++;
        }
    }

    public static void main(String[] args){
        show();
        show(1,3,4);
        show(12,34,54,23,54);

        // trying to pass arrays
        int[] array = {67,65,4,32};
        show(array);
        show(new int[]{34,54,65,78,65,4,6,3});
        showList(new String[]{"Joseph","Gabriel","Mahembega","Moses","Moss"});
        showList("Hello","There","You","Guys");
        showListMod(5,"John","Joseph","Johari","James","Mary");

        }

    }

