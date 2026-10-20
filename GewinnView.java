import javax.swing.*;
import java.awt.*;

public class GewinnView {
    JFrame frame;
    JLabel gesamtPunkteLabel;
    JLabel rundenErgebnisLabel;

    public GewinnView() {
        frame = new JFrame("Gewinn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        topPanel.setBackground(Color.WHITE);

        gesamtPunkteLabel = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);
        gesamtPunkteLabel.setOpaque(true);
        gesamtPunkteLabel.setBackground(Color.WHITE);

        rundenErgebnisLabel = new JLabel("Rundenergebnis: 0", SwingConstants.CENTER);
        rundenErgebnisLabel.setOpaque(true);
        rundenErgebnisLabel.setBackground(Color.WHITE);

        topPanel.add(gesamtPunkteLabel);
        topPanel.add(rundenErgebnisLabel);
        frame.add(topPanel, BorderLayout.NORTH);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}