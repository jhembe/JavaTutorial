package TextFieldDemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame extends Frame{
    // Components in use
    Label label1,label2;
    TextField textField;


    //constructor
    public MyFrame(){
        super("Text Box App");
        setLayout(new FlowLayout());
        label1 = new Label("No text Entered. Text Field is Empty");
        label2 = new Label("Enter key is not yet hit");
        textField = new TextField(20);

        Handler handler = new Handler();
        textField.addTextListener(handler);
        textField.addActionListener(handler);
        textField.setEchoChar('*');

        add(label1);
        add(textField);
        add(label2);
    }

    class Handler implements TextListener, ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label2.setText(textField.getText());
        }

        @Override
        public void textValueChanged(TextEvent e) {
            label1.setText(textField.getText());
        }
    }
}
public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
