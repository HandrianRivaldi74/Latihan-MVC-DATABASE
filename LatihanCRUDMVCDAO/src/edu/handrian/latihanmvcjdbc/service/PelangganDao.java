/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.handrian.latihanmvcjdbc.service;

import edu.handrian.latihanmvcjdbc.entity.Pelanggan;
import edu.handrian.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Acer
 * NIM : 10119074
 * NAMA : HANDRIAN RIVALDI
 * KELAS : IF2
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
   
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;

    public static class pelangganException extends Exception {

        public pelangganException() {
        }
    }
    
    
}
