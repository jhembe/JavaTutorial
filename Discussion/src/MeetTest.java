import org.w3c.dom.html.HTMLImageElement;

import java.util.ArrayList;
import java.util.Random;

class Meeting{
    private String time,location,subject;
    static int num=5;
    public Meeting(String time, String location, String subject){
        this.time = time;
        this.location = location;
        this.subject = subject;
    }

    void setTime(String time){
        this.time = time;
    }
    void setLocation(String location){
        this.location = location;
    }
    void setSubject(String subject){
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public String getSubject() {
        return subject;
    }

    public String getTime() {
        return time;
    }

    public void printDetails(){
        // Meeting in room 205 at 12:30; Subject: Examiner’s meeting.
        System.out.println("Meeting in room "+getLocation()+" at "+getTime()+"; Subject: "+getSubject());
    }
}

public class MeetTest {
    public static void main(String[] args) {
        Meeting meet1 = new Meeting("12:06","22","UE Preparation");
        meet1.printDetails();

        Random r = new Random();
        for (int i=0; i<100;i++){
            int num = r.nextInt(0,10);
            if(num == 0){
                num+=1;
            } else if (num == 10) {
                num-=1;
            }
            ////////
            if(num % 2 == 0){
                System.out.println(num);
            }
        }

        ArrayList library = new ArrayList ( ); // creating the array list library
        library.add ("book1");
        library.add(true);
        library.add(45);
        System.out.println(library);
//        library.forEach(System.out::println);

    }
}
