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

    //KONSTRUKTOR NO ARG
    public StopWatch()
    {
        this.startTime = System.currentTimeMillis();
    }
    
    //Method untuk memulai stopwatch 
    public void start()
    {
        this.startTime = System.currentTimeMillis();
    }
    
    //Method untuk menghentikan stopwatch
    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }
  
    //Method untuk menghitung selisih waktu dalam milidetik  
    public long getElapsedTime()
    {
        return this.endTime - this.startTime;
    }
    
    
}
