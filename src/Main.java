import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Dzien dobry!");
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setSize(new Dimension(450,450));
//        fr.setLayout(new GridLayout(9,9));
        for (int i = 0; i < 9; i++){
            for (int k = 0; k < 9; k++){
                JPanel panel = new JPanel();
                if ((i + k) % 2 != 0){
                    panel.setBackground(Color.BLACK);
                } else panel.setBackground(Color.WHITE);
                fr.add(panel);
                panel.setBounds(k*50, i*50, 50, 50);
            }
        }

    }
}