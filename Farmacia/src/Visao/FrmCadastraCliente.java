package Visao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmCadastraCliente extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblCpf = new JLabel("CPF:");
	JLabel lblRg = new JLabel("RG:");
	JLabel lblNome = new JLabel("Nome:");
	JLabel lblCep = new JLabel("CEP:");
	JLabel lblEndereco = new JLabel("Endereço:");
	JLabel lblNLogradouro = new JLabel("Numero do Logradouro");
	JLabel lblTelefone = new JLabel("Telefone");
	JTextField tfCpf = new JTextField();
	JTextField tfRg = new JTextField();
	JTextField tfNome = new JTextField();
	JTextField tfCep = new JTextField();
	JTextField tfEndereco = new JTextField();
	JTextField tfNLogradouro = new JTextField();
	JTextField tfTelefone = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar Cliente");
	JButton btnCancelar = new JButton("Cancelar");
	JPanel painel = new JPanel();
	public static FrmCadastraCliente frame;
	
    public FrmCadastraCliente() {
    	componentes();
    	Eventos();
    }
    
    public void componentes(){
    	painel.setLayout(new GridLayout(8, 2));
    	painel.add(lblCpf);
    	painel.add(tfCpf);
    	painel.add(lblRg);
    	painel.add(tfRg);
    	painel.add(lblNome);
    	painel.add(tfNome);
    	painel.add(lblCep);
    	painel.add(tfCep);
    	painel.add(lblEndereco);
    	painel.add(tfEndereco);
    	painel.add(lblNLogradouro);
    	painel.add(tfNLogradouro);
    	painel.add(lblTelefone);
    	painel.add(tfTelefone);
    	painel.add(btnCadastrar);
    	painel.add(btnCancelar);
    	
    	this.setContentPane(painel);
		
		this.setVisible(true);
    	
    }
    
    public void Eventos(){
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfCpf.getText().equals("") || tfRg.getText().equals("") || tfNome.getText().equals("") ||
						tfCep.getText().equals("") || tfEndereco.getText().equals("") || tfNLogradouro.getText().equals("") ||
						tfTelefone.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por Favor, Insira TODOS os campos");
				}else{
					JOptionPane.showMessageDialog(null, "Cadastro realizado com S U C E S S O!");
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
    	frame = new FrmCadastraCliente();
    	frame.setSize(300,420);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}
