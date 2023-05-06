package com.translater.Translate;

import javax.swing.JOptionPane;

public class ReturnMessagePane {
    
    public static void errorPainel(String messageDetail, String message) {
        JOptionPane.showMessageDialog(null, message, messageDetail, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void informationPainel(String messageDetail, String message) {
        JOptionPane.showMessageDialog(null, message, messageDetail, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
