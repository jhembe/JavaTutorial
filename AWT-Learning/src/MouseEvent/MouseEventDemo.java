package MouseEvent;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame{
    //components
    Label label;
    public MyFrame(){
        super("Key Event Demo");
        label = new Label("");
        setLayout(null);
        label.setBounds(10,50,100,20);
        add(label);

        Handler handler = new Handler();
    }

    class Handler{

    }

}




public class MouseEventDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
