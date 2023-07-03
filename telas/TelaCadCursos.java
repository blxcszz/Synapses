/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaCadCursos extends javax.swing.JFrame {
    private Administrador admlogado;
    /**
     * Creates new form TelaCadCursos
     */
    public TelaCadCursos() {
        super ("Cadastro de cursos"); 
        initComponents();  
        buscarCursos();
        setLocationRelativeTo(null);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setLineWrap(true);
        
    }
    public TelaCadCursos(Administrador admlogado) {
        super ("Cadastro de cursos"); 
        initComponents();  
        buscarCursos();
        setLocationRelativeTo(null);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setLineWrap(true);
        this.admlogado = admlogado;
        
    }
    private void buscarCursos (){
        try{
            DAO dao = new DAO();
            Cursos [] cursos = dao.obterCursos();
            cbCursos.setModel(new DefaultComboBoxModel<>(cursos));
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Cursos indisponíveis, tente novamente mais tarde.");
        e.printStackTrace();
        }
    }
   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCad = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        cbAulas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbCursos = new javax.swing.JComboBox<>();
        spAulas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });
        getContentPane().add(btnCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 140, 32));

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID do curso: "));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 300, 60));

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome: "));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 300, 60));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 140, 32));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 140, 32));

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 140, 32));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição: "));
        jScrollPane1.setViewportView(txtDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 310, 150));

        cbAulas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------", "Iniciante", "Básico", "Intermediário", "Avançado", " ", " ", " " }));
        cbAulas.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));
        cbAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAulasActionPerformed(evt);
            }
        });
        getContentPane().add(cbAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 300, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("<html>(Para remover, preencha    apenas o id do curso)</html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 120, -1));

        cbCursos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbCursosCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        cbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursosActionPerformed(evt);
            }
        });
        getContentPane().add(cbCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 300, -1));

        spAulas.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade de aulas: "));
        getContentPane().add(spAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 300, 60));

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111060427363864627/TelaCadCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        String nomeCurso = txtNome.getText();
        String tipoCurso = cbAulas.getSelectedItem().toString();
        int qtdAulas = Integer.parseInt(spAulas.getText());
        String descricao = txtDescricao.getText();
        if (nomeCurso == null || nomeCurso.length() == 0 || tipoCurso == null || tipoCurso.length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha nome e categoria");
        }
        else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar esse novo curso?");
                if (escolha == JOptionPane.YES_OPTION){
                    Cursos curso = new Cursos(nomeCurso, tipoCurso,qtdAulas,descricao);
                    DAO dao = new DAO();
                    dao.inserirCurso(curso);
                    JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso");
                    txtNome.setText("");
                    cbAulas.setSelectedItem(1);
                    spAulas.setText("");
                    dao.obterCursos();
                }            
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde");
                e.printStackTrace();
            }
    }
    }//GEN-LAST:event_btnCadActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Você deseja atualizar o curso?");
        if (escolha == JOptionPane.YES_OPTION){
        try{
            int id = Integer.parseInt (txtId.getText());
            String nome = txtNome.getText();
            String tipo = cbAulas.getSelectedItem().toString();
            String descricao = txtDescricao.getText();
            int qtdAulas = Integer.parseInt(spAulas.getText());
            
            Cursos curso = new Cursos(id, nome, tipo,qtdAulas,descricao);
            DAO dao = new DAO();
            dao.atualizarCurso(curso);
            JOptionPane.showMessageDialog(null, "Curso atualizado com sucesso");
            dao.obterCursos();
            txtId.setText("");
            txtNome.setText("");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
            e.printStackTrace();
}
}// TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuAdm tma = new TelaMenuAdm(admlogado);
        tma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String campoid = txtId.getText();
        if (campoid == null || campoid.length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha nome e categoria");
        }
        else{
        int escolha = JOptionPane.showConfirmDialog(null, "Remover curso?");
        if (escolha == JOptionPane.YES_OPTION){
        try{
            int id = Integer.parseInt(txtId.getText().toString());
            Cursos curso = new Cursos (id);
            DAO dao = new DAO();
            dao.removerCurso(curso);
            JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
            dao.obterCursos();
            txtNome.setText("");
            txtId.setText("");
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
        e.printStackTrace();
        }
        }
      }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void cbAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAulasActionPerformed

    private void cbCursosCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbCursosCaretPositionChanged
        
    }//GEN-LAST:event_cbCursosCaretPositionChanged

    private void cbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursosActionPerformed

        int id = cbCursos.getSelectedIndex();
        try{
        DAO dao = new DAO();
        Cursos [] cursos = dao.obterCursos();
        txtId.setText(Integer.toString((cursos[id].getId())));
        spAulas.setText(Integer.toString((cursos[id].getQtdAulas())));
        cbAulas.setSelectedItem(cursos[id].getTipo());
        txtNome.setText(cursos[id].getNome());
        txtDescricao.setText(cursos[id].getDescricao());        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Cursos indisponíveis, tente novamente mais tarde.");
        e.printStackTrace();    
        }
    }//GEN-LAST:event_cbCursosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbAulas;
    private javax.swing.JComboBox<Cursos> cbCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField spAulas;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
