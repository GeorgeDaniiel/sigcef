/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria;

import bicicletaria.dao.UsuarioJpaController;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.gui.JanelaLogin;
import bicicletaria.modelo.Usuario;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author George
 */
public class Bicicletaria {
    public static EntityManagerFactory fabricabic = Persistence.createEntityManagerFactory("BicicletariaPU");
    private static JanelaLogin janelaLogin;    
   // private static Usuario usuario = new Usuario();
    private static UsuarioJpaController dao = new UsuarioJpaController(fabricabic);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PreexistingEntityException, Exception {
        janelaLogin = new JanelaLogin();
        //janelaPrincipal = new JanelaPrincipal();
        janelaLogin.setVisible(true);
        
        //usuario.setId(1);
        //usuario.setCpf("1000900");
        //usuario.setNome("George");
        //usuario.setId(2);
        //usuario.setCpf(textFieldCPF.getText());
        //usuario.setNome(textFieldNome.getText());
        
        //dao.create(usuario);
        
        
       
    }
}