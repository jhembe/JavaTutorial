package ScrollDemo;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame{
    //components
    Scrollbar red,green,blue;
    TextField textField;
    Label label;

    public MyFrame(){
        super("Scrollbar Demo");

        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        textField = new TextField(20);
        label = new Label("255");

        //set bounds for scrollbar
        textField.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
//        label.setBounds(170,150,10,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);

        // adding layout
        setLayout(null);
        //adding components to the frame
        add(textField);
        add(red);
//        add(label);
        add(green);
        add(blue);

        // Handler object
        Handler handler = new Handler();
        red.addAdjustmentListener(handler);
        green.addAdjustmentListener(handler);
        blue.addAdjustmentListener(handler);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class Handler implements AdjustmentListener{
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            textField.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
        }
    }
}
public class ScrollBarDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
