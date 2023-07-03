/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author andre
 */
public class TelaMeusCursos extends javax.swing.JFrame {
    private Usuario logado;
    /**
     * Creates new form TelaMeusCursos
     */
    public TelaMeusCursos() {
        super ("Meus cursos"); 
        initComponents();        
        setLocationRelativeTo(null);
    }

    public TelaMeusCursos(Usuario logado) {
        super ("Meus cursos"); 
        initComponents();
        epLinkVC1.setVisible(false);
        epLinkVC2.setVisible(false);
        epLinkVC3.setVisible(false);
        epLinkVC4.setVisible(false);
        epLinkEC1.setVisible(false);
        epLinkEC2.setVisible(false);
        epLinkEC3.setVisible(false);
        epLinkEC4.setVisible(false);
        setLocationRelativeTo(null);        
        txtNCurso1.setText(logado.getCurso1());
        txtNCurso2.setText(logado.getCurso2());
        txtNCurso3.setText(logado.getCurso3());
        txtNCurso4.setText(logado.getCurso4());

        
        epLinkVC1.setEditable(false);
        epLinkVC1.setContentType("text/html");
        
        if (logado.getCurso1().equals("Java")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1F95SyJPiH6qQV6DFqNMiHgDPB0OorAVw?usp=share_link\">Aulas Java</a></html>");
        }else if(logado.getCurso1().equals("JavaScript")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1Fu06ZdDONGLsWSH5PY5GlqnxPK7YR9pq?usp=share_link\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso1().equals("Python")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1stSLGUYCRNn36bZFFvspKi6iD7XLNg2W?usp=share_link\">Aulas Python</a></html>");
        }else if(logado.getCurso1().equals("C#")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Aulas c#</a></html>");
        }
        else if(logado.getCurso1().equals(" ")) {
          epLinkVC3.setVisible(false);
        }
        else{
          epLinkVC1.setVisible(true);
          epLinkVC1.setText("aula indisponível");              
        }
        epLinkVC1.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });
        
        
        epLinkVC2.setEditable(false);
        epLinkVC2.setContentType("text/html");
        if (logado.getCurso2().equals("Java")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1F95SyJPiH6qQV6DFqNMiHgDPB0OorAVw?usp=share_link\">Aulas Java</a></html>");
        }else if(logado.getCurso2().equals("JavaScript")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1Fu06ZdDONGLsWSH5PY5GlqnxPK7YR9pq?usp=share_link\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso2().equals("Python")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1stSLGUYCRNn36bZFFvspKi6iD7XLNg2W?usp=share_link\">Aulas Python</a></html>");
        }else if(logado.getCurso2().equals("C#")) {
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Aulas C#</a></html>");
        }
        else if(logado.getCurso2().equals(" ")) {
          epLinkVC2.setVisible(false);
        }
        else{
          epLinkVC2.setVisible(true);
          epLinkVC2.setText("aula indisponível");              
        }
        
        epLinkVC2.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });
        
        
        epLinkVC3.setEditable(false);
        epLinkVC3.setContentType("text/html");
        if (logado.getCurso3().equals("Java")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1F95SyJPiH6qQV6DFqNMiHgDPB0OorAVw?usp=share_link\">Aulas Java</a></html>");
        }else if(logado.getCurso3().equals("JavaScript")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1Fu06ZdDONGLsWSH5PY5GlqnxPK7YR9pq?usp=share_link\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso3().equals("Python")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1stSLGUYCRNn36bZFFvspKi6iD7XLNg2W?usp=share_link\">Aulas Python</a></html>");
        }else if(logado.getCurso3().equals("C#")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Aulas C#</a></html>");
        }
        else if(logado.getCurso3().equals(" ")) {
          epLinkVC3.setVisible(false);
        }
        else{
          epLinkVC3.setVisible(true);
          epLinkVC3.setText("aula indisponível");              
        }
        
        
        epLinkVC3.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });


        epLinkVC4.setEditable(false);
        epLinkVC4.setContentType("text/html");
        if (logado.getCurso4().equals("Java")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1F95SyJPiH6qQV6DFqNMiHgDPB0OorAVw?usp=share_link\">Aulas Java</a></html>");
        }else if(logado.getCurso4().equals("JavaScript")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1Fu06ZdDONGLsWSH5PY5GlqnxPK7YR9pq?usp=share_link\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso4().equals("Python")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1stSLGUYCRNn36bZFFvspKi6iD7XLNg2W?usp=share_link\">Aulas Python</a></html>");
        }else if(logado.getCurso4().equals("C#")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1LbtO2UpUOCLU8vzJkQCy3NnxV0HJPDKC?usp=share_link\">Aulas C#</a></html>");
        }
        else if(logado.getCurso4().equals(" ")) {
          epLinkVC4.setVisible(false);            
        }
        else{
          epLinkVC4.setVisible(true);
          epLinkVC4.setText("aula indisponível");              
        }
        
        
        epLinkVC4.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });

        epLinkEC1.setEditable(false);
        epLinkEC1.setContentType("text/html");
         if (logado.getCurso1().equals("Java")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1hy4EcMZrtrXX4v8D4tkXHrG4S9lg8N42?usp=share_link\">Exercícios Java</a></html>");
        }else if(logado.getCurso1().equals("JavaScript")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1cCT1SLQod7NugibXlLpKnEQCFXQ56pE3?usp=share_link\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso1().equals("Python")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1cYVIEfmSHq_NL18_PR_Q0sSdD0QKCwqw?usp=share_link\">Exercícios Python</a></html>");
        }else if(logado.getCurso1().equals("C#")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Exercícios C#</a></html>");
        }
        else if(logado.getCurso1().equals(" ")) {
          epLinkEC1.setVisible(false);            
        }
        else{
          epLinkEC1.setVisible(true);
          epLinkEC1.setText("aula indisponível");              
        }
         
        epLinkEC1.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });

        epLinkEC2.setEditable(false);
        epLinkEC2.setContentType("text/html");
         if (logado.getCurso2().equals("Java")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1hy4EcMZrtrXX4v8D4tkXHrG4S9lg8N42?usp=share_link\">Exercícios Java</a></html>");
        }else if(logado.getCurso2().equals("JavaScript")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1cCT1SLQod7NugibXlLpKnEQCFXQ56pE3?usp=share_link\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso2().equals("Python")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1cYVIEfmSHq_NL18_PR_Q0sSdD0QKCwqw?usp=share_link\">Exercícios Python</a></html>");
        }else if(logado.getCurso2().equals("C#")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Exercícios C#</a></html>");
        }
        else if(logado.getCurso2().equals(" ")) {
          epLinkEC2.setVisible(false);            
        }
        else{
          epLinkEC2.setVisible(true);
          epLinkEC2.setText("aula indisponível");              
        }
        
         
        epLinkEC2.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });  

        epLinkEC3.setEditable(false);
        epLinkEC3.setContentType("text/html");
         if (logado.getCurso3().equals("Java")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1hy4EcMZrtrXX4v8D4tkXHrG4S9lg8N42?usp=share_link\">Exercícios Java</a></html>");
        }else if(logado.getCurso3().equals("JavaScript")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1cCT1SLQod7NugibXlLpKnEQCFXQ56pE3?usp=share_link\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso3().equals("Python")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1cYVIEfmSHq_NL18_PR_Q0sSdD0QKCwqw?usp=share_link\">Exercícios Python</a></html>");
        }else if(logado.getCurso3().equals("C#")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Exercícios C#</a></html>");
        }
        else if(logado.getCurso3().equals(" ")) {
          epLinkEC3.setVisible(false);            
        }
        else{
          epLinkEC3.setVisible(true);
          epLinkEC3.setText("aula indisponível");              
        }
         
         
        epLinkEC3.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });  

        epLinkEC4.setEditable(false);
        epLinkEC4.setContentType("text/html");
         if (logado.getCurso4().equals("Java")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1hy4EcMZrtrXX4v8D4tkXHrG4S9lg8N42?usp=share_link\">Exercícios Java</a></html>");
        }else if(logado.getCurso4().equals("JavaScript")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1cCT1SLQod7NugibXlLpKnEQCFXQ56pE3?usp=share_link\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso4().equals("Python")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1cYVIEfmSHq_NL18_PR_Q0sSdD0QKCwqw?usp=share_link\">Exercícios Python</a></html>");
        }else if(logado.getCurso4().equals("C#")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://drive.google.com/drive/folders/1cWOnx0fL4VSN_G1RCct9r7VjzG8-bjvf?usp=share_link\">Exercícios C#</a></html>");
        }
        else if(logado.getCurso4().equals(" ")) {
          epLinkEC4.setVisible(false);            
        }
        else{
          epLinkEC4.setVisible(true);
          epLinkEC4.setText("aula indisponível");              
        }
         
        epLinkEC4.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }); 
        if(logado.getCurso1().equals(" ")){
           JOptionPane.showMessageDialog(null,"Você ainda não está cadastrado em nenhum curso! \n Para se cadastrar acesse a área Cursos Disponíveis."); 
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);           
        }
        this.logado = logado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        txtNCurso1 = new javax.swing.JLabel();
        txtNCurso2 = new javax.swing.JLabel();
        txtNCurso3 = new javax.swing.JLabel();
        txtNCurso4 = new javax.swing.JLabel();
        epLinkVC2 = new javax.swing.JEditorPane();
        epLinkVC1 = new javax.swing.JEditorPane();
        epLinkVC3 = new javax.swing.JEditorPane();
        epLinkVC4 = new javax.swing.JEditorPane();
        epLinkEC4 = new javax.swing.JEditorPane();
        epLinkEC3 = new javax.swing.JEditorPane();
        epLinkEC2 = new javax.swing.JEditorPane();
        epLinkEC1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        imgFundoMeusCursos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 340, 100, 30));

        txtNCurso1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso1.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso1.setText("jLabel1");
        getContentPane().add(txtNCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        txtNCurso2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso2.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso2.setText("jLabel1");
        getContentPane().add(txtNCurso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txtNCurso3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso3.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso3.setText("jLabel1");
        getContentPane().add(txtNCurso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        txtNCurso4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso4.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso4.setText("jLabel1");
        getContentPane().add(txtNCurso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        getContentPane().add(epLinkVC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        getContentPane().add(epLinkVC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        getContentPane().add(epLinkVC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));
        getContentPane().add(epLinkVC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));
        getContentPane().add(epLinkEC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));
        getContentPane().add(epLinkEC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));
        getContentPane().add(epLinkEC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));
        getContentPane().add(epLinkEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 440, 190));

        imgFundoMeusCursos.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111060429163200682/TelaMeusCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgFundoMeusCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu tm = new TelaMenu(logado);
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMeusCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JEditorPane epLinkEC1;
    private javax.swing.JEditorPane epLinkEC2;
    private javax.swing.JEditorPane epLinkEC3;
    private javax.swing.JEditorPane epLinkEC4;
    private javax.swing.JEditorPane epLinkVC1;
    private javax.swing.JEditorPane epLinkVC2;
    private javax.swing.JEditorPane epLinkVC3;
    private javax.swing.JEditorPane epLinkVC4;
    private javax.swing.JLabel imgFundoMeusCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtNCurso1;
    private javax.swing.JLabel txtNCurso2;
    private javax.swing.JLabel txtNCurso3;
    private javax.swing.JLabel txtNCurso4;
    // End of variables declaration//GEN-END:variables
}
