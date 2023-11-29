package visual;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class RegistrarNewUser extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtCelular;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarNewUser dialog = new RegistrarNewUser();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarNewUser() {
		setBounds(100, 100, 450, 433);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setBounds(10, 27, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Celular:");
			lblNewLabel_1.setBounds(10, 52, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Nombre:");
			lblNewLabel_2.setBounds(10, 93, 60, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Apellido:");
			lblNewLabel_3.setBounds(10, 118, 60, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setBounds(66, 24, 110, 20);
			contentPanel.add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			txtCelular = new JTextField();
			txtCelular.setText("");
			txtCelular.setBounds(66, 49, 110, 20);
			contentPanel.add(txtCelular);
			txtCelular.setColumns(10);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(66, 90, 110, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtApellido = new JTextField();
			txtApellido.setBounds(66, 115, 110, 20);
			contentPanel.add(txtApellido);
			txtApellido.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Fecha De Nacimiento:");
			lblNewLabel_4.setBounds(242, 27, 145, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Genero:");
			lblNewLabel_5.setBounds(10, 176, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Masculino", "Femenino", "Otro"}));
		comboBox.setBounds(66, 172, 110, 22);
		contentPanel.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("CREDENCIALES");
		lblNewLabel_6.setBounds(154, 223, 96, 14);
		contentPanel.add(lblNewLabel_6);
		
		JPanel panelCredenciales = new JPanel();
		panelCredenciales.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCredenciales.setBounds(10, 246, 414, 100);
		contentPanel.add(panelCredenciales);
		panelCredenciales.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Nombre de Usuario :");
		lblNewLabel_7.setBounds(20, 11, 136, 14);
		panelCredenciales.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Contraseña:");
		lblNewLabel_8.setBounds(58, 55, 98, 14);
		panelCredenciales.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(140, 8, 120, 20);
		panelCredenciales.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 52, 114, 20);
		panelCredenciales.add(textField_1);
		textField_1.setText("");
		textField_1.setColumns(10);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(206, 49, 218, 169);
		contentPanel.add(calendar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

//AMVC///
//222