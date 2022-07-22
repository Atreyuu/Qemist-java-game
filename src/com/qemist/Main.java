package com.qemist;
import javax.swing.*;

public class Main extends JFrame {

    //POŁĄCZENIA MIĘDZY KLASAMI, POZWALA NA SIĘGANIE Z KLASY DO KLASY
    UI ui = new UI(this);
    HandleAction handA = new HandleAction(this);
    GameUI gUI = new GameUI(this);
    //Stuff s = new Stuff(this);

    public static void main(String[] args) {
        new Main();

    }

    public Main(){

    }

}
