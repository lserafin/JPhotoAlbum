package fi.iki.jka;

import javax.swing.*;

/**
 * Created by ape19 on 13/07/2016.
 */
public class TestMessageViewer implements IMessageViewer {
    public String lastMessageShown = "";
    public void showMessage(String message) {
        this.lastMessageShown = message;
    }
}
