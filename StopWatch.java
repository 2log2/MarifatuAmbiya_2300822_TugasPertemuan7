/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan7;

/**
 *
 * @author marif
 */
public class StopWatch {
    
    private long startTime;
    private long endTime;
    
    public StopWatch()
    {
        this.startTime = System.currentTimeMillis();
    }
    
    //Reset startTime ke waktu saat ini 
    public void start()
    {
        this.startTime = System.currentTimeMillis();
    }
    
    //Setel endTime ke waktu saat ini 
    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }
  
    //Hitung selisih waktu dalam milidetik  
    public long getElapsedTime()
    {
        return this.endTime - this.startTime;
    }
    
    
}
