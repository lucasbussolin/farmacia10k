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

public class FrmCadastroMedicamento extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lblNome = new JLabel("Nome:");
	JLabel lblFab = new JLabel("Fabricante");
	JLabel lblValUni = new JLabel("Valor Unitário");
	JLabel lblDesc = new JLabel("Descrição");
	JTextField tfNome = new JTextField();
	JTextField tfFab = new JTextField();
	JTextField tfValUni = new JTextField();
	JTextField tfDesc = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar Medicamento");
	JButton btnCancelar = new JButton("Cancelar");
	JPanel painel = new JPanel();
	public static FrmCadastroMedicamento frame;
	
    public FrmCadastroMedicamento() {
    	componentes();
    	Eventos();
    }
    
    public void componentes(){
    	painel.setLayout(new GridLayout(5, 2));
    	painel.add(lblNome);
    	painel.add(tfNome);
    	painel.add(lblFab);
    	painel.add(tfFab);
    	painel.add(lblValUni);
    	painel.add(tfValUni);
    	painel.add(lblDesc);
    	painel.add(tfDesc);
    	painel.add(btnCadastrar);
    	painel.add(btnCancelar);
    	
    	this.setContentPane(painel);
		
		this.setVisible(true);
    	
    }
    
    public void Eventos(){
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tfNome.getText().equals("") || tfFab.getText().equals("") || tfValUni.getText().equals("") ||
						tfDesc.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por Favor, Insira TODOS os campos");
				}else{
					try{
						Double.parseDouble(tfValUni.getText());
						JOptionPane.showMessageDialog(null, "Cadastro realizado com S U C E S S O!");
					}catch(NumberFormatException erro){
						JOptionPane.showMessageDialog(null,"Digite um valor Numérico em 'Valor Unitário'\n" );
						tfValUni.requestFocus();
					}
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
    	frame = new FrmCadastroMedicamento();
    	frame.setSize(300,400);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    }
}
