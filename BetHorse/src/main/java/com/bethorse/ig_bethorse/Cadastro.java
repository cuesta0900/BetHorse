/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bethorse.ig_bethorse;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author 22159666
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        setExtendedState(Cadastro.MAXIMIZED_BOTH);
        jLabel1.requestFocusInWindow();
        setSize(1176,664);
        getContentPane().setBackground(new Color(50, 50, 50));
        URL url = this.getClass().getResource("/Imagens/cavalo.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameCad = new javax.swing.JTextField();
        emailCad = new javax.swing.JTextField();
        telCad = new javax.swing.JTextField();
        senhaCad = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        senhaField = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();
        cpfCad = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        mostrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        usernameCad.setBackground(new java.awt.Color(128, 128, 128));
        usernameCad.setForeground(new java.awt.Color(255, 255, 255));
        usernameCad.setText("Nome completo");
        usernameCad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameCadFocusGained(evt);
            }
        });
        usernameCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameCadMouseClicked(evt);
            }
        });
        usernameCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameCadActionPerformed(evt);
            }
        });
        jPanel2.add(usernameCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 231, -1));

        emailCad.setBackground(new java.awt.Color(128, 128, 128));
        emailCad.setForeground(new java.awt.Color(255, 255, 255));
        emailCad.setText("Email");
        emailCad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailCadFocusGained(evt);
            }
        });
        emailCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailCadMouseClicked(evt);
            }
        });
        jPanel2.add(emailCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 231, -1));

        telCad.setBackground(new java.awt.Color(128, 128, 128));
        telCad.setForeground(new java.awt.Color(255, 255, 255));
        telCad.setText("Telefone");
        telCad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telCadFocusGained(evt);
            }
        });
        telCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telCadMouseClicked(evt);
            }
        });
        jPanel2.add(telCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 231, -1));

        senhaCad.setForeground(new java.awt.Color(255, 255, 255));
        senhaCad.setText("  Senha");
        senhaCad.setMaximumSize(new java.awt.Dimension(32, 15));
        senhaCad.setPreferredSize(new java.awt.Dimension(37, 15));
        senhaCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senhaCadMouseClicked(evt);
            }
        });
        jPanel2.add(senhaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, 30));

        jComboBox1.setBackground(new java.awt.Color(128, 128, 128));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o seu tipo de usu??rio", "Dono", "Apostador" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 231, -1));

        senhaField.setBackground(new java.awt.Color(128, 128, 128));
        senhaField.setForeground(new java.awt.Color(255, 255, 255));
        senhaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFieldFocusGained(evt);
            }
        });
        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(senhaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 231, -1));

        Entrar.setBackground(new java.awt.Color(0, 74, 173));
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Cadastrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 93, 56));

        cpfCad.setBackground(new java.awt.Color(128, 128, 128));
        cpfCad.setForeground(new java.awt.Color(255, 255, 255));
        cpfCad.setText("CPF");
        cpfCad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfCadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfCadFocusLost(evt);
            }
        });
        cpfCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfCadMouseClicked(evt);
            }
        });
        cpfCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfCadActionPerformed(evt);
            }
        });
        jPanel2.add(cpfCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 231, -1));

        back.setBackground(new java.awt.Color(0, 74, 173));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Voltar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        mostrarSenha.setBackground(new java.awt.Color(128, 128, 128));
        mostrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        mostrarSenha.setText("Mostrar Senha");
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(mostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameCadActionPerformed

    String nome;
    long cpf;
    String email;
    String senha;
    String tel;
    int tipo;
    
    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

        Validacoes val  = new Validacoes();
        
        if (val.validarNome(usernameCad.getText())){
            nome = usernameCad.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Insira seu nome completo!!", "Erro", JOptionPane.ERROR_MESSAGE);
            usernameCad.setText("Nome completo");
        }

        if (val.isCPF(cpfCad.getText())){
            cpf = Long.parseLong(cpfCad.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Insira um CPF v??lido!!", "Erro", JOptionPane.ERROR_MESSAGE);
            cpfCad.setText("CPF");
        }

        tipo = jComboBox1.getSelectedIndex();

        if(val.isValidEmailAddressRegex(emailCad.getText())){
            email = emailCad.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Insira um e-mail v??lido!!", "Erro", JOptionPane.ERROR_MESSAGE);
            emailCad.setText("E-mail");
        }

        if(val.isValidPassword(senhaField.getText())){
            senha = senhaField.getText();
        } else {
            JOptionPane.showMessageDialog(null, "A senha deve conter letras mai??sculas, letras min??sculas, caracteres especiais e pelo menos 8 caracteres", "Senha inv??lida", JOptionPane.ERROR_MESSAGE);
            senhaField.setText("Senha");
        }

        if(val.validarTelefone(telCad.getText())){
            tel = telCad.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Insira um celular v??lido!!", "Erro", JOptionPane.ERROR_MESSAGE);
            telCad.setText("Telefone");
        }

        ConexaoBD conexao = new ConexaoBD();
        Connection con = conexao.connectionMySql();
        CRUD lc = new CRUD();

        lc.cadastro(con, cpf, nome, email, senha, tel, tipo);
        if (lc.getFlagc() == 1){
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_EntrarActionPerformed

    private void usernameCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameCadMouseClicked
        usernameCad.setText("");
    }//GEN-LAST:event_usernameCadMouseClicked

    private void cpfCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfCadMouseClicked
        cpfCad.setText("");
    }//GEN-LAST:event_cpfCadMouseClicked

    private void emailCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailCadMouseClicked
        emailCad.setText("");
    }//GEN-LAST:event_emailCadMouseClicked

    private void telCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telCadMouseClicked
        telCad.setText("");
    }//GEN-LAST:event_telCadMouseClicked

    private void usernameCadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameCadFocusGained
        usernameCad.setText("");
    }//GEN-LAST:event_usernameCadFocusGained

    private void cpfCadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfCadFocusGained
        cpfCad.setText("");
    }//GEN-LAST:event_cpfCadFocusGained

    private void emailCadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailCadFocusGained
        emailCad.setText("");
    }//GEN-LAST:event_emailCadFocusGained

    private void senhaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFieldFocusGained
        senhaCad.setVisible(false);
    }//GEN-LAST:event_senhaFieldFocusGained

    private void telCadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telCadFocusGained
        telCad.setText("");
    }//GEN-LAST:event_telCadFocusGained

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFieldActionPerformed

    private void cpfCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfCadActionPerformed

    private void cpfCadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfCadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfCadFocusLost
                               
    private void senhaCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senhaCadMouseClicked
        senhaCad.setVisible(false);
        senhaField.requestFocusInWindow();
    }//GEN-LAST:event_senhaCadMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        // TODO add your handling code here:
        if(mostrarSenha.isSelected()){
            senhaField.setEchoChar('\u0000');
        }
        else {
            senhaField.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed
                                
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton back;
    private javax.swing.JTextField cpfCad;
    private javax.swing.JTextField emailCad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox mostrarSenha;
    private javax.swing.JLabel senhaCad;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JTextField telCad;
    private javax.swing.JTextField usernameCad;
    // End of variables declaration//GEN-END:variables
}
