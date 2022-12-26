package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

import view.LMSView;

/**
 *
 * @author Asus
 */

public class LMSController implements Action{
    public LMSView view;


    public LMSController(LMSView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cm = e.getActionCommand();
        switch (cm) {
            case "Add":
                try {
                    this.view.AddBookAction();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(view,"Error "+e2.getMessage()+"\n"+"Add Failed!");
                }
                break;
            case "Update":
                this.view.ShowChosenBook();
                break;
            case "Delete":
                try {
                    this.view.DeleteAction();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(view,"Error "+e2.getMessage()+"\n"+"Delete Failed!");
                }
                break;
            case "Cancel":
                this.view.ReloadData();
                break;
            case "Search":
                this.view.SearchAction();
                break;
            case "Exit":
                this.view.Exit();
                break;
            case "Save":
                this.view.SaveFileAction();
                break;
            case "Open":
                this.view.OpenFileAction();
                break;
        }
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

}