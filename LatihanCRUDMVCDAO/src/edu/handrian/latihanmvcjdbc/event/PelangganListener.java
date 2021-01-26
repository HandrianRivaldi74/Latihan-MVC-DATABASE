/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.handrian.latihanmvcjdbc.event;

import edu.handrian.latihanmvcjdbc.entity.Pelanggan;
import edu.handrian.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Acer
 * NIM : 10119074
 * NAMA : HANDRIAN RIVALDI
 * KELAS : IF2
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);    
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);


}