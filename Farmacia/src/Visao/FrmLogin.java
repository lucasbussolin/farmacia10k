package Visao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FrmLogin extends JFrame{
	
	JLabel lblLogin = new JLabel("Login:");
	JLabel lblSenha = new JLabel("Senha:");
	JTextField tfLogin = new JTextField();
	JPasswordField tfSenha = new JPasswordField();
	JButton btnLogin = new JButton("Logar:");
	JButton btnCancelar = new JButton("Cancelar");
	JPanel painel = new JPanel();
	public static FrmLogin frame;
	
	public FrmLogin(){
		componentes();
		Eventos();
	}
	
	public void componentes(){
		
		painel.setLayout(new GridLayout(3,2));
		painel.add(lblLogin);
		painel.add(tfLogin);
		painel.add(lblSenha);
		painel.add(tfSenha);
		painel.add(btnLogin);
		painel.add(btnCancelar);
		
		this.setContentPane(painel);
		
		this.setVisible(true);
		
	}
	
	public void Eventos(){
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(tfSenha.getPassword());
				if (tfLogin.getText().equals("1234") && senha.equals("1234")){
					System.out.println("Funfou");
				}else{
					JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
				}
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
			}
		});
		
	}
	
	public void run(){
		frame = new FrmLogin();
		frame.setSize(400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
