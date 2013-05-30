/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletaria.negocio;

import bicicletaria.dao.ClienteJpaController;
import bicicletaria.dao.exceptions.PreexistingEntityException;
import bicicletaria.gui.JanelaLogin;
import bicicletaria.modelo.Cliente;
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
public class ControladorCliente {
    
    private static Cliente cliente;
    private static String mensagem;
    public static EntityManagerFactory fabricabic;
    private static ClienteJpaController dao;

    public ControladorCliente() {
        cliente = new Cliente();
        mensagem = null;
        fabricabic = Persistence.createEntityManagerFactory("BicicletariaPU");
        dao = new ClienteJpaController(fabricabic);
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        ControladorCliente.mensagem = mensagem;
    }
    public void inserir(Cliente c) {
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
            String query = "SELECT cpf FROM usuario WHERE cpf = '" + c.getCpf() + "'";
            ResultSet rs = st.executeQuery(query);
            if(rs.next())
                mensagem = "Já existe um cliente cadastrado com este CPF";
            else if(c.getNome().equals("") || c.getCpf().equals(""))
                mensagem = "Campo vazio!";
            else
                try {
                    dao.create(c);
                    mensagem = "Cliente cadastrado com sucesso!";
                } catch (PreexistingEntityException ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
