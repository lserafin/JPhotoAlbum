package fi.iki.jka;

import javax.swing.*;

/**
 * Created by ape19 on 13/07/2016.
 */
public class GuiMessageViewer implements IMessageViewer {

    private JFrame frame;
    private String appName;
    private int popUpType;

    public GuiMessageViewer(JFrame frame, String appName, int popUpType) {
        this.frame = frame;
        this.appName = appName;
        this.popUpType = popUpType;
    }


    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this.frame, message,
                this.appName, this.popUpType);
    }
}
