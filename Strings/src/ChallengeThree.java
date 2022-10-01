import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ChallengeThree {
    public static void main(String[] args){

        String str = "a!B@c#1$2%3";
        System.out.println(str);
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        String str1 = "   hello there friends i am here";
        System.out.println(str1.strip());
        System.out.println(str1.replaceAll("\\s",""));

        String words[] = str1.split("\\s");
        for(int i=0; i< words.length;i++){
            System.out.println(words[i]);
        }
    }
}
