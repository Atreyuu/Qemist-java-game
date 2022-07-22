package com.qemist;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameUI{
    Main m;
    JPanel[] scenes = new JPanel[5];    //panel na obrzaki
    JLabel[] gbg = new JLabel[5];       //label na obrazek w tle
    JLabel[] obj = new JLabel[5];       //label na obiekty (początkowe położenie)
    JLabel[] mobj = new JLabel[5];
    JButton disp = new JButton();
    //------------------------------------ORYGINALNE WYMIARY OBIEKTU----------------------------------------
    //-------------------------------UWAGA, FINAL - NEWRALGICZNE MIEJSCE------------------------------------
    final int[] objW = new int[5];
    final int[] objH = new int[5];
    //------------------------------POCZATKOWE I ŚRODKOWE POŁOŻENIE OBUEKTU---------------------------------
    int[] objX = new int[5];
    int[] objY = new int[5];
    boolean b=true;
    boolean[] mid = new boolean[5];

    public GameUI(Main m) {
        this.m=m;
        generateGamePanel();
        //generateObject();
    }

    public void generateGamePanel(){
        //poczętek
        JButton stuffbutt = new JButton();
        JButton subsbutt = new JButton();

        m.ui.createPanel(0,0, "src/res/puste.png", scenes, gbg);
        m.ui.ex2.addActionListener(m.ui);                               //w UI jest ActionListener opisany, tam szukaj
        m.ui.ex2.setText("Powrot do Menu Glownego");
        m.ui.ex2.setBounds(900,800,250,50);
        gbg[0].add(m.ui.ex2);
        m.ui.ex2.setVisible(true);

        stuffbutt.setBounds(10,10, 110,30);
        stuffbutt.setText("Zaopatrzenie");
        gbg[0].add(stuffbutt);
        stuffbutt.setVisible(true);

        subsbutt.setBounds(130,10, 110,30);
        subsbutt.setText("Substancje");
        gbg[0].add(subsbutt);
        subsbutt.setVisible(true);

        //----------------------------------POMOCNICZO ---------------------------------------------------
        /*disp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b==true){
                    moveObjectToTheMiddle(0);
                    b=false;
                }
                else{
                    moveObjectBack(0);
                    b=true;
                }
            }
        });
        disp.setText("Znikacz");
        disp.setBounds(900,100,200,50);
        gbg[0].add(disp);*/
        //-------------------------KONIEC POMOCNICZEGO GUZIKA---------------------------------------------
    }

    /*public void createObject(int x, int y, int w, int h, String s, int ono, JLabel[] jl){
        jl[ono] = new JLabel();
        jl[ono].setBounds(x, y, w, h);          //x,y - gdzie? w,h - jak duży
        ImageIcon objIcon = new ImageIcon(s);
        jl[ono].setIcon(objIcon);
        /*objW[ono] = w;
        objH[ono] = h;
        objX[ono] = x;
        objY[ono] = y;*/
        /*jl[ono].addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                if(mid[ono]==false){
                    moveObjectToTheMiddle(ono);
                }
                else if (mid[ono]==true) {
                    moveObjectBack(ono);
                }
            }
            public void mousePressed(MouseEvent e) {            }
            public void mouseReleased(MouseEvent e) {            }
            public void mouseEntered(MouseEvent e) {            }
            public void mouseExited(MouseEvent e) {            }
        });
    }

    public void generateObject(){
        //------------------------STOJAK Z PALNIKIEM------------------------------------------
        createObject(845,320, 347, 425, "src/res/stojak.png", 0, obj);
        gbg[0].add(obj[0]);
        mid[0] = false;
        createObject(450,320,400,500,"src/res/stojakmid.png", 0, mobj);
        gbg[0].add(mobj[0]);
        mobj[0].setVisible(false);
        //-------------------------------------BULBA------------------------------------------
        createObject(750, 290, 87, 126, "src/res/bulba.png", 1, obj);
        gbg[0].add(obj[1]);
        mid[1] = false;
        createObject(560,330,136,148, "src/res/bulbamid.png", 1, mobj);
        gbg[0].add(mobj[1]);
        mobj[1].setVisible(false);
    }

    public void moveObjectToTheMiddle(int ono){
        obj[ono].setVisible(false);
        mobj[ono].setVisible(true);
        mid[ono] = true;
    }
    public void moveObjectBack(int ono){
        obj[ono].setVisible(true);
        mobj[ono].setVisible(false);
        mid[ono] = false;
    }*/

    /*public void mouseMenu(String etykieta){
        if (etykieta == "device"){
            JPopupMenu popm = new JPopupMenu();
            JMenuItem mi[] = new JMenuItem[2];
            mi[0] = new JMenuItem("Uzyj");
        }
        else if (etykieta == "fluid"){
            JPopupMenu popm = new JPopupMenu();
        }
        else if (etykieta == "powder"){
            JPopupMenu popm = new JPopupMenu();
        }

    }

    public void objectInUse(){

    }*/

}
