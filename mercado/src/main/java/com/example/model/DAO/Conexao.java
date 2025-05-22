package com.example.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final static String DRIVE = "com.mysql.jdbc.Driver";
    private final static String BANCO = "jdbc:mysql://localhost:3306/nomeDoBanco";
    private final static String USUARIO = "root";
    private final static String SENHA = "toor";
    private static Connection con;

    public static Connection conectar(){
        try{
            Class.forName(DRIVE);
            con = DriverManager.getConnection(BANCO, USUARIO, SENHA);
        } catch (SQLException | ClassNotFoundException ex){
            con=null;
        }
        return con;
    }

}
