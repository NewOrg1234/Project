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
                    state.setName("Arizona");
                    state.setPopulation(7151502);
                    state.setArea(294207);
                    state.setLatitude(33.729759);
                    state.setLongitude(-111.431221);
                    String AR = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    circlePanel.setX(250);
                    circlePanel.setY(518);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    JOptionPane.showMessageDialog(this, AR, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "arkansas":
                    state.setName("Arkansas");
                    state.setPopulation(3017804);
                    state.setArea(134771);
                    state.setLatitude(35.2010);
                    state.setLongitude(-91.8318);
                    String AS = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    circlePanel.setX(419);
                    circlePanel.setY(510);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    JOptionPane.showMessageDialog(this, AS, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "california":
                    state.setName("California");
                    state.setPopulation(39512223);
                    state.setArea(403466);
                    state.setLatitude(36.7783);
                    state.setLongitude(-119.41179);
                    circlePanel.setX(187);
                    circlePanel.setY(476);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String CA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, CA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "colorado":
                    state.setName("Colorado");
                    state.setPopulation(5758736);
                    state.setArea(268431);
                    state.setLatitude(39.5501);
                    state.setLongitude(-105.7821);
                    circlePanel.setX(313);
                    circlePanel.setY(463);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String CO = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, CO, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "connecticut":
                    state.setName("Connecticut");
                    state.setPopulation(3565287);
                    state.setArea(12542);
                    state.setLatitude(41.6032);
                    state.setLongitude(-73.0877);
                    circlePanel.setX(580);
                    circlePanel.setY(400);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    String CN = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                   JOptionPane.showMessageDialog(this, CN, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "delaware":
                    state.setName("Delaware");
                    state.setPopulation(973764);
                    state.setArea(5130);
                    state.setLatitude(38.9108);
                    state.setLongitude(-75.5277);
                    circlePanel.setX(572);
                    circlePanel.setY(441);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    String DE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, DE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "florida":
                    state.setName("Florida");
                    state.setPopulation(21477737);
                    state.setArea(138887);
                    state.setLatitude(27.6648);
                    state.setLongitude(-81.5158);
                    circlePanel.setX(532);
                    circlePanel.setY(561);
                    circlePanel.setcW(17);
                    circlePanel.setcH(17);
                    circlePanel.drawCircle();
                    
                    String FL = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, FL, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "georgia":
                    state.setName("Georgia");
                    state.setPopulation(10617423);
                    state.setArea(148959);
                    state.setLatitude(32.1656);
                    state.setLongitude(-82.9001);
                    circlePanel.setX(515);
                    circlePanel.setY(515);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    
                    String GE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, GE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "hawaii":
                    state.setName("Hawaii");
                    state.setPopulation(1415872);
                    state.setArea(16635);
                    state.setLatitude(19.8968);
                    state.setLongitude(-155.5828);
                    circlePanel.setX(100);
                    circlePanel.setY(575);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String HA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, HA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "idaho":
                    state.setName("Idaho");
                    state.setPopulation(1787065);
                    state.setArea(214045);
                    state.setLatitude(44.0682);
                    state.setLongitude(-114.7420);
                    circlePanel.setX(247);
                    circlePanel.setY(404);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String ID = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, ID, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "illinois":
                    state.setName("Illinois");
                    state.setPopulation(12671821);
                    state.setArea(143793);
                    state.setLatitude(40.6331);
                    state.setLongitude(-89.3985);
                    circlePanel.setX(450);
                    circlePanel.setY(450);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String IL = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, IL, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "indiana":
                    state.setName("Indiana");
                    state.setPopulation(6732219);
                    state.setArea(92789);
                    state.setLatitude(40.2672);
                    state.setLongitude(-86.1349);
                    circlePanel.setX(475);
                    circlePanel.setY(447);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String IN = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, IN, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "iowa":
                    state.setName("Iowa");
                    state.setPopulation(3155070);
                    state.setArea(144669);
                    state.setLatitude(41.8780);
                    state.setLongitude(-93.0977);
                    circlePanel.setX(410);
                    circlePanel.setY(430);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String IO = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, IO, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "kansas":
                    state.setName("Kansas");
                    state.setPopulation(2913314);
                    state.setArea(211754);
                    state.setLatitude(39.0119);
                    state.setLongitude(-98.4842);
                    circlePanel.setX(365);
                    circlePanel.setY(465);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String KA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, KA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "kentucky":
                    state.setName("Kentucky");
                    state.setPopulation(4467673);
                    state.setArea(102269);
                    state.setLatitude(37.8393);
                    state.setLongitude(-84.2700);
                    circlePanel.setX(495);
                    circlePanel.setY(465);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String KE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, KE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "louisiana":
                    state.setName("Louisiana");
                    state.setPopulation(4648794);
                    state.setArea(111898);
                    state.setLatitude(30.9843);
                    state.setLongitude(-91.9623);
                    circlePanel.setX(428);
                    circlePanel.setY(547);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String LO = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, LO, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "maine":
                    state.setName("Maine");
                    state.setPopulation(1344212);
                    state.setArea(79883);
                    state.setLatitude(45.2538);
                    state.setLongitude(-69.4455);
                    circlePanel.setX(590);
                    circlePanel.setY(345);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String MA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "maryland":
                    state.setName("Maryland");
                    state.setPopulation(6045680);
                    state.setArea(25142);
                    state.setLatitude(39.0458);
                    state.setLongitude(-76.6413);
                    circlePanel.setX(560);
                    circlePanel.setY(438);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String MR = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MR, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "massachusetts":
                    state.setName("Massachusetts");
                    state.setPopulation(6892503);
                    state.setArea(20202);
                    state.setLatitude(42.4072);
                    state.setLongitude(-71.3824);
                    circlePanel.setX(585);
                    circlePanel.setY(390);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String MS = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MS, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "michigan":
                    state.setName("Michigan");
                    state.setPopulation(9986857);
                    state.setArea(146435);
                    state.setLatitude(44.3148);
                    state.setLongitude(-85.6024);
                    circlePanel.setX(475);
                    circlePanel.setY(400);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String MI = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MI, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "minnesota":
                    state.setName("Minnesota");
                    state.setPopulation(5639632);
                    state.setArea(206232);
                    state.setLatitude(46.7296);
                    state.setLongitude(-94.6859);
                    circlePanel.setX(395);
                    circlePanel.setY(382);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String MO = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MO, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "mississippi":
                    state.setName("Mississippi");
                    state.setPopulation(2976149);
                    state.setArea(121531);
                    state.setLatitude(32.3547);
                    state.setLongitude(-89.3985);
                    circlePanel.setX(450);
                    circlePanel.setY(530);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String MP = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MP, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "missouri":
                    state.setName("Missouri");
                    state.setPopulation(6137428);
                    state.setArea(178040);
                    state.setLatitude(37.9643);
                    state.setLongitude(-91.8318);
                    circlePanel.setX(420);
                    circlePanel.setY(465);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String MU = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MU, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "montana":
                    state.setName("Montana");
                    state.setPopulation(1068778);
                    state.setArea(376962);
                    state.setLatitude(46.8797);
                    state.setLongitude(-110.3626);
                    circlePanel.setX(292);
                    circlePanel.setY(377);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String MT = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MT, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "nebraska":
                    state.setName("Nebraska");
                    state.setPopulation(1934408);
                    state.setArea(198974);
                    state.setLatitude(41.4925);
                    state.setLongitude(-99.9018);
                    circlePanel.setX(365);
                    circlePanel.setY(435);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "nevada":
                    state.setName("Nevada");
                    state.setPopulation(3080156);
                    state.setArea(284332);
                    state.setLatitude(38.8026);
                    state.setLongitude(-116.4194);
                    circlePanel.setX(219);
                    circlePanel.setY(452);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NV = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NV, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "new hampshire":
                    state.setName("New Hampshire");
                    state.setPopulation(1359711);
                    state.setArea(23187);
                    state.setLatitude(43.1939);
                    state.setLongitude(-71.5724);
                    circlePanel.setX(587);
                    circlePanel.setY(375);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String NH = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NH, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "new jersey":
                    state.setName("New Jersey");
                    state.setPopulation(8882190);
                    state.setArea(19047);
                    state.setLatitude(40.0583);
                    state.setLongitude(-74.4057);
                    circlePanel.setX(575);
                    circlePanel.setY(425);
                    circlePanel.setcW(10);
                    circlePanel.setcH(10);
                    circlePanel.drawCircle();
                    String NJ = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NJ, "Information", JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                case "new mexico":
                    state.setName("New Mexico");
                    state.setPopulation(2096829);
                    state.setArea(314161);
                    state.setLatitude(34.5199);
                    state.setLongitude(-105.8701);
                    circlePanel.setX(297);
                    circlePanel.setY(513);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NM = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NM, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "new york":
                    state.setName("New York");
                    state.setPopulation(19453561);
                    state.setArea(122057);
                    state.setLatitude(43.2994);
                    state.setLongitude(-74.2179);
                    circlePanel.setX(557);
                    circlePanel.setY(385);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NY = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NY, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "north carolina":
                    state.setName("North Carolina");
                    state.setPopulation(10488084);
                    state.setArea(125920);
                    state.setLatitude(35.7596);
                    state.setLongitude(-79.0193);
                    circlePanel.setX(545);
                    circlePanel.setY(475);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NC = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NC, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "north dakota":
                    state.setName("North Dakota");
                    state.setPopulation(762062);
                    state.setArea(178711);
                    state.setLatitude(47.5515);
                    state.setLongitude(-101.0020);
                    circlePanel.setX(359);
                    circlePanel.setY(372);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String ND = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, ND, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "ohio":
                    state.setName("Ohio");
                    state.setPopulation(11689100);
                    state.setArea(105829);
                    state.setLatitude(40.4173);
                    state.setLongitude(-82.9071);
                    circlePanel.setX(505);
                    circlePanel.setY(435);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String OH = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, OH, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "oklahoma":
                    state.setName("Oklahoma");
                    state.setPopulation(3956971);
                    state.setArea(177660);
                    state.setLatitude(35.0078);
                    state.setLongitude(-97.0929);
                    circlePanel.setX(385);
                    circlePanel.setY(500);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String OK = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, OK, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "oregon":
                    state.setName("Oregon");
                    state.setPopulation(4217737);
                    state.setArea(248608);
                    state.setLatitude(43.8041);
                    state.setLongitude(-120.5542);
                    circlePanel.setX(198);
                    circlePanel.setY(393);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String OR = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, OR, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "pennsylvania":
                    state.setName("Pennsylvania");
                    state.setPopulation(12801989);
                    state.setArea(115883);
                    state.setLatitude(41.2033);
                    state.setLongitude(-77.1945);
                    circlePanel.setX(545);
                    circlePanel.setY(415);
                    circlePanel.setcW(16);
                    circlePanel.setcH(16);
                    circlePanel.drawCircle();
                    String PE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, PE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "rhode island":
                    state.setName("Rhode Island");
                    state.setPopulation(1059361);
                    state.setArea(2678);
                    state.setLatitude(41.5801);
                    state.setLongitude(-71.4774);
                    circlePanel.setX(595);
                    circlePanel.setY(400);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String RI = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, RI, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "south carolina":
                    state.setName("South Carolina");
                    state.setPopulation(5148714);
                    state.setArea(77857);
                    state.setLatitude(33.8361);
                    state.setLongitude(-81.1637);
                    circlePanel.setX(535);
                    circlePanel.setY(500);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String SC = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, SC, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "south dakota":
                    state.setName("South Dakota");
                    state.setPopulation(884659);
                    state.setArea(196350);
                    state.setLatitude(43.9695);
                    state.setLongitude(-99.9018);
                    circlePanel.setX(358);
                    circlePanel.setY(400);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String SD = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, SD, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "tennessee":
                    state.setName("Tennessee");
                    state.setPopulation(6829174);
                    state.setArea(106798);
                    state.setLatitude(35.5175);
                    state.setLongitude(-86.5804);
                    circlePanel.setX(490);
                    circlePanel.setY(490);
                    circlePanel.setcW(14);
                    circlePanel.setcH(14);
                    circlePanel.drawCircle();
                    String TE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, TE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "texas":
                    state.setName("Texas");
                    state.setPopulation(28995881);
                    state.setArea(676587);
                    state.setLatitude(31.9686);
                    state.setLongitude(-99.9018);
                    circlePanel.setX(365);
                    circlePanel.setY(545);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String TX = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, TX, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "utah":
                    state.setName("Utah");
                    state.setPopulation(3205958);
                    state.setArea(212819);
                    state.setLatitude(39.3209);
                    state.setLongitude(-111.0937);
                    circlePanel.setX(262);
                    circlePanel.setY(460);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String UT = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, UT, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "vermont":
                    state.setName("Vermont");
                    state.setPopulation(623989);
                    state.setArea(23871);
                    state.setLatitude(44.5588);
                    state.setLongitude(-72.5778);
                    circlePanel.setX(575);
                    circlePanel.setY(375);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String VE = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, VE, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "virginia":
                    state.setName("Virginia");
                    state.setPopulation(8535519);
                    state.setArea(102279);
                    state.setLatitude(37.4316);
                    state.setLongitude(-78.6569);
                    circlePanel.setX(540);
                    circlePanel.setY(455);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String VI = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, VI, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "washington":
                    state.setName("Washington");
                    state.setPopulation(7614893);
                    state.setArea(172120);
                    state.setLatitude(47.7511);
                    state.setLongitude(-120.7401);
                    circlePanel.setX(206);
                    circlePanel.setY(356);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String WA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, WA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "west virginia":
                    state.setName("West Virginia");
                    state.setPopulation(1792147);
                    state.setArea(62259);
                    state.setLatitude(38.5976);
                    state.setLongitude(-80.4549);
                    circlePanel.setX(530);
                    circlePanel.setY(450);
                    circlePanel.setcW(8);
                    circlePanel.setcH(8);
                    circlePanel.drawCircle();
                    String WV = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, WV, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "wisconsin":
                    state.setName("Wisconsin");
                    state.setPopulation(5822434);
                    state.setArea(140268);
                    state.setLatitude(43.7844);
                    state.setLongitude(-88.7879);
                    circlePanel.setX(440);
                    circlePanel.setY(400);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String WI = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, WI, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "wyoming":
                    state.setName("Wyoming");
                    state.setPopulation(578759);
                    state.setArea(251470);
                    state.setLatitude(43.0759);
                    state.setLongitude(-107.2903);
                    circlePanel.setX(294);
                    circlePanel.setY(420);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String WY = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, WY, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;


                case "alberta":
                    state.setName("Alberta");
                    state.setPopulation(4262635);
                    state.setArea(661848);
                    state.setLatitude(53.9333);
                    state.setLongitude(-116.5765);
                    circlePanel.setX(275);
                    circlePanel.setY(255);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String AB = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, AB, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "british columbia":
                    state.setName("British Columbia");
                    state.setPopulation(5000879);
                    state.setArea(944735);
                    state.setLatitude(53.7267);
                    state.setLongitude(-127.6476);
                    circlePanel.setX(205);
                    circlePanel.setY(285);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String BC = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, BC, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "manitoba":
                    state.setName("Manitoba");
                    state.setPopulation(1342153);
                    state.setArea(647797);
                    state.setLatitude(53.7609);
                    state.setLongitude(-98.8139);
                    circlePanel.setX(365);
                    circlePanel.setY(275);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String MB = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, MB, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "new brunswick":
                    state.setName("New Brunswick");
                    state.setPopulation(775610);
                    state.setArea(72908);
                    state.setLatitude(46.5653);
                    state.setLongitude(-66.4619);
                    circlePanel.setX(610);
                    circlePanel.setY(320);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    String NB = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NB, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "newfoundland and labrador":
                    state.setName("Newfoundland and Labrador");
                    state.setPopulation(510550);
                    state.setArea(405212);
                    state.setLatitude(53.1355);
                    state.setLongitude(-57.6604);
                    circlePanel.setX(600);
                    circlePanel.setY(230);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NL = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NL, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "northwest territories":
                    state.setName("Northwest Territories");
                    state.setPopulation(41070);
                    state.setArea(1346106);
                    state.setLatitude(64.8255);
                    state.setLongitude(-124.8457);
                    circlePanel.setX(250);
                    circlePanel.setY(180);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NT = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NT, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "nova scotia":
                    state.setName("Nova Scotia");
                    state.setPopulation(969383);
                    state.setArea(55284);
                    state.setLatitude(44.6810);
                    state.setLongitude(-63.7443);
                    circlePanel.setX(630);
                    circlePanel.setY(336);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    String NS = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NS, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "nunavut":
                    state.setName("Nunavut");
                    state.setPopulation(36858);
                    state.setArea(2093190);
                    state.setLatitude(70.2998);
                    state.setLongitude(-83.1076);
                    circlePanel.setX(380);
                    circlePanel.setY(163);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String NU = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, NU, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "ontario":
                    state.setName("Ontario");
                    state.setPopulation(1422394);
                    state.setArea(1076395);
                    state.setLatitude(51.2538);
                    state.setLongitude(-85.3232);
                    circlePanel.setX(467);
                    circlePanel.setY(336);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String ON = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, ON, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "prince edward island":
                    state.setName("Prince Edward Island");
                    state.setPopulation(154331);
                    state.setArea(5660);
                    state.setLatitude(46.5107);
                    state.setLongitude(-63.4168);
                    circlePanel.setX(630);
                    circlePanel.setY(305);
                    circlePanel.setcW(15);
                    circlePanel.setcH(15);
                    circlePanel.drawCircle();
                    String PI = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, PI, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "quebec":
                    state.setName("Quebec");
                    state.setPopulation(8501833);
                    state.setArea(1542056);
                    state.setLatitude(52.9399);
                    state.setLongitude(-73.5491);
                    circlePanel.setX(548);
                    circlePanel.setY(296);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String QU = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, QU, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "saskatchewan":
                    state.setName("Saskatchewan");
                    state.setPopulation(1132505);
                    state.setArea(651036);
                    state.setLatitude(52.9399);
                    state.setLongitude(-106.4509);
                    circlePanel.setX(325);
                    circlePanel.setY(260);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String SA = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, SA, "Information", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "yukon":
                    state.setName("Yukon");
                    state.setPopulation(40232);
                    state.setArea(482443);
                    state.setLatitude(64.2823);
                    state.setLongitude(-13);
                    circlePanel.setX(185);
                    circlePanel.setY(135);
                    circlePanel.setcW(18);
                    circlePanel.setcH(18);
                    circlePanel.drawCircle();
                    String YU = state.getName()+":"+"Population: " + state.getPopulation()+", Area: "+state.getArea()+" km² "+", Latitude: "+state.getLatitude()+", Longitude: "+state.getLongitude();
                    JOptionPane.showMessageDialog(this, YU, "Information", JOptionPane.INFORMATION_MESSAGE);
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
