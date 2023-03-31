package firstapp;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    Integer counter = 0;
    // for the components I'll use
    Label label;
    Button button;
    // for it's constructor
    public MyFrame(){
        super("Button Click");
        setLayout(new FlowLayout());

        label = new Label(counter.toString() + "   ");
        button = new Button("Click");
        button.addActionListener(this);
        add(label);
        add(button);



    }

    @Override
    public void actionPerformed(ActionEvent e){
        counter++;
        label.setText(counter.toString());
    }
}
public class ButtonTest {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(400,400);
        myFrame.setVisible(true);
    }
}
