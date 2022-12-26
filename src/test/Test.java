package test;

import javax.swing.UIManager;

import view.LMSView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LMSView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}