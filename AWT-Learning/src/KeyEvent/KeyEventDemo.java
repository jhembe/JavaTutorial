package KeyEvent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyFrame extends Frame{
   //components
   Label labelPressed,labelReleased,labelTyped,labelTime;
   public MyFrame(){
       super("Key Event Demo");
       labelPressed = new Label("                 ");
       labelTyped = new Label("                 ");
       labelReleased = new Label("                 ");
       labelTime = new Label("                 ");

       setLayout(null);
       labelPressed.setBounds(30,50,100,20);
       labelReleased.setBounds(30,80,100,20);
       labelTyped.setBounds(30,110,100,20);
       labelTime.setBounds(30,140,200,20);

       add(labelPressed);
       add(labelReleased);
       add(labelTyped);
       add(labelTime);

       Handler handler = new Handler();
       addKeyListener(handler);
   }

   class Handler implements KeyListener{
       @Override
       public void keyPressed(KeyEvent e) {
            labelPressed.setText("Key Pressed");
            labelReleased.setText("");
       }

       @Override
       public void keyReleased(KeyEvent e) {
            labelReleased.setText("Key Released");
            labelPressed.setText("");
            labelTyped.setText("");
            labelTime.setText("");
       }

       @Override
       public void keyTyped(KeyEvent e) {
           labelTyped.setText("Key Typed");
           labelTime.setText(new Date(e.getWhen())+" ");
       }
   }

}
public class KeyEventDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
