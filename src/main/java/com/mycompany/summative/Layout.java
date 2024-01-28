package com.mycompany.summative;

import java.awt.BorderLayout;
import static java.awt.Color.WHITE;
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

/*author hareem
author alleena
author morgana
*/

public class Layout extends JFrame {

    private static final int width = 750;
    private static final int height = 890;
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
            State state = new State("",0,0,0,0);
            Province province = new Province("",0,0,0,0);
            Territory territory = new Territory("",0,0,0,0);
            
            switch (location) {
                
                case "alabama":
                    state.setName("Alabama");
                    state.setPopulation(5108468);
                    state.setArea(5024279);
                    state.setLatitude(5.12);
                    state.setLongitude(244543);
                    
                    String AL=state.getName()+":"+" Population: "+state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: " +state.getLatitude()+", Longitude: "+state.getLongitude();
                    circlePanel.setX(478);
                    circlePanel.setY(520);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    JOptionPane.showMessageDialog(this, AL, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "alaska":
                    state.setName("Alaska");
                    state.setPopulation(733406);
                    state.setArea(733391);
                    state.setLatitude(3.26);
                    state.setLongitude(23160);
                    
                    String AK =state.getName()+":"+" Population: "+state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: " +state.getLatitude()+", Longitude: "+state.getLongitude();
                    circlePanel.setX(138);
                    circlePanel.setY(100);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    JOptionPane.showMessageDialog(this, AK, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "arizona":
                    circlePanel.setX(250);
                    circlePanel.setY(518);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "arkansas":
                    circlePanel.setX(419);
                    circlePanel.setY(510);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "california":
                    circlePanel.setX(187);
                    circlePanel.setY(476);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "colorado":
                    circlePanel.setX(313);
                    circlePanel.setY(463);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "connecticut":
                    circlePanel.setX(580);
                    circlePanel.setY(400);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    break;
                case "delaware":
                    circlePanel.setX(572);
                    circlePanel.setY(441);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    break;
                case "florida":
                    circlePanel.setX(532);
                    circlePanel.setY(561);
                    circlePanel.setcW(17);
                    circlePanel.setcH(17);
                    circlePanel.drawCircle();
                    break;
                case "georgia":
                    circlePanel.setX(515);
                    circlePanel.setY(515);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "hawaii":
                    circlePanel.setX(100);
                    circlePanel.setY(575);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "idaho":
                    circlePanel.setX(247);
                    circlePanel.setY(404);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "illinois":
                    circlePanel.setX(450);
                    circlePanel.setY(450);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "indiana":
                    circlePanel.setX(475);
                    circlePanel.setY(447);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "iowa":
                    circlePanel.setX(410);
                    circlePanel.setY(430);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "kansas":
                    circlePanel.setX(365);
                    circlePanel.setY(465);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "kentucky":
                    circlePanel.setX(495);
                    circlePanel.setY(465);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "louisiana":
                    circlePanel.setX(428);
                    circlePanel.setY(547);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "maine":
                    circlePanel.setX(590);
                    circlePanel.setY(345);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "maryland":
                    circlePanel.setX(560);
                    circlePanel.setY(438);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "massachusetts":
                    circlePanel.setX(585);
                    circlePanel.setY(390);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "michigan":
                    circlePanel.setX(475);
                    circlePanel.setY(400);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "minnesota":
                    circlePanel.setX(395);
                    circlePanel.setY(382);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "mississippi":
                    circlePanel.setX(450);
                    circlePanel.setY(530);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "missouri":
                    circlePanel.setX(420);
                    circlePanel.setY(465);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "montana":
                    circlePanel.setX(292);
                    circlePanel.setY(377);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "nebraska":
                    circlePanel.setX(365);
                    circlePanel.setY(435);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "nevada":
                    circlePanel.setX(219);
                    circlePanel.setY(452);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "new hampshire":
                    circlePanel.setX(587);
                    circlePanel.setY(375);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "new jersey":
                    circlePanel.setX(575);
                    circlePanel.setY(425);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    break;
                case "new mexico":
                    circlePanel.setX(297);
                    circlePanel.setY(513);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "new york":
                    circlePanel.setX(557);
                    circlePanel.setY(385);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "north carolina":
                    circlePanel.setX(545);
                    circlePanel.setY(475);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "north dakota":
                    circlePanel.setX(359);
                    circlePanel.setY(372);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "ohio":
                    circlePanel.setX(505);
                    circlePanel.setY(435);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "oklahoma":
                    circlePanel.setX(385);
                    circlePanel.setY(500);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "oregon":
                    circlePanel.setX(198);
                    circlePanel.setY(393);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "pennsylvania":
                    circlePanel.setX(545);
                    circlePanel.setY(415);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    break;
                case "rhode island":
                    circlePanel.setX(595);
                    circlePanel.setY(400);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "south carolina":
                    circlePanel.setX(535);
                    circlePanel.setY(500);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "south dakota":
                    circlePanel.setX(358);
                    circlePanel.setY(400);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "tennessee":
                    circlePanel.setX(490);
                    circlePanel.setY(490);
                    circlePanel.setcW(14);
                    circlePanel.setcH(14);
                    circlePanel.drawCircle();
                    break;
                case "texas":
                    circlePanel.setX(365);
                    circlePanel.setY(545);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "utah":
                    circlePanel.setX(262);
                    circlePanel.setY(460);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "vermont":
                    circlePanel.setX(575);
                    circlePanel.setY(375);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "virginia":
                    circlePanel.setX(540);
                    circlePanel.setY(455);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "washington":
                    circlePanel.setX(206);
                    circlePanel.setY(356);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "west virginia":
                    circlePanel.setX(530);
                    circlePanel.setY(450);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    break;
                case "wisconsin":
                    circlePanel.setX(440);
                    circlePanel.setY(400);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "wyoming":
                    circlePanel.setX(294);
                    circlePanel.setY(420);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;


                case "alberta":
                    circlePanel.setX(275);
                    circlePanel.setY(255);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "british columbia":
                    circlePanel.setX(205);
                    circlePanel.setY(285);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "manitoba":
                    circlePanel.setX(365);
                    circlePanel.setY(275);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "new brunswick":
                    circlePanel.setX(610);
                    circlePanel.setY(320);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    break;
                case "newfoundland and labrador":
                    circlePanel.setX(600);
                    circlePanel.setY(230);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "northwest territories":
                    circlePanel.setX(250);
                    circlePanel.setY(180);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "nova scotia":
                    circlePanel.setX(630);
                    circlePanel.setY(336);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    break;
                case "nunavut":
                    circlePanel.setX(380);
                    circlePanel.setY(163);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "ontario":
                    circlePanel.setX(467);
                    circlePanel.setY(336);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "prince edward island":
                    circlePanel.setX(630);
                    circlePanel.setY(305);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    break;
                case "quebec":
                    circlePanel.setX(548);
                    circlePanel.setY(296);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "saskatchewan":
                    circlePanel.setX(325);
                    circlePanel.setY(260);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;
                case "yukon":
                    circlePanel.setX(185);
                    circlePanel.setY(135);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    break;

                default:
                    JOptionPane.showMessageDialog(this, "OUT OF BOUNDS!!", "Info", JOptionPane.INFORMATION_MESSAGE);
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
