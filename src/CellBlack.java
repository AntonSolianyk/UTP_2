import javax.swing.*;
import java.awt.*;

public class CellBlack extends JPanel {
    CellBlack() {
        super();
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g){
        super.setPreferredSize(new Dimension(50,50));

        super.paintComponent(g);
        int w = this.getParent().getWidth();
        int h = this.getParent().getHeight();

    }
}
