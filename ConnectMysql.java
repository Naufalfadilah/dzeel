package com.app.uts.npm104;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.app.uts.npm104.entity.Servis;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import javax.activation.DataSource;
/**
 *
 * @author User
 */
public class ConnectMysql {
    public static void main(String[] args) {
       new ConnectMysql().testUpdate();
        
    }
    
    public void testUpdate(){
        Servis srv = datasource.getByID("123");
        srv.setNama("Naufal Fadilah");
        
        boolean sukses = datasource.insert("Update Berhasil");
        if(sukses){
            System.out.println("Update Berhasil");
            
        }else{
            System.out.println("Insert Gagal");
        }
        
          
    }
    
     public void testInsert(){
        Servis srv = new Servis();
        srv.setId("123");
        srv.setNama("Naufal Fadilah");
        srv.setMerk("Honda");
        srv.setPemilik("Naufal fadilah");
        
        
        boolean sukses = datasource.insert(srv);
        if(sukses){
            System.out.println("Insert Berhasil");
        }else{
            System.out.println("Insert Gagal");
        }
    }
}