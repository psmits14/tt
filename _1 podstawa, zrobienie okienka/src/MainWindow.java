import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow("Aplikacja");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        this("untitled");
    }

    public MainWindow(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 900);


        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);

        DrawingPanel drawingPanel = new DrawingPanel();
        contentPane.add(drawingPanel);
        add(contentPane);
        initComponents();
    }

    public void initComponents(){
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton b = new JButton("Klik");

        buttonPanel.add(b);
        add(buttonPanel, BorderLayout.NORTH);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Przycisk został kliknięty!");
            }
        });
    }
}
