/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.gui;

import bicicletaria.dao.UsuarioJpaController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author George
 */
public class JanelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form JanelaLogin
     */
    public static EntityManagerFactory bicicletaria = Persistence.createEntityManagerFactory("BicicletariaPU");
    private static UsuarioJpaController lista = new UsuarioJpaController(bicicletaria);

    public JanelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 10))); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/LogoLogin.png"))); // NOI18N

        jTextLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });

        jSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/loginOk.png"))); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        jBEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBEntrarKeyPressed(evt);
            }
        });

        jLLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLLogin.setText("Login");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLSenha.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLogin)
                            .addComponent(jLSenha))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(logo)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Entrar no Sistema"); // NOI18N
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-281)/2, (screenSize.height-408)/2, 281, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
     
            String user = jTextLogin.getText().toLowerCase();
            String strpass = jSenha.getText();
            try {
               Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bicicletaria", "postgres", "root");
                    Statement st = con.createStatement();
                    String query = "SELECT login, senha FROM usuario WHERE login = '"+user+"' and senha = '"+strpass+"'";
                    ResultSet rs = st.executeQuery(query);
                    if(rs.next()){

                         new JanelaPrincipal().setVisible(true);
                         this.dispose();
                     
                    }
                    else if(user.equals("")||strpass.equals("")){
                        JOptionPane.showMessageDialog(null,"Campo Vazio", "Error",1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null," O Usuário ou a senha informada está incorreta");
                    }
                }catch (SQLException ex) {
                     Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBEntrarKeyPressed
        
    }//GEN-LAST:event_jBEntrarKeyPressed
     
    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {                
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                new JanelaLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
