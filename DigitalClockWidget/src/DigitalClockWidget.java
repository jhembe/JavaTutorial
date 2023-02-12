import java.awt.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class DigitalClockWidget extends JFrame {
    JLabel timeLabel = new JLabel();
    JLabel dateLabel = new JLabel();
    JLabel additionalInfoLabel = new JLabel();

    public DigitalClockWidget() {
        setLayout(new FlowLayout());
        add(timeLabel);
        add(dateLabel);
        add(additionalInfoLabel);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateTime();
            }
        }, 0, 1000);
    }

    private void updateTime() {
        Calendar cal = Calendar.getInstance();
        String time = String.format("%02d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        String date = String.format("%02d/%02d/%04d", cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.YEAR));
        String additionalInfo = "Enjoy the day!";

        timeLabel.setText("Time: " + time);
        dateLabel.setText("Date: " + date);
        additionalInfoLabel.setText("Info: " + additionalInfo);
    }

    public static void main(String[] args) {
        new DigitalClockWidget();
    }
}
