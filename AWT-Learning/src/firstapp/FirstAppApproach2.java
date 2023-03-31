package firstapp;
import java.awt.*;

class myFrame extends Frame{
    Label label;
    TextField textField;
    Button button;

    public myFrame(){
        super("My First App");
        setLayout(new FlowLayout());

        label = new Label("Name : ");
        textField = new TextField(20);
        button = new Button("Okay");

        add(label);
        add(textField);
        add(button);

    }

}
public class FirstAppApproach2 {
    public static void main(String[] args) {
        myFrame myFrame = new myFrame();
        myFrame.setSize(400,400);
        myFrame.setVisible(true);
    }
}
