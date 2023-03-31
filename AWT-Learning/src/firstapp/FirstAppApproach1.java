package firstapp;
import java.awt.*;
public class FirstAppApproach1 {
    public static void main(String[] args) {
        Frame frame = new Frame("My First App");
        frame.setLayout(new FlowLayout());

        Button button = new Button("Okay");
        Label label = new Label("Name");
        TextField textField = new TextField(20);

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
