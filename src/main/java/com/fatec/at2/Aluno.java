/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.at2;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
    private String nomeCompleto;
    private double[] notas = new double[3];
    private double media;
    
    public void setNome(String nome){
        this.nomeCompleto = nome;
    }
    
    
    public void pedirNotas(){
        for(int i=0; i<3; i++){
         String mensagemNotas = ("Digite a nota " + (i+1) + ": ");
         String sNotas = JOptionPane.showInputDialog(null,
            mensagemNotas,
            "Entrada de Dados",
            JOptionPane.QUESTION_MESSAGE
            );
           
            notas[i] = Double.parseDouble(sNotas); 
        }
    }
    
    public void calcularMedia(){
        for(int i=0; i<3; i++){
            media += this.notas[i];
        }
        
        this.media /= 3;
    }
    
    public void avaliacaoDesempenho(){       
        String mensagemDesempenho;
        if (media > 9 && media <=10){
            mensagemDesempenho = ("Parabens! Voce teve um otimo apoveitamento!");
        } else if (media <= 9 && media >= 6){
            mensagemDesempenho = ("Parabens! Voce foi aprovado!");
        } else if (media < 6 && media >= 0){
            mensagemDesempenho = ("Infelizmente voce foi reprovado!");
        } else {
            mensagemDesempenho = ("As notas inseridas são inválidas!");
        }
        
        String mediaFormatada = String.format("%.2f", media);
        
        String mensagemFinal = ("Olá, " + this.nomeCompleto + ". Seja Bem-Vindo! \n" +
                                "Sua media final foi: " + mediaFormatada + "\n" +
                                mensagemDesempenho
                );
        
        JOptionPane.showMessageDialog(null,
                mensagemFinal,
                "Resultado da Avaliacao", JOptionPane.INFORMATION_MESSAGE);
        
        
    } 
}