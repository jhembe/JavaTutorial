package CardLayoutManager;
import javax.xml.crypto.NoSuchMechanismException;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;

class MyFrame extends Frame{
    // components I'll need
    Button button1,button2,button3;
    TextField textField1,textField2,textField3;
    Panel topPanel,panel,centerPanel,mainPanel;
    Checkbox checkbox1,checkbox2;
    CardLayout cardLayout;

    public MyFrame(){
        super("Card Layout Demo");
        CheckboxGroup cbg = new CheckboxGroup();
        checkbox1 = new Checkbox("One",true,cbg);
        checkbox2 = new Checkbox("two",false,cbg);

        Handler handler = new Handler();
        checkbox1.addItemListener(handler);


        // for the buttons
        button1 = new Button("One");
        button2 = new Button("Two");
        button3 = new Button("Three");

        // For the TextField
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(10);

        topPanel = new Panel();
        topPanel.add(checkbox1);
        topPanel.add(checkbox2);

        centerPanel = new Panel();
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);

        panel = new Panel();
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);

        mainPanel = new Panel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        mainPanel.add("One",centerPanel);
        mainPanel.add("Two",panel);

        add(topPanel,BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);





    }
    class Handler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(checkbox1.getState()){
                cardLayout.first(mainPanel);
            }
            else{
                cardLayout.last(mainPanel);
            }
        }
    }

}


public class CardLayoutDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
