package view;

import model.Calculadora;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculadora extends JFrame {
	
	private Calculadora calculadora = new Calculadora();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVisor;
	private double numero1;
	private String operacao;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 236, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVisor = new JTextField();
		txtVisor.setBackground(new Color(255, 213, 234));
		txtVisor.setEditable(false);
		txtVisor.setBounds(152, 90, 250, 19);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		JLabel lblDesign = new JLabel(" CALCULADORA ");
		lblDesign.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesign.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDesign.setForeground(new Color(255, 51, 153));
		lblDesign.setBackground(new Color(255, 255, 255));
		lblDesign.setBounds(59, 27, 431, 45);
		contentPane.add(lblDesign);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 213, 234));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "0");
				
			}
		});
		btn0.setBounds(99, 132, 67, 35);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 213, 234));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		btn1.setBounds(190, 132, 67, 35);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 213, 234));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		btn2.setBounds(277, 132, 67, 35);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 213, 234));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		btn3.setBounds(99, 177, 67, 35);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 213, 234));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		btn4.setBounds(190, 177, 67, 35);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 213, 234));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		btn5.setBounds(277, 177, 67, 35);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 213, 234));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		btn6.setBounds(99, 223, 67, 35);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 213, 234));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		btn7.setBounds(190, 223, 67, 35);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 213, 234));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		btn8.setBounds(277, 223, 67, 35);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 213, 234));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		btn9.setBounds(99, 268, 67, 35);
		contentPane.add(btn9);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.setBackground(new Color(255, 94, 174));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("");
				numero1 = 0;
				operacao = "";
			}
		});
		btnLimpar.setBounds(190, 268, 67, 35);
		contentPane.add(btnLimpar);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setBackground(new Color(255, 155, 205));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "+";
				txtVisor.setText("");
			}
		});
		btnSoma.setBounds(366, 132, 67, 35);
		contentPane.add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setBackground(new Color(255, 155, 205));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "-";
				txtVisor.setText("");
			}
		});
		btnSubtracao.setBounds(366, 177, 67, 35);
		contentPane.add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.setBackground(new Color(255, 155, 205));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "*";
				txtVisor.setText("");
			}
		});
		btnMultiplicacao.setBounds(366, 223, 67, 35);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setBackground(new Color(255, 155, 205));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "/";
				txtVisor.setText("");
			}
		});
		btnDivisao.setBounds(366, 268, 67, 35);
		contentPane.add(btnDivisao);
		
		JButton btnResultado = new JButton("=");
		btnResultado.setBackground(new Color(255, 155, 205));
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero2 = Double.parseDouble(txtVisor.getText());
				double resultado = 0;
				
				if (operacao.equals("+")) {
					resultado = calculadora.somar(numero1, numero2);
				} else if (operacao.equals("-")) {
					resultado = calculadora.subtrair(numero1, numero2);
				} else if (operacao.equals("*")) {
					resultado = calculadora.divisão(numero1, numero2);
				} else if (operacao.equals("/")) {
					resultado = calculadora.multiplicação(numero1, numero2);
				}
				
				if (resultado == (int) resultado) {
					txtVisor.setText(String.valueOf((int) resultado));
				} else {
					txtVisor.setText(String.valueOf(resultado));
				}
			}
		});
		btnResultado.setBounds(277, 268, 67, 35);
		contentPane.add(btnResultado);

	}
}
