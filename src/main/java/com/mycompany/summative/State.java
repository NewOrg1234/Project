/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.summative;

/**
 *
 * @author morgana
 * @author alleena
 */
import java.util.ArrayList;

public class State extends Province {
    public ArrayList<State> allStates = new ArrayList<>();
    public String stateName;
    public int statePopulation;
    public int stateArea;
    public double stateLatitude;
    public double stateLongitude;
    
    
    public State(String stateName, int statePopulation, int stateArea, double stateLatitude, double stateLongitude)
    {
      name = stateName;
      population = statePopulation;
      area = stateArea;
      latitude = stateLatitude;
      longitude = stateLongitude;
      allStates.add(this);
    }
 
    public static void loadStates() {
        State california = new State("California", 38965193, 39538223, 6.13, 2284267);
        State texas = new State("Texas", 30503301, 29145505, 15.91, 3999944);
        State florida = new State("Florida", 22610726, 21538187, 14.56, 2736877);
        State newYork = new State("New York", 19571216, 20201249, 4.25, 823147);
        State pennsylvania = new State("Pennsylvania", 12961683, 13002700, 2.36, 300321);
        State illinois = new State("Illinois", 12549689, 12812508, -0.14, -18124);
        State ohio = new State("Ohio", 11785935, 11799448, 2.28, 262944);
        State georgia = new State("Georgia", 11029227, 10711908, 10.57, 1024255);
        State northCarolina = new State("North Carolina", 10835491, 10439388, 9.48, 903905);
        State michigan = new State("Michigan", 10037261, 10077331, 1.96, 193691);
        State newJersey = new State("New Jersey", 9290841, 9288994, 5.65, 497100);
        State virginia = new State("Virginia", 8715698, 8631393, 7.88, 630369);
        State washington = new State("Washington", 7812880, 7705281, 14.58, 980741);
        State arizona = new State("Arizona", 7431344, 7151502, 11.88, 759485);
        State tennessee = new State("Tennessee", 7126489, 6910840, 8.90, 564735);
        State massachusetts = new State("Massachusetts", 7001399, 7029917, 7.37, 482288);
        State indiana = new State("Indiana", 6862199, 6785528, 4.65, 301726);
        State missouri = new State("Missouri", 6196156, 6154913, 2.77, 165986);
        State maryland = new State("Maryland", 6180253, 6177224, 6.99, 403672);
        State wisconsin = new State("Wisconsin", 5910955, 5893718, 3.64, 206732);
        State colorado = new State("Colorado", 5877610, 5773714, 14.8, 744518);
        State minnesota = new State("Minnesota", 5737915, 5706494, 7.59, 402569);
        State southCarolina = new State("South Carolina", 5373555, 5118425, 10.66, 493061);
        State alabama = new State("Alabama", 5108468, 5024279, 5.12, 244543);
        State louisiana = new State("Louisiana", 4573749, 4657757, 2.74, 124385);
        State kentucky = new State("Kentucky", 4526154, 4505836, 3.84, 166469);
        State oregon = new State("Oregon", 4233358, 4237256, 10.60, 406182);
        State oklahoma = new State("Oklahoma", 4053824, 3959353, 5.54, 208002);
        State connecticut = new State("Connecticut", 3617176, 3605944, 0.89, 31847);
        State utah = new State("Utah", 3417734, 3271616, 18.37, 507731);
        State iowa = new State("Iowa", 3207004, 3190369, 4.73, 144014);
        State nevada = new State("Nevada", 3194176, 3104614, 14.96, 404063);
        State arkansas = new State("Arkansas", 3067732, 3011524, 3.28, 95606);
        State kansas = new State("Kansas", 2940546, 2937880, 2.97, 84762);
        State mississippi = new State("Mississippi", 2939690, 2961279, -0.20, -6018);
        State newMexico = new State("New Mexico", 2114371, 2117522, 2.83, 58343);
        State nebraska = new State("Nebraska", 1978379, 1961504, 7.40, 135163);
        State idaho = new State("Idaho", 1964726, 1839106, 17.32, 271524);
        State westVirginia = new State("West Virginia", 1770071, 1793716, -3.20, -59278);
        State hawaii = new State("Hawaii", 1435138, 1455271, 6.98, 94970);
        State newHampshire = new State("New Hampshire", 1402054, 1377529, 4.66, 61059);
        State maine = new State("Maine", 1395722, 1362359, 2.56, 33998);
        State montana = new State("Montana", 1132812, 1084225, 9.58, 94810);
        State rhodeIsland = new State("Rhode Island", 1095962, 1097379, 4.26, 44812);
        State delaware = new State("Delaware", 1031890, 989948, 10.25, 92014);
        State southDakota = new State("South Dakota", 919318, 886667, 8.90, 72487);
        State northDakota = new State("North Dakota", 783926, 779094, 15.83, 106503);
        State alaska = new State("Alaska", 733406, 733391, 3.26, 23160);
        State districtOfColumbia = new State("District of Columbia", 678972, 689545, 14.60, 87822);
        State vermont = new State("Vermont", 647464, 643077, 2.77, 17336);
        State wyoming = new State("Wyoming", 584057, 576851, 2.35, 13225);
 
    }
}
