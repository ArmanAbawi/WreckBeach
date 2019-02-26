package Construct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;




public class Info {


    public static double bee;
    String cee;
    public static double dee;



    String apikey = "da79e14c4389b62d31cec4e24279b686";
    String vancouverweatherquery = "https://api.openweathermap.org/data/2.5/weather?q=Vancouver,CA&APPID=";
    StringBuilder sb = new StringBuilder();



    public Info(){}


    //rounds the given number to nearest integer

    private int round(double d){
        double dAbs = Math.abs(d);
        int i = (int) dAbs;
        double result = dAbs - (double) i;
        if(result<0.5){
            return d<0 ? -i : i;
        }else{
            return d<0 ? -(i+1) : i+1;
        }
    }


    //Retrieves information from weather website using website link and access api code to return
    //all of the information in one entire string


    public void GatherInfo() throws IOException {

        BufferedReader br = null;

        try {
            String theURL = vancouverweatherquery+apikey;  //this can point to any URL
            URL url = new URL(theURL);
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            //StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }


          //  System.out.println(sb);

        } finally {

            if (br != null) {
                br.close();
            }
        }
    }


    //Iterates through the string to retrieve clarity, wind speed and temperature.
    //The needed information is assigned to the above fields.

    public void AssignInfo(){


       for (int q = 0; q < 74; q++){

            char M = 'm';
            char a = 'a';
            char i = 'i';
            char n = 'n';

            if((sb.charAt(q) == M) && (sb.charAt(q+1) == a) && (sb.charAt(q+2) == i)&& (sb.charAt(q+3) == n)){

                char char1 = sb.charAt(q +7);
                char char2 = sb.charAt(q +8);
                char char3 = sb.charAt(q +9);
                char char4 = sb.charAt(q +10);
                char char5 = sb.charAt(q +11);


                StringBuilder thing = new StringBuilder().append(char1).append(char2).append(char3).append(char4).append(char5);

                cee = (thing.toString());

            }



        }




        for (int q = 1; q < 160; q++){

            char t = 't';
            char e = 'e';
            char m = 'm';
            char p = 'p';

            if((sb.charAt(q) == t) && (sb.charAt(q+1) == e) && (sb.charAt(q+2) == m)&& (sb.charAt(q+3) == p)){

                char char1 = sb.charAt(q +6);
                char char2 = sb.charAt(q +7);
                char char3 = sb.charAt(q +8);
                char char4 = sb.charAt(q +9);
//                char char5 = sb.charAt(q +10);
//                char char6 = sb.charAt(q +11);


                StringBuilder thing = new StringBuilder().append(char1).append(char2).append(char3).append(char4);//.append(char5).append(char6);

                bee = (Double.parseDouble(thing.toString()) - 273.15);
                bee = round(bee);
            }

        }



        for (int q = 1; q < sb.length(); q++){

            char s = 's';
            char p = 'p';
            char e = 'e';
            char E = 'e';

            if((sb.charAt(q) == s) && (sb.charAt(q+1) == p) && (sb.charAt(q+2) == e)&& (sb.charAt(q+3) == E)){

                char char1 = sb.charAt(q +7);
                char char2 = sb.charAt(q +8);

                StringBuilder thing = new StringBuilder().append(char1).append(char2);

                dee = Double.parseDouble(thing.toString());

            }



        }




        System.out.println(bee);
        System.out.println(cee);
        System.out.println(dee);





    }


    //Uses the retrieved information to determine if today is a Wreck Beach Day

    public String evaluate(){


        if ((bee > 23.0) && (cee.equals("Clear")) && (dee < 8.0))

        {
            return "yes";

        }


        else return "no";


    }





}
