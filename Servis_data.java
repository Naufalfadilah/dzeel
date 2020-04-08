/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm104.entity;

import com.app.uts.npm104.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Servis_data {
    private Connection connection;

    public Servis_data() {
        connection = ConnectionUtil.getConnection();
    }
    
    public List<Servis> getAll(){
        List<Servis> List = new ArrayList<>();
        String sql = "SELECT * FROM bengkel";
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            Servis srv;
            while(rs.next()){
                srv = new Servis();
                srv.setId(rs.getString("id"));
                srv.setNama(rs.getString("nama"));
                srv.setMerk(rs.getString("merk"));
                srv.setPemilik(rs.getString("pemilik"));
                srv.setHarga(rs.getDouble("harga"));
                List.add(srv);    
            }
            
        } catch (Exception e) {
            System.out.println("Error get All " + e.getMessage());
        }
        return List;
    }
    
    public Servis getByID(String nim){
        String sql = "SELECT * FROM bengkel WHERE id=?";
        Servis srv = null;
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nim);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                srv = new Servis();
                srv.setId(rs.getString("id"));
                srv.setNama(rs.getString("nama"));
                srv.setMerk(rs.getString("merk"));
                srv.setPemilik(rs.getString("pemilik"));
                srv.setHarga(rs.getDouble("harga"));
            }
        }catch (Exception e){
        }
        return srv;
    }
    
    public boolean insert(Servis srv){
        boolean status = false;
        String sql = "INSERT INTO bengkel VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, srv.getId());
            statement.setString(2, srv.getNama());
            statement.setString(3, srv.getMerk());
            statement.setString(4, srv.getPemilik());
            statement.setDouble(5, srv.getHarga());
            int result = statement.executeUpdate();
            status = result > 0;
        }catch (Exception e) {
            
        }
        return status;
    }
    
    public boolean update(Servis srv){
        boolean status = false;
        String sql = "UPDATE benkel SET nama=?,merk=?,pemilik=?,harga=? " + "WHERE id=?" ;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, srv.getId());
            statement.setString(2, srv.getNama());
            statement.setString(3, srv.getMerk());
            statement.setString(4, srv.getPemilik());
            statement.setDouble(5, srv.getHarga());
            int result = statement.executeUpdate();
            status = result > 0;
        }catch (Exception e) {
            
        }
        return status;
    }
    
    public boolean delete(Servis srv){
        boolean status = false;
        String sql = "DELETE FROM bengkel WHERE id=?" ;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, srv.getId());
            int result =statement.executeUpdate();
            status = result > 0;
        }catch (Exception e) {
            
        }
        return status;
    }
}
