package ListBoxAndChoice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends Frame{
    List list;
    Choice choice;
    TextArea textArea;

    public MyFrame(){
        super("List Box Demo");
        list = new List(4,true);
        choice = new Choice();
        textArea = new TextArea(20,30);

        // adding list items
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        // Adding choice Items
        choice.add("January");
        choice.add("February");
        choice.add("March");
        choice.add("April");
        choice.add("May");
        choice.add("June");

        //adding components to frame
        add(list);
        add(choice);
        add(textArea);
        setLayout(new FlowLayout());

        // handler
        Handdler handdler = new Handdler();
        list.addItemListener(handdler);
        choice.addItemListener(handdler);
        list.addActionListener(handdler);
    }

    class Handdler implements ItemListener, ActionListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == list)
                textArea.append(list.getSelectedItem());
            else textArea.append("\n"+choice.getSelectedItem());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] listing = list.getSelectedItems();
            String txt="";
            // using enhanced for loop
            for(String x:listing){
                txt = txt + x + "\n";
            }

            textArea.setText(txt);
        }
    }
}
public class ListBoxAndChoice {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
