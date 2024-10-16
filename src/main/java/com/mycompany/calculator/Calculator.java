/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Calculator {

    public static void main(String[] args) {
        // Two numbers are accepted from the user
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");

        // Parse inputs
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

       
