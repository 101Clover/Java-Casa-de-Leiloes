/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public boolean cadastrarProduto (ProdutosDTO produto){
        
        
        conn = new conectaDAO().connectDB();
        
       return true; 
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        ProdutosDTO p = new ProdutosDTO (10, "PS5", 4000, "A venda");
        
        listagem.add(p);
        listagem.add(p);
        listagem.add(p);
        listagem.add(p);
        listagem.add(p);
        listagem.add(p);
                
        return listagem;
    }
    
    
    
        
}

