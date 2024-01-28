package com.mycompany.summative;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Layout extends JFrame {

    private static final int width = 750;
    private static final int height = 750;
    private CirclePanel circlePanel;
    private int x;
    private int y;

    public Layout() {
        setTitle("Map");
        setSize(new Dimension(width, height));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel controlPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 50, 0, 5);

        GridBagConstraints gtbc = new GridBagConstraints();
        gtbc.insets = new Insets(0, 100, 0, 0);

        JTextField textField = new JTextField(24);
        JButton drawButton = new JButton("Draw circle");
        drawButton.addActionListener((ActionEvent e) -> {
            String location = textField.getText().toLowerCase();

            switch (location) {

                case "alabama":
                    circlePanel.setX(100);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "alaska":
                    circlePanel.setX(138);
                    circlePanel.setY(100);
                    circlePanel.drawCircle();
                    break;
                case "arizona":
                    circlePanel.setX(250);
                    circlePanel.setY(200);
                    circlePanel.drawCircle();
                    break;
                case "arkansas":
                    circlePanel.setX(150);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "california":
                    circlePanel.setX(187);
                    circlePanel.setY(476);
                    circlePanel.drawCircle();
                    break;
                case "colorado":
                    circlePanel.setX(315);
                    circlePanel.setY(463);
                    circlePanel.drawCircle();
                    break;
                case "connecticut":
                    circlePanel.setX(200);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "delaware":
                    circlePanel.setX(325);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "florida":
                    circlePanel.setX(372);
                    circlePanel.setY(561);
                    circlePanel.drawCircle();
                    break;
                case "georgia":
                    circlePanel.setX(375);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "hawaii":
                    circlePanel.setX(500);
                    circlePanel.setY(75);
                    circlePanel.drawCircle();
                    break;
                case "idaho":
                    circlePanel.setX(247);
                    circlePanel.setY(404);
                    circlePanel.drawCircle();
                    break;
                case "illinois":
                    circlePanel.setX(200);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "indiana":
                    circlePanel.setX(375);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "iowa":
                    circlePanel.setX(250);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "kansas":
                    circlePanel.setX(200);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "kentucky":
                    circlePanel.setX(325);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "louisiana":
                    circlePanel.setX(439);
                    circlePanel.setY(557);
                    circlePanel.drawCircle();
                    break;
                case "maine":
                    circlePanel.setX(225);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "maryland":
                    circlePanel.setX(350);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "massachusetts":
                    circlePanel.setX(175);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "michigan":
                    circlePanel.setX(400);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "minnesota":
                    circlePanel.setX(403);
                    circlePanel.setY(382);
                    circlePanel.drawCircle();
                    break;
                case "mississippi":
                    circlePanel.setX(125);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "missouri":
                    circlePanel.setX(175);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "montana":
                    circlePanel.setX(292);
                    circlePanel.setY(377);
                    circlePanel.drawCircle();
                    break;
                case "nebraska":
                    circlePanel.setX(250);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "nevada":
                    circlePanel.setX(219);
                    circlePanel.setY(452);
                    circlePanel.drawCircle();
                    break;
                case "new hampshire":
                    circlePanel.setX(300);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "new jersey":
                    circlePanel.setX(275);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "new mexico":
                    circlePanel.setX(225);
                    circlePanel.setY(200);
                    circlePanel.drawCircle();
                    break;
                case "new york":
                    circlePanel.setX(562);
                    circlePanel.setY(394);
                    circlePanel.drawCircle();
                    break;
                case "north carolina":
                    circlePanel.setX(150);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "north dakota":
                    circlePanel.setX(359);
                    circlePanel.setY(372);
                    circlePanel.drawCircle();
                    break;
                case "ohio":
                    circlePanel.setX(475);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "oklahoma":
                    circlePanel.setX(175);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "oregon":
                    circlePanel.setX(198);
                    circlePanel.setY(393);
                    circlePanel.drawCircle();
                    break;
                case "pennsylvania":
                    circlePanel.setX(425);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "rhode island":
                    circlePanel.setX(250);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "south carolina":
                    circlePanel.setX(200);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "south dakota":
                    circlePanel.setX(358);
                    circlePanel.setY(407);
                    circlePanel.drawCircle();
                    break;
                case "tennessee":
                    circlePanel.setX(300);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "texas":
                    circlePanel.setX(225);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "utah":
                    circlePanel.setX(262);
                    circlePanel.setY(460);
                    circlePanel.drawCircle();
                    break;
                case "vermont":
                    circlePanel.setX(150);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "virginia":
                    circlePanel.setX(450);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "washington":
                    circlePanel.setX(206);
                    circlePanel.setY(356);
                    circlePanel.drawCircle();
                    break;
                case "west virginia":
                    circlePanel.setX(275);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "wisconsin":
                    circlePanel.setX(325);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "wyoming":
                    circlePanel.setX(425);
                    circlePanel.setY(200);
                    circlePanel.drawCircle();
                    break;


                case "alberta":
                    circlePanel.setX(275);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "british columbia":
                    circlePanel.setX(210);
                    circlePanel.setY(285);
                    circlePanel.drawCircle();
                    break;
                case "manitoba":
                    circlePanel.setX(325);
                    circlePanel.setY(250);
                    circlePanel.drawCircle();
                    break;
                case "new brunswick":
                    circlePanel.setX(200);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "newfoundland and labrador":
                    circlePanel.setX(400);
                    circlePanel.setY(275);
                    circlePanel.drawCircle();
                    break;
                case "northwest territories":
                    circlePanel.setX(250);
                    circlePanel.setY(200);
                    circlePanel.drawCircle();
                    break;
                case "nova scotia":
                    circlePanel.setX(375);
                    circlePanel.setY(300);
                    circlePanel.drawCircle();
                    break;
                case "nunavut":
                    circlePanel.setX(400);
                    circlePanel.setY(163);
                    circlePanel.drawCircle();
                    break;
                case "ontario":
                    circlePanel.setX(467);
                    circlePanel.setY(336);
                    circlePanel.drawCircle();
                    break;
                case "prince edward island":
                    circlePanel.setX(350);
                    circlePanel.setY(325);
                    circlePanel.drawCircle();
                    break;
                case "quebec":
                    circlePanel.setX(548);
                    circlePanel.setY(296);
                    circlePanel.drawCircle();
                    break;
                case "saskatchewan":
                    circlePanel.setX(300);
                    circlePanel.setY(225);
                    circlePanel.drawCircle();
                    break;
                case "yukon":
                    circlePanel.setX(350);
                    circlePanel.setY(200);
                    circlePanel.drawCircle();
                    break;

                default:

                    circlePanel.setX(440);
                    circlePanel.setY(440);
                    circlePanel.drawCircle();
                    JOptionPane.showMessageDialog(this, "Location not recognized", "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        });

        gtbc.gridx = 0; // Set the gridx position for the text field
        gtbc.gridy = 0; // Set the gridy position
        controlPanel.add(textField, gtbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        controlPanel.add(drawButton, gbc);
        circlePanel = new CirclePanel();
        URL imageUrl = getClass().getResource("/map.png");
        JLabel lb = new JLabel(new ImageIcon(imageUrl));
        lb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                circlePanel.setX(e.getX());
                circlePanel.setY(e.getY());
                circlePanel.drawCircle();
                System.out.println(e.getX() + " " + e.getY());
            }
        });

        getContentPane().add(lb, BorderLayout.CENTER);
        getContentPane().add(controlPanel, BorderLayout.SOUTH);
        getLayeredPane().add(circlePanel, JLayeredPane.PALETTE_LAYER);
        circlePanel.setBounds(0, 0, width, height);
        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Layout();
            }
        });
    }
}
