package com.qemist;

public class HandleAction{
    Main m;
    public void showMainMenu(){
        m.ui.menu[0].setVisible(true);
        m.ui.menu[1].setVisible(false);
        m.ui.menu[2].setVisible(false);
        m.gUI.scenes[0].setVisible(false);
    }
    public void showInfo(){
        m.ui.menu[0].setVisible(false);
        m.ui.menu[1].setVisible(true);
        m.ui.menu[2].setVisible(false);
    }
    public void showGame(){
        m.ui.menu[0].setVisible(false);
        m.ui.menu[1].setVisible(false);
        m.ui.menu[2].setVisible(false);
        m.gUI.scenes[0].setVisible(true);
    }
    public void showSettings(){
        m.ui.menu[0].setVisible(false);
        m.ui.menu[1].setVisible(false);
        m.ui.menu[2].setVisible(false);
        m.ui.menu[2].setVisible(true);
    }

    public HandleAction(Main m){
        this.m=m;
    }
}
