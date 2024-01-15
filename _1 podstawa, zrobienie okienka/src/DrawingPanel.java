import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    public DrawingPanel() {
        setBorder(new LineBorder(new Color(157, 146, 97), 4, true));
        setBackground(new Color(255, 229, 148));
        setBounds(50, 50, 900, 700);
    }
}
