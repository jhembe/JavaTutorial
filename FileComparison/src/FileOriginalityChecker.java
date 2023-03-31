import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FileOriginalityChecker extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private static final double SIMILARITY_THRESHOLD = 0.3;
    private JButton chooseFile1Button;
    private JButton chooseFile2Button;
    private JLabel file1Label;
    private JLabel file2Label;
    private File file1;
    private File file2;

    public FileOriginalityChecker() {
        super("File Originality Checker");
        setLayout(new FlowLayout());

        chooseFile1Button = new JButton("Choose File 1");
        add(chooseFile1Button);
        chooseFile1Button.addActionListener(this);

        file1Label = new JLabel("No file selected");
        add(file1Label);

        chooseFile2Button = new JButton("Choose File 2");
        add(chooseFile2Button);
        chooseFile2Button.addActionListener(this);

        file2Label = new JLabel("No file selected");
        add(file2Label);
    }

    public static void main(String[] args) {
        FileOriginalityChecker checker = new FileOriginalityChecker();
        checker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checker.setSize(400, 120);
        checker.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (e.getSource() == chooseFile1Button) {
                file1 = selectedFile;
                file1Label.setText(file1.getName());
            } else if (e.getSource() == chooseFile2Button) {
                file2 = selectedFile;
                file2Label.setText(file2.getName());
            }
            if (file1 != null && file2 != null) {
                try {
                    boolean areCopied = areFilesCopied(file1, file2);
                    if (areCopied) {
                        JOptionPane.showMessageDialog(this, "The files are copied from one another.");
                    } else {
                        JOptionPane.showMessageDialog(this, "The files are not copied from one another.");
                    ;}
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "An error occurred while comparing the files.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private boolean areFilesCopied(File file1, File file2) throws IOException {
        Document doc1 = Jsoup.parse(file1, null);
        Document doc2 = Jsoup.parse(file2, null);
        String text1 = doc1.body().text();
        String text2 = doc2.body().text();

        Set<String> set1 = new HashSet<>();
        for (String word : text1.split("\\W+")) {
            set1.add(word.toLowerCase());
        }

        Set<String> set2 = new HashSet<>();
        for (String word : text2.split("\\W+")) {
            set2.add(word.toLowerCase());
        }

        int intersection = 0;
        for (String word : set1) {
            if (set2.contains(word)) {
                intersection++;
            }
        }

        double similarity = (double) intersection / (double) set1.size();
        return similarity >= SIMILARITY_THRESHOLD;
    }
}
