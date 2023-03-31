package TextAreaOperations;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame{
    // my components
    TextArea textArea;
    TextField textField;
    Label label;
    Button button;

    public MyFrame(){
        super("Text Area Operation");
        setLayout(new FlowLayout());
        label = new Label("No Text Entered");
        textArea = new TextArea(5,30);
        textField = new TextField(20);
        button = new Button("Click");
        add(textArea);
        add(label);
        add(textField);
        add(button);

        Handler handler = new Handler();
        button.addActionListener(handler);
        setLayout(new FlowLayout());
    }

    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
//            label.setText(textArea.getSelectedText());
//            textField.setText("\n");
            textArea.insert(textField.getText(),textArea.getCaretPosition());
//            textArea.append(textField.getText());
            textField.setText("\n");
        }
    }
}
public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
