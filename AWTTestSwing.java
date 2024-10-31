package Tela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class AWTTestSwing {
	    public static void main(String[] args) {
	        
	    	// aqui inicializa um novo JFrame com o nome "AWT Test"
	        JFrame frame = new JFrame("AWT Test");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLayout(new BorderLayout());
	        
	        //aqui cria um JLabel e um JTextField para entrada de texto
	        JLabel label1 = new JLabel("Label1");
	        JTextField textField1 = new JTextField(15);
	               
	        // aqui cria um JPanel no topo usando o layout FlowLayout
	        JPanel topPanel = new JPanel(); 
	        topPanel.setLayout(new FlowLayout());
	        topPanel.add(label1); 
	        topPanel.add(textField1);
	        
	        // aqui define três botões para interação do usuário 
	        JButton button1 = new JButton("Button 1"); 
	        JButton button2 = new JButton("Button 2"); 
	        JButton button3 = new JButton("Button 3"); 
	        
	        // aqui cria um JPanel para os botões também com FlowLayout
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new FlowLayout());
	        buttonPanel.add(button1);
	        buttonPanel.add(button2);
	        buttonPanel.add(button3);
	        
	        // aqui adiciona os painéis ao JFrame nas posições definidas
	        frame.add(topPanel, BorderLayout.NORTH);
	        frame.add(buttonPanel, BorderLayout.CENTER);
	        
	        // aqui exibe o JFrame na tela 
	        frame.setVisible(true);
	    }
	}

