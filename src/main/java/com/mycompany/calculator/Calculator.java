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

       while (true) {
            // Display menu options
            String choice = JOptionPane.showInputDialog(
                "Select an option:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Division\n" +
                "4. Multiplication\n" +
                "0. Exit"
            );

            // Check user choice and  operation
            switch (choice) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 + num2));
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 - num2));
                    break;
                case "3":
                                        if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));
                    } else                    if (num2 != 0) {
                        JOptionPane.showMessageDialog(null, "Result: " + (num1 / num2));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Result: " + (num1 * num2));
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    return; 
                default:
                    JOptionPane.showMessageDialog(null, "Calculation not recognized");
            }
        }
    }
}


        
    



