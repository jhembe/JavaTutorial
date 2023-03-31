package firstapp;
import java.awt.*;
import java.awt.event.*;

// creating my custom frame
class JoFrame extends Frame implements ItemListener {
    // for my useful components
    Label label;
    Checkbox check1,check2,check3;
    CheckboxGroup cbg;

    // for the constructor
    public JoFrame(){
        super("Check Box App");
        setLayout(new FlowLayout());

        label = new Label("Nothing is Selected");

        cbg = new CheckboxGroup();
        check1 = new Checkbox(" Java",false,cbg);
        check1.addItemListener(this);
        check2 = new Checkbox(" Python",false,cbg);
        check2.addItemListener(this);
        check3 = new Checkbox(" C#",false,cbg);
        check3.addItemListener( this);

        add(label);
        add(check1);
        add(check2);
        add(check3);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(check1.getState()){
            str=str+"  "+check1.getLabel();
        }
        if(check2.getState()){
            str=str+"  "+check2.getLabel();
        }
        if(check3.getState()){
            str=str+"  "+check3.getLabel();
        }
        if(str.isEmpty()){
            str = "Nothing is Selected";
        }

        label.setText(str);
    }
}
public class CheckBoxRadioTest {
    public static void main(String[] args) {
        JoFrame joFrame = new JoFrame();
        joFrame.setSize(400,400);
        joFrame.setVisible(true);
    }
}
