/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.gui;

/**
 *
 * @author Florêncio
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        subMenuVenda = new javax.swing.JMenu();
        menuItemNovaVenda = new javax.swing.JMenuItem();
        menuItemAlterarVenda = new javax.swing.JMenuItem();
        menuItemCancelarVenda = new javax.swing.JMenuItem();
        subMenuCadastro = new javax.swing.JMenu();
        menuItemUsuario = new javax.swing.JMenuItem();
        subMenuCliente = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemAlterarCliente = new javax.swing.JMenuItem();
        menuItemExcluirCliente = new javax.swing.JMenuItem();
        subMenuProduto = new javax.swing.JMenu();
        menuItemNovoProduto = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuItemExcluirProduto = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuItemRelatorioVendas = new javax.swing.JMenuItem();
        menuItemRelatorioEstoque = new javax.swing.JMenuItem();
        menuItemRelatorioUsuarios = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bicicletaria - Versão Alpha 0.0.324");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bicicletaria/imagens/Logo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuArquivo.setMnemonic('A');
        menuArquivo.setText("Arquivo");

        subMenuVenda.setText("Venda");

        menuItemNovaVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNovaVenda.setText("Nova venda");
        subMenuVenda.add(menuItemNovaVenda);

        menuItemAlterarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAlterarVenda.setText("Alterar venda");
        subMenuVenda.add(menuItemAlterarVenda);

        menuItemCancelarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCancelarVenda.setText("Cancelar venda");
        subMenuVenda.add(menuItemCancelarVenda);

        menuArquivo.add(subMenuVenda);

        subMenuCadastro.setText("Cadastro");

        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        subMenuCadastro.add(menuItemUsuario);

        subMenuCliente.setText("Cliente");

        menuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCliente.setText("Novo cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        subMenuCliente.add(menuItemCliente);

        menuItemAlterarCliente.setText("Alterar cliente");
        subMenuCliente.add(menuItemAlterarCliente);

        menuItemExcluirCliente.setText("Excluir cliente");
        subMenuCliente.add(menuItemExcluirCliente);

        subMenuCadastro.add(subMenuCliente);

        subMenuProduto.setText("Produto");

        menuItemNovoProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuItemNovoProduto.setText("Novo produto");
        subMenuProduto.add(menuItemNovoProduto);

        jMenuItem4.setText("Alterar produto");
        subMenuProduto.add(jMenuItem4);

        menuItemExcluirProduto.setText("Excluir Produto");
        subMenuProduto.add(menuItemExcluirProduto);

        subMenuCadastro.add(subMenuProduto);

        menuArquivo.add(subMenuCadastro);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        BarraMenu.add(menuArquivo);

        menuRelatorio.setMnemonic('R');
        menuRelatorio.setText("Relatório");

        menuItemRelatorioVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRelatorioVendas.setText("Vendas");
        menuRelatorio.add(menuItemRelatorioVendas);

        menuItemRelatorioEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRelatorioEstoque.setText("Estoque");
        menuRelatorio.add(menuItemRelatorioEstoque);

        menuItemRelatorioUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRelatorioUsuarios.setText("Usuários");
        menuRelatorio.add(menuItemRelatorioUsuarios);

        BarraMenu.add(menuRelatorio);

        menuAjuda.setMnemonic('u');
        menuAjuda.setText("Ajuda");

        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemSobre);

        BarraMenu.add(menuAjuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-616)/2, (screenSize.height-408)/2, 616, 408);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        JanelaDialogoSobre janelaDialogoSobre = new JanelaDialogoSobre(this, rootPaneCheckingEnabled);
        janelaDialogoSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        JanelaCadastroUsuario janelaCadastroUsuario = new JanelaCadastroUsuario();
        janelaCadastroUsuario.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        //JanelaCadastroCliente janelaCadastroCliente = new JanelaCadastroCliente();
        //janelaCadastroCliente.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_menuItemClienteActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemAlterarCliente;
    private javax.swing.JMenuItem menuItemAlterarVenda;
    private javax.swing.JMenuItem menuItemCancelarVenda;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemExcluirCliente;
    private javax.swing.JMenuItem menuItemExcluirProduto;
    private javax.swing.JMenuItem menuItemNovaVenda;
    private javax.swing.JMenuItem menuItemNovoProduto;
    private javax.swing.JMenuItem menuItemRelatorioEstoque;
    private javax.swing.JMenuItem menuItemRelatorioUsuarios;
    private javax.swing.JMenuItem menuItemRelatorioVendas;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu subMenuCadastro;
    private javax.swing.JMenu subMenuCliente;
    private javax.swing.JMenu subMenuProduto;
    private javax.swing.JMenu subMenuVenda;
    // End of variables declaration//GEN-END:variables
}
