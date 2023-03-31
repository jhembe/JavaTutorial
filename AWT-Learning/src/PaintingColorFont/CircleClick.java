package PaintingColorFont;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame{
    // for the components to be used
    int x=250,y=250;
    Label label;
    // for the constructor
    MyFrame(){
        setFont(new Font("Times New Roman",Font.BOLD,30));
        label = new Label("THIS IS SUCCESS");
        label.setBackground(Color.CYAN);
        add(label);
        setLayout(new FlowLayout());

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

        });

        addWindowListener(new WindowAdapter() {
            @Override

            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Monospaced", Font.BOLD,30));
        g.drawString("Hello",x,y);
    }
}

public class CircleClick {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
