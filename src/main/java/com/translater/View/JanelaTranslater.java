package com.translater.View;

import com.translater.Translate.Internationalization;
import com.translater.Translate.Parser;
import com.translater.Translate.ReturnMessagePane;
import com.translater.Translate.TranslateControl;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author mauricio.rodrigues
 */
public final class JanelaTranslater extends javax.swing.JPanel {

    private File selectedDirectory;
    private ResourceBundle traducoes;
    private Parser parse;
    private TranslateControl translate;
    
    public JanelaTranslater(ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        this.traduzir();
        
        parse = new Parser();
        parse.verificaPastas();
    }
    
    public void traduzir(){
        this.lb_SoftwareName.setText(this.traducoes.getString("lb_SoftwareName"));
        this.lb_InitialFile.setText(this.traducoes.getString("lb_InitialFile"));
        this.lb_TargetFile.setText(this.traducoes.getString("lb_TargetFile"));
        this.lb_InitialLanguage.setText(this.traducoes.getString("lb_InitialLanguage"));
        this.lb_TargetLaguage.setText(this.traducoes.getString("lb_TargetLanguage"));
        this.lb_ProgramLanguage.setText(this.traducoes.getString("lb_ProgramLanguage"));
        this.bt_FilePath.setText(this.traducoes.getString("bt_FilePath"));
        this.bt_Run.setText(this.traducoes.getString("bt_Run"));
    }
    
    public void processaTraducao() throws IOException{
        String filePath, targetFileName, initialLanguage, targetLanguage;
        filePath = tf_InitialFile.getText();
        targetFileName = tf_TargetFile.getText();
        initialLanguage = tf_InitialLanguage.getText();
        targetLanguage = tf_TargetLanguage.getText();
        
        translate = new TranslateControl();
        translate.processaTraducao(filePath, targetFileName, initialLanguage, targetLanguage);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_SoftwareName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_ProgramLanguage = new javax.swing.JLabel();
        cb_ProgramLanguage = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        lb_InitialFile = new javax.swing.JLabel();
        tf_InitialFile = new javax.swing.JTextField();
        lb_InitialLanguage = new javax.swing.JLabel();
        tf_InitialLanguage = new javax.swing.JTextField();
        tf_TargetLanguage = new javax.swing.JTextField();
        lb_TargetLaguage = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        bt_Run = new javax.swing.JButton();
        bt_FilePath = new javax.swing.JButton();
        lb_TargetFile = new javax.swing.JLabel();
        tf_TargetFile = new javax.swing.JTextField();

        lb_SoftwareName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_SoftwareName.setText("<software name>");

        lb_ProgramLanguage.setText("<program language>");

        cb_ProgramLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portuguese", "English", "Spanish" }));
        cb_ProgramLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ProgramLanguageActionPerformed(evt);
            }
        });

        lb_InitialFile.setText("<initial file>");

        tf_InitialFile.setEditable(false);

        lb_InitialLanguage.setText("<initial lang>");

        lb_TargetLaguage.setText("<target lang>");

        bt_Run.setText("<run>");
        bt_Run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RunMouseClicked(evt);
            }
        });

        bt_FilePath.setText("<file path>");
        bt_FilePath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_FilePathMouseClicked(evt);
            }
        });

        lb_TargetFile.setText("<target file>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_ProgramLanguage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ProgramLanguage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_FilePath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_Run))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lb_SoftwareName)
                        .addGap(0, 203, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_InitialLanguage)
                            .addComponent(lb_InitialFile)
                            .addComponent(lb_TargetLaguage)
                            .addComponent(lb_TargetFile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_TargetFile)
                            .addComponent(tf_TargetLanguage)
                            .addComponent(tf_InitialFile)
                            .addComponent(tf_InitialLanguage))))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_SoftwareName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_ProgramLanguage)
                    .addComponent(cb_ProgramLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_InitialFile)
                    .addComponent(tf_InitialFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TargetFile)
                    .addComponent(tf_TargetFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_InitialLanguage)
                    .addComponent(tf_InitialLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TargetLaguage)
                    .addComponent(tf_TargetLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Run)
                    .addComponent(bt_FilePath))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_FilePathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_FilePathMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File initialDir = new File(".\\input");
        fc.setCurrentDirectory(initialDir);
        fc.setDialogTitle(this.traducoes.getString("dg_DialogTitle"));
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.selectedDirectory = fc.getSelectedFile();
            this.tf_InitialFile.setText(this.selectedDirectory.getAbsolutePath());
        } 
    }//GEN-LAST:event_bt_FilePathMouseClicked

    private void bt_RunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RunMouseClicked
        try {
            processaTraducao();
            ReturnMessagePane.informationPainel(this.traducoes.getString("mg_ReturnSuccessDetail"), this.traducoes.getString("mg_ReturnSuccess"));
        } catch (IOException ex) {
            ReturnMessagePane.errorPainel(this.traducoes.getString("mg_ReturnErrorDetail"), this.traducoes.getString("mg_ReturnError"));
            Logger.getLogger(JanelaTranslater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_RunMouseClicked

    private void cb_ProgramLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ProgramLanguageActionPerformed
        String selectedLanguage = cb_ProgramLanguage.getSelectedItem().toString();
        Internationalization traduzir = new Internationalization();
        switch (selectedLanguage) {
            case "English":
                this.traducoes = traduzir.internacionaliza("en", "US");
                this.traduzir();
                break;
            case "Portuguese":
                this.traducoes = traduzir.internacionaliza("pt", "BR");
                this.traduzir();
                break;
            case "Spanish":
                this.traducoes = traduzir.internacionaliza("es", "ES");
                this.traduzir();
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_cb_ProgramLanguageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_FilePath;
    private javax.swing.JButton bt_Run;
    private javax.swing.JComboBox<String> cb_ProgramLanguage;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_InitialFile;
    private javax.swing.JLabel lb_InitialLanguage;
    private javax.swing.JLabel lb_ProgramLanguage;
    private javax.swing.JLabel lb_SoftwareName;
    private javax.swing.JLabel lb_TargetFile;
    private javax.swing.JLabel lb_TargetLaguage;
    private javax.swing.JTextField tf_InitialFile;
    private javax.swing.JTextField tf_InitialLanguage;
    private javax.swing.JTextField tf_TargetFile;
    private javax.swing.JTextField tf_TargetLanguage;
    // End of variables declaration//GEN-END:variables
}
