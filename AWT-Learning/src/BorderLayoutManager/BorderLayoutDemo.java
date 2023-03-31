package BorderLayoutManager;
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

        // add them to frame
        add(b1,BorderLayout.NORTH);
//        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
//        add(b6);

        Panel panel = new Panel();
        panel.add(new Button("Monday"));
        panel.add(new Button("Tuesday"));
        panel.add(new Button("Wednesday"));
        panel.setLayout(new GridLayout(3,1));
        add(panel,BorderLayout.EAST);
    }
}
public class BorderLayoutDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
