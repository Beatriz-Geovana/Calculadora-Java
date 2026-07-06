package view;

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
		txtVisor.setBounds(150, 82, 250, 19);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		JLabel lblDesign = new JLabel(" CALCULADORA ");
		lblDesign.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesign.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDesign.setForeground(new Color(255, 51, 153));
		lblDesign.setBackground(new Color(255, 255, 255));
		lblDesign.setBounds(59, 10, 431, 45);
		contentPane.add(lblDesign);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		btn0.setBounds(85, 121, 84, 20);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		btn1.setBounds(176, 121, 84, 20);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		btn2.setBounds(266, 121, 84, 20);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		btn3.setBounds(85, 151, 84, 20);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		btn4.setBounds(176, 151, 84, 20);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		btn5.setBounds(266, 151, 84, 20);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		btn6.setBounds(85, 179, 84, 20);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		btn7.setBounds(176, 179, 84, 20);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		btn8.setBounds(266, 181, 84, 20);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		btn9.setBounds(85, 209, 84, 20);
		contentPane.add(btn9);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("");
				numero1 = 0;
				operacao = "";
			}
		});
		btnLimpar.setBounds(176, 209, 84, 20);
		contentPane.add(btnLimpar);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "+";
				txtVisor.setText("");
			}
		});
		btnSoma.setBounds(360, 121, 84, 20);
		contentPane.add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "-";
				txtVisor.setText("");
			}
		});
		btnSubtracao.setBounds(360, 151, 84, 20);
		contentPane.add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "*";
				txtVisor.setText("");
			}
		});
		btnMultiplicacao.setBounds(360, 181, 84, 20);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtVisor.getText());
				operacao = "/";
				txtVisor.setText("");
			}
		});
		btnDivisao.setBounds(360, 209, 84, 20);
		contentPane.add(btnDivisao);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero2 = Double.parseDouble(txtVisor.getText());
				double resultado = 0;
				
				if (operacao.equals("+")) {
					resultado = numero1 + numero2;
				} else if (operacao.equals("-")) {
					resultado = numero1 - numero2;
				} else if (operacao.equals("*")) {
					resultado = numero1 * numero2;
				} else if (operacao.equals("/")) {
					resultado = numero1 / numero2;
				}
				
				if (resultado == (int) resultado) {
					txtVisor.setText(String.valueOf((int) resultado));
				} else {
					txtVisor.setText(String.valueOf(resultado));
				}
			}
		});
		btnResultado.setBounds(266, 209, 84, 20);
		contentPane.add(btnResultado);

	}
}
