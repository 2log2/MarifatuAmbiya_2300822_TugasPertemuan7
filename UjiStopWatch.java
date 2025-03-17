/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan7;

import java.util.Random;
/**
 *
 * @author marif
 */
public class UjiStopWatch {
    
    public static void main(String[] args) {
        
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();
        
        
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        
        //selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        
        stopwatch.stop();
        System.out.println("Waktu eksekusi sorting: " + stopwatch.getElapsedTime() + " ms ");
        
    }
}
