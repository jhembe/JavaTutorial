package WindowEventHandling;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame extends Frame{
    // components to be used
    Label label;

    MyFrame(){
        super("Window Event Demo");
        label = new Label("                     ");

        setLayout(new FlowLayout());
        add(label);


        addWindowListener(new Handler());
    }

    class Handler extends WindowAdapter implements WindowListener{
        @Override
        public void windowActivated(WindowEvent e) {
            label.setText("Window Activated");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            label.setText("Window Closed");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            label.setText("Window Closing");
            System.exit(0);
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            label.setText("Window Deactivated");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            label.setText("Window De-iconified");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            label.setText("Window Iconified");
        }

        @Override
        public void windowOpened(WindowEvent e) {
            label.setText("Window Opened");
        }
    }
}
public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(500,500);
        myFrame.setVisible(true);
    }
}
