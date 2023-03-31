package MenuDemo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    // components for the frame
    TextField textField;
    Menu file,subMenu;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem autoSave;

    public MyFrame(){
        super("Menu Demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");
        textField = new TextField(20);
        autoSave = new CheckboxMenuItem("Auto Save");
        setLayout(new FlowLayout());


        // for the menu
        file = new Menu("File");
        subMenu = new Menu("Close");

        file.add(open);
        file.add(save);

        subMenu.add(close);
        subMenu.add(closeAll);
        file.add(subMenu);
        file.add(autoSave);

        MenuBar menuBar = new MenuBar();
        menuBar.add(file);
        setMenuBar(menuBar);

        add(textField);

        // handling using lambda expressions
        open.addActionListener((ActionEvent ae) -> textField.setText("Open"));
        close.addActionListener((ActionEvent ae) -> textField.setText("Close"));
        save.addActionListener((ActionEvent ae) -> textField.setText("Save"));
        closeAll.addActionListener((ActionEvent ae) -> textField.setText("Close All"));
        autoSave.addItemListener((ItemEvent ae) -> {
            if(autoSave.getState()){
                textField.setText("Auto Save On");
            }
            else{
                textField.setText("Auto Save Off");
            }
        });

        addWindowListener(new Handler());

    }

    static class Handler extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            System.exit(0);
        }
    }
}

public class MenuSub {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
