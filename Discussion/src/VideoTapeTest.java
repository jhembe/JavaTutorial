class VideoTape {
    private String title;
    private String classification;
    private int time;

    public VideoTape(String fullTitle, String programClassification, int runningTime) {
        title = fullTitle;
        classification = programClassification;
        time = runningTime;
    }

    public String getTitle(){
        return title;
    }
    public String getClassification(){
        return classification;
    }
    public String getTime(){
//        Integer hour = time/60;
//        Integer minutes = time%60;
//        return hour.toString()+":"+minutes.toString();
        return (time/60+":"+time%60);
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}

public class VideoTapeTest {
    public static void main(String[] args) {
        VideoTape vt = new VideoTape("Adil Emam","COMEDY",136);
//        vt.setClassification("Comedy");
        System.out.println(vt.getTitle()+" ("+vt.getClassification()+") "+vt.getTime());
    }
}