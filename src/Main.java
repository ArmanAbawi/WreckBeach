import Construct.Info;
import Construct.Display;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    static Info w = new Info();
    static Display d = new Display();



    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        w.GatherInfo();
        w.AssignInfo();
        d.createGUI(w.evaluate());

    }












}
