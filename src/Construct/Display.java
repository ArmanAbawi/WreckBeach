package Construct;

import javax.swing.*;

public class Display  {


public Display(){}


     ImageIcon button = new ImageIcon("src/Pictures/70.png");
     ImageIcon button2 = new ImageIcon("src/Pictures/5b0b3d33a4b4ffacb7adb9d9fddb2535.jpg");


public void createGUI(String yes){

    if (yes.equals("yes"))



    {

        JFrame frame = new JFrame();
        JPanel record = new JPanel();
        record.setLayout(new BoxLayout(record, BoxLayout.Y_AXIS));

        JLabel Day = new JLabel("Looks like its gonna be a Wreck Beach Day!!");
        record.add(Day);

        JLabel sun = new JLabel(button);
        record.add(sun);

        JLabel temp = new JLabel(Info.bee+"    Degrees Celsius");
        record.add(temp);

        JLabel wind = new JLabel(Info.dee+"    km/hr" );
        record.add(wind);


        frame.add(record);
        frame.pack();
        record.setVisible(true);
        frame.setVisible(true);


    }




     else{   JFrame forecast = new JFrame();


        JPanel record = new JPanel();
        record.setLayout(new BoxLayout(record, BoxLayout.Y_AXIS));





        JLabel NoBeachDay = new JLabel("No Wreck Beach Days coming up.");

        record.add(NoBeachDay);


        JLabel sadface = new JLabel(button2);
        record.add(sadface);





        forecast.add(record);
        forecast.pack();
        record.setVisible(true);


        forecast.setVisible(true);}






}




















}
