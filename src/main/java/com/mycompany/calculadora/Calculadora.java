/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Matheus Santana
 */
public class Calculadora extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
        public Calculadora() {
            super("Calculadora");
            Container tela = getContentPane();
            setLayout(null);
            
            rotulo1 = new JLabel("1° Número: ");
            rotulo2 = new JLabel("2° Número: ");
            texto1 = new JTextField(5);
            texto2 = new JTextField(5);
            exibir = new JLabel("");
            
            somar = new JButton("Somar");
            subtrair = new JButton("Subtrair");
            multiplicar = new JButton("Vezes");
            dividir = new JButton("Dividir");
            
            rotulo1.setBounds(50, 20, 100, 20);
            rotulo2.setBounds(50, 60, 100, 20);
            texto1.setBounds(120, 20, 200, 20);
            texto2.setBounds(120, 60, 200, 20);
            exibir.setBounds(50, 120, 200, 20);
            somar.setBounds(50, 100, 80, 20);
            subtrair.setBounds(140, 100, 80, 20);
            multiplicar.setBounds(230, 100, 80, 20);
            dividir.setBounds(320, 100, 80, 20);
            
            somar.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if (texto1.getText().intern() == "" && texto2.getText().intern() == "") {
                                exibir.setText("Digite um número");
                            } else {
                            double n1, n2, soma;
                            n1 = Double.parseDouble(texto1.getText());
                            n2 = Double.parseDouble(texto2.getText());
                            soma = n1 + n2;
                            exibir.setVisible(true);
                            exibir.setText("A soma é: " + soma);
                            }
                        }
                    }
            );
            subtrair.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if (texto1.getText().intern() == "" && texto2.getText().intern() == "") {
                                exibir.setText("Digite um número");
                            } else {
                            double n1, n2, subtracao;
                            n1 = Double.parseDouble(texto1.getText());
                            n2 = Double.parseDouble(texto2.getText());
                            subtracao = n1 - n2;
                            exibir.setVisible(true);
                            exibir.setText("A subtração é: " + subtracao);
                            }
                        }
                    }
            );
            multiplicar.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if (texto1.getText().intern() == "" && texto2.getText().intern() == "") {
                                exibir.setText("Digite um número");
                            } else {
                            double n1, n2, multiplicacao;
                            n1 = Double.parseDouble(texto1.getText());
                            n2 = Double.parseDouble(texto2.getText());
                            multiplicacao = n1 * n2;
                            exibir.setVisible(true);
                            exibir.setText("A multiplicação é: " + multiplicacao);
                            }
                        }
                    }
            );
            dividir.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if (texto1.getText().intern() == "" && texto2.getText().intern() == "") {
                                exibir.setText("Digite um número");
                            } else {
                            double n1, n2, divisao;
                            n1 = Double.parseDouble(texto1.getText());
                            n2 = Double.parseDouble(texto2.getText());
                            divisao = n1 / n2;
                            exibir.setVisible(true);
                            exibir.setText("A divisão é: " + divisao);
                            }
                        }
                    }
            );
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(exibir);
            tela.add(somar);
            tela.add(subtrair);
            tela.add(multiplicar);
            tela.add(dividir);
            
            setSize(450, 250);
            setVisible(true);
            setLocationRelativeTo(null);
        }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
