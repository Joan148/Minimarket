package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FrmGestionarVentas extends JInternalFrame {
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmGestionarVentas frame = new FrmGestionarVentas();
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
	public FrmGestionarVentas() {
		setFrameIcon(new ImageIcon(FrmGestionarVentas.class.getResource("/img/gestionarventas.png")));
		setTitle("Gestionar Ventas - ");
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 664, 404);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("En proceso...");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(249, 134, 177, 64);
		getContentPane().add(lblNewLabel);

	}

}
