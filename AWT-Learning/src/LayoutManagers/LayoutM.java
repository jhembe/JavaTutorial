package LayoutManagers;
import java.awt.*;
class MyFrame extends Frame{
    // components used
    Button b1,b2,b3,b4,b5,b6;
    TextField textField;

    public MyFrame(){
        super("Layout Managers");
        textField = new TextField(20);
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        // Layout stuffs start here
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        flowLayout.setHgap(100);
        flowLayout.setVgap(50);
        setLayout(flowLayout);

        // add them to frame
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class LayoutM {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
