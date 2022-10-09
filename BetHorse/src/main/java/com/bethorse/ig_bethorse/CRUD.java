package com.bethorse.ig_bethorse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CRUD {
    
    int flagl = 0;
    int flagc = 0;

    public int getFlagl() {
        return flagl;
    }

    public void setFlagl(int flagl) {
        this.flagl = flagl;
    }

    public int getFlagc() {
        return flagc;
    }

    public void setFlagc(int flagc) {
        this.flagc = flagc;
    }
    

    public void Logar(Connection con, String email, String senha, int tipo){
        
        try{
            if (tipo == 1){
                
                String sql = "SELECT emailDono, senhaDono FROM dono WHERE emailDono = ? and senhaDono = ?";

                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, email);
                pstm.setString(2, senha);

                ResultSet result = pstm.executeQuery();
                
                if (result.next()){
                    usuDono dono = new usuDono();
                    dono.setVisible(true);
                    dono.setLocationRelativeTo(null);
                    AddCred ad = new AddCred();
                    float saldo = ad.pegarSaldo(con, email, tipo);
                    dono.recebe(con, email, tipo, saldo);
                    this.setFlagl(1);
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso negado.\nConfira se email, senha e tipo de usuário estão corretos", "Erro", JOptionPane.ERROR_MESSAGE);
                    this.setFlagl(0);
                }
                
            } else if (tipo == 2){
                
                String sql = "SELECT emailAp, senhaAp FROM apostador WHERE emailAp = ? and senhaAp = ?";

                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, email);
                pstm.setString(2, senha);
                
                ResultSet result = pstm.executeQuery();
                
                if (result.next()){
                    usuApostador ap = new usuApostador();
                    ap.setVisible(true);
                    ap.setLocationRelativeTo(null);
                    AddCred ad = new AddCred();
                    float saldo = ad.pegarSaldo(con, email, tipo);
                    ap.recebe(con, email, tipo, saldo);
                    this.setFlagl(1);
                } else {
                    JOptionPane.showMessageDialog(null, "Acesso negado.\nConfira se email, senha e tipo de usuário estão corretos", "Erro", JOptionPane.ERROR_MESSAGE);
                    this.setFlagl(0);
                }
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro!!\n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void cadastro(Connection con, long cpf, String usuario, String email, String senha, String telefone, int tipo){
        
        try{
            int idCred = 0;
            String cred = "INSERT INTO creditos (idCredito, saldo) VALUES (null, 0)";
            PreparedStatement ps = con.prepareStatement(cred);
            ps.execute();
            
            String query = "select max(idCredito) from creditos;";
            PreparedStatement stat = con.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stat.executeQuery();
            if (rs.last()){
                idCred = rs.getInt(1);
            }
            
            String sql = "";

            switch (tipo) {
                case 1:
                    sql = "INSERT INTO dono (cpfDono, nomeDono, emailDono, senhaDono, fonedono, IdCreditosDono, idtipoUser) VALUES (?, ?, ?, ?, ?, ?, ?);";
                    break;
                case 2:
                    sql = "INSERT INTO apostador (cpfApostador, nomeAp, emailAp, senhaAp, foneAp, idCredito, idtipoUser) VALUES (?, ?, ?, ?, ?, ?, ?);";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Insira um tipo de usuário!", "Inforrmações inválidas!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
                PreparedStatement pstm = con.prepareStatement(sql);

                Validacoes val = new Validacoes();
                if (val.isCPF(String.valueOf(cpf))){
                    pstm.setLong(1, cpf);
                }
                pstm.setString(2, usuario);
                pstm.setString(3, email);
                pstm.setString(4, senha);
                pstm.setString(5, telefone);
                pstm.setInt(6, idCred);
                pstm.setInt(7, tipo);
                pstm.execute();
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                this.setFlagc(1);
            
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Verifique suas informações e tente novamente!", "Inforrmações inválidas!", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    /*public void excluir(Connection con, String email, int tipo){
        try{
            String senha = JOptionPane.showInputDialog("Insira a sua senha");
            String senhaBd = "";
            
            if (tipo == 1){
                
                String querySenha = "SELECT senhaDono FROM dono WHERE emailDono = ?;";
                PreparedStatement stat = con.prepareStatement(querySenha);
                stat.setString(1, email);
                ResultSet result  = stat.executeQuery();
                while (result.next()){
                    senhaBd = result.getString("senhaDono");
                }
                if (senha.equals(senhaBd)){
                    System.out.println("Senha correta");
                    String query = "SELECT cpfDono FROM dono WHERE emailDono = ?;";
                    stat = con.prepareStatement(query);
                    stat.setString(1, email);
                    result  = stat.executeQuery();
                    while (result.next()){
                        String cpf = result.getString("cpfDono");
                        String delete = "delete from dono where cpfDono = ?;";
                        stat = con.prepareStatement(delete);
                        stat.setString(1, cpf);
                        stat.execute();
                        JOptionPane.showMessageDialog(null, "Conta Excluída!");
                     }
                } else {
                    JOptionPane.showMessageDialog(null, "Senha errada!");
                }
                
            } else if (tipo == 2){
                
                String querySenha = "SELECT senhaAp FROM apostador WHERE emailAp = ?;";
                PreparedStatement stat = con.prepareStatement(querySenha);
                stat.setString(1, email);
                ResultSet result  = stat.executeQuery();
                if (result == null){
                    System.out.println("Usuário não existe");
                } else {
                    while (result.next()){
                    senhaBd = result.getString("senhaAp");
                    }
                    if (senha.equals(senhaBd)){
                        System.out.println("Senha correta");
                        String query = "SELECT cpfAp FROM apostador WHERE emailAp = ?;";
                        stat = con.prepareStatement(query);
                        stat.setString(1, email);
                        result  = stat.executeQuery();
                        while (result.next()){
                            String cpf = result.getString("cpfAp");
                            String delete = "delete from apostador where cpfAp = ?;";
                            stat = con.prepareStatement(delete);
                            stat.setString(1, cpf);
                            stat.execute();
                            JOptionPane.showMessageDialog(null, "Conta Excluída!");
                            log.setVisible(true);
                            us.dispose();
                         }
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha errada!");
                    }
                }
                
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!\n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }*/
}
