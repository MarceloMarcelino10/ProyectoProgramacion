package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

public class Login_O_Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuarioReg;
	private JPasswordField txtPasswUsuarioReg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_O_Registro frame = new Login_O_Registro();
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
	public Login_O_Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(74, 74, 56, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(62, 99, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuarioReg = new JTextField();
		txtUsuarioReg.setBounds(140, 71, 121, 20);
		contentPane.add(txtUsuarioReg);
		txtUsuarioReg.setColumns(10);
		
		JButton btnInicioSesion = new JButton("Iniciar Sesion");
		btnInicioSesion.setBounds(275, 82, 123, 23);
		contentPane.add(btnInicioSesion);
		
		JLabel lblNewLabel_2 = new JLabel("No estas registrado? ");
		lblNewLabel_2.setBounds(104, 140, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPasswUsuarioReg = new JPasswordField();
		txtPasswUsuarioReg.setBounds(140, 96, 121, 20);
		contentPane.add(txtPasswUsuarioReg);
		
		JButton btnRegistrarNuevoUser = new JButton("Registrate");
		btnRegistrarNuevoUser.setForeground(SystemColor.textHighlight);
		btnRegistrarNuevoUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarNuevoUser.setBounds(227, 140, 110, 14);
		contentPane.add(btnRegistrarNuevoUser);
	}
}
////2