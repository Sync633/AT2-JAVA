/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.at2;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class AT2 {

    public static void main(String[] args) {
        Aluno al = new Aluno();
                
        String sNomeCompleto = JOptionPane.showInputDialog(null,
            "Digite o nome completo do aluno: ",
            "Entrada de Dados",
            JOptionPane.QUESTION_MESSAGE
        );
        
        al.setNome(sNomeCompleto);
        
        al.pedirNotas();
        
        al.calcularMedia();
        
        al.avaliacaoDesempenho();  
        
    }
}
