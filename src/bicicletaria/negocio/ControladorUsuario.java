/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.negocio;

import bicicletaria.dao.UsuarioJpaController;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.gui.JanelaLogin;
import bicicletaria.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Florêncio
 */
public class ControladorUsuario {
    
    private static Usuario usuario;
    private static String mensagem;
    public static EntityManagerFactory fabricabic;
    private static UsuarioJpaController dao;

    public ControladorUsuario() {
        usuario = new Usuario();
        mensagem = null;
        fabricabic = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new UsuarioJpaController(fabricabic);
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String aMensagem) {
        mensagem = aMensagem;
    }
    
    public void inserir(Usuario u) {
        Statement st;
        Connection con;
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bicicletaria", "postgres", "root");
            st = con.createStatement();
            String query = "SELECT cpf FROM usuario WHERE cpf = '" + u.getCpf() + "'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
                mensagem = "Já existe um usuário cadastrado com este CPF";
            else if(u.getNome().equals("") || u.getCpf().equals(""))
                mensagem = "Campo vazio!";
            else
                try {
                dao.create(u);
                mensagem = "Usuário cadastrado com sucesso!";
            } catch (PreexistingEntityException ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
