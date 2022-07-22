package com.qemist;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener{
    Main m;
    public JPanel[] menu = new JPanel[5];
    public JLabel[] bg = new JLabel[5];
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton ex1;
    JButton ex3;
    JButton ex2 = new JButton();
    JFrame okno = new JFrame();

    public UI(Main m){
        this.m=m;
        ramka();
        generatePanel();
        menu[0].setVisible(true);
    }

    public void ramka(){
        //okno = new JFrame();
        okno.setSize(1280,1024);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setResizable(false);            //nie ma rozciągania i fullscr
        okno.setVisible(true);
        okno.setLayout(null);        //przyciski sie nie rozwalają nawet przy fullscr i rozmieszczenie custom
        ImageIcon img = new ImageIcon("res/logo.png");
        okno.setIconImage(img.getImage());         //dodaje logo w pasku u góry
    }

    public void createPanel(int no, int lno,String s,JPanel[] jp, JLabel[] jl){     //podaję tablice JPanel i JLabel
        jp[no] = new JPanel();                                                  //bo chcę osobne tablice dla menu i dla gry

        jp[no].setSize(1280,1024);
        jp[no].setVisible(false);
        jp[no].setLayout(null);
        okno.add(jp[no]);           //dodaj tworzony panel do okienka

        jl[lno] = new JLabel(new ImageIcon());
        jl[lno].setVisible(true);
        jl[lno].setBounds(0,0,1280,1024);
        ImageIcon bgpic = new ImageIcon(s); //tło, s-ścieżka do pliku
        jl[lno].setIcon(bgpic);
        jp[no].add(jl[lno]);        //dodaj "obrazek" do panelu
    }

    //TUTAJ DEFINIUJEMY FAKTYCZNY WYGLĄD DLA UŻYTKOWNIKA
    public void generatePanel(){
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        ex1 = new JButton();
        ex3 = new JButton();

        //----------------------------------------------------Main Menu-------------------------------------------------
        createPanel(0,0, "src/res/wstep.png", menu, bg);
        b1.addActionListener(this);
        bg[0].add(b1);
        b1.setText("Jak grac?");
        b1.setBounds(550,100,100,50);
        b1.setVisible(true);
        b2.addActionListener(this);
        bg[0].add(b2);
        b2.setText("Rozpocznij gre");
        b2.setBounds(500,300,200,50);
        b2.setVisible(true);
        b3.addActionListener(this);
        bg[0].add(b3);
        b3.setText("Ustawienia");
        b3.setBounds(500,500,200,50);
        b3.setVisible(true);
        b4.addActionListener(this);
        bg[0].add(b4);
        b4.setText("Samouczek");
        b4.setBounds(500,700,200,50);
        b4.setVisible(true);

        //-------------------------------------------------Jak Grać?--------------------------------------------------------------------------------------
        createPanel(1,1, "src/res/wstep.png", menu, bg);
        String txt1 = "Witaj w grze Qemist!\n\nPo rozpoczeciu nowej gry zotstaniesz poproszony o wybranie z listy roztworu, ktory chcesz sporzadzic. " +
                "Domyslnie bedziesz grac na poziomie o najmniejszej trudnosci, w ktorym kazda Twoja akcja bedzie poprzedzona dokladna instrukcja. " +
                "Na tym poziomie popelnienie bledu nie bedzie mozliwe, gra bedzie wymagala wykonania okreslonych akcji, zanim zezwoli na przejscie " +
                "dalej. W glownym UI mozesz to zmienic.\n\n" +
                "Wraz z poziomem trudnosci lista wyboru mieszanin zwieksza sie.";
        JTextArea t1 = new JTextArea(txt1);
        t1.setFont(new Font("Serif", Font.PLAIN, 16));
        t1.setLineWrap(true);
        t1.setWrapStyleWord(true);       //automatycznie tworza się nowe linie ale ZACHOWUJE CALE SLOWA! (wymaga linewrap)
        //t1.setOpaque(false);        //brak białego tła za tekstem
        t1.setEditable(false);
        t1.setBounds(200, 200, 880, 424);
        bg[1].add(t1);
        t1.setVisible(true);
        ex1.addActionListener(this);
        ex1.setText("Powrot do Menu Glownego");
        ex1.setBounds(900,800,250,50);
        ex1.setVisible(true);
        bg[1].add(ex1);

        //------------------------------------USTAWIENIA----------------------
        createPanel(2,2, "src/res/wstep.png", menu, bg);
        JTextArea t2 = new JTextArea("Poziom trudnosci: ");
        t2.setFont(new Font("Serif", Font.PLAIN, 16));
        t2.setLineWrap(true);
        t2.setWrapStyleWord(true);
        //t2.setOpaque(false);
        t2.setEditable(false);
        t2.setBounds(75, 100, 100, 50);
        bg[2].add(t2);
        t2.setVisible(true);
        ex3.addActionListener(this);
        ex3.setText("Powrot do Menu Glownego");
        ex3.setBounds(900,800,250,50);
        ex3.setVisible(true);
        bg[2].add(ex3);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            m.handA.showInfo();
        }
        else if (e.getSource() == ex1 || e.getSource() == ex2 || e.getSource() == ex3){
            m.handA.showMainMenu();
        }
        else if (e.getSource() == b2){
            m.handA.showGame();
        }
        else if (e.getSource() == b3){
            m.handA.showSettings();
        }
    }
}