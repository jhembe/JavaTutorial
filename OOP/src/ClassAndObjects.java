class Television{
    public int channel;
    public int volume;

    public void setChannel(){
        System.out.println(channel);
    }
    public void setVolume(){

    }

}

public class ClassAndObjects {
    // an object can be defined by Its properties and behaviour

    // let's see how we can create the classes and objects in Java
    public static void main(String ...args){
        Television t = new Television();
        t.channel = 67;
        t.setChannel();
    }


}
