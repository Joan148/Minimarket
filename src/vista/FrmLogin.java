package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import mantenimientos.GestionUsuario;
import modelo.Usuario;
import java.awt.Color;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblImageCarrito;
	private JLabel lblImageUsuario;
	private JLabel lblUsuario;
	private JLabel lblContrasena;
	private JTextField txtUsuario;
	private JPasswordField pswContrasena;
	private JButton btnIniciarSesion;
	private JLabel lblJoan;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
					frame.setVisible(true);
					// El frame estara centrado en la pantalla
					frame.setLocationRelativeTo(null);
					// El usuario no podra modificar las dimensiones del frame o ventana
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmLogin.class.getResource("/img/logo02min.png")));
		setTitle("Logueo - Joan Kun");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(157, 114, 74));
		panel.setBounds(0, 0, 340, 513);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblImageCarrito = new JLabel("");
		lblImageCarrito.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/logo02.png")));
		lblImageCarrito.setBounds(36, 60, 270, 256);
		panel.add(lblImageCarrito);
		
		lblNewLabel = new JLabel("Sistema de Ventas");
		lblNewLabel.setForeground(new Color(255, 255, 74));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 24));
		lblNewLabel.setBounds(70, 0, 260, 79);
		panel.add(lblNewLabel);
		
		lblJoan = new JLabel("JOAN KUN");
		lblJoan.setForeground(new Color(255, 255, 255));
		lblJoan.setFont(new Font("Constantia", Font.BOLD, 29));
		lblJoan.setBounds(93, 385, 169, 79);
		panel.add(lblJoan);
		
		lblMinimarket = new JLabel("MINIMARKET");
		lblMinimarket.setForeground(new Color(255, 255, 255));
		lblMinimarket.setFont(new Font("Constantia", Font.BOLD, 30));
		lblMinimarket.setBounds(78, 326, 252, 79);
		panel.add(lblMinimarket);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlShadow);
		panel_1.setBounds(338, 0, 358, 513);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblImageUsuario = new JLabel("");
		lblImageUsuario.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/user01logo.png")));
		lblImageUsuario.setBounds(106, 32, 139, 128);
		panel_1.add(lblImageUsuario);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Consolas", Font.BOLD, 14));
		lblUsuario.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/usuario02min.png")));
		lblUsuario.setBounds(36, 217, 96, 32);
		panel_1.add(lblUsuario);
		
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Consolas", Font.BOLD, 14));
		lblContrasena.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/password01min.png")));
		lblContrasena.setBounds(36, 281, 117, 32);
		panel_1.add(lblContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				/*
				 * Salto de caja con la tecla ENTER
				 * */
			   	if(e.getKeyCode() == e.VK_ENTER) {
						pswContrasena.requestFocus();
					}
				}
		});
		txtUsuario.setBounds(168, 220, 126, 26);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pswContrasena = new JPasswordField();
		pswContrasena.setFont(new Font("Tahoma", Font.BOLD, 11));
		pswContrasena.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				/*
				 * Inicar Sesion Con El btn ENTER 
				 * */
			   	if(e.getKeyCode() == e.VK_ENTER) {
						iniciarSesion();
					}
				}
		});
		pswContrasena.setBounds(168, 284, 126, 26);
		panel_1.add(pswContrasena);
		
		btnIniciarSesion = new JButton("INGRESAR");
		btnIniciarSesion.setForeground(new Color(255, 0, 102));
		btnIniciarSesion.setBackground(SystemColor.textHighlight);
		btnIniciarSesion.setFont(new Font("Bell MT", Font.BOLD, 14));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Boton Iniciar Sesion
				iniciarSesion();
				
			}
		});
		btnIniciarSesion.setIcon(new ImageIcon(FrmLogin.class.getResource("/img/ingresar01min.png")));
		btnIniciarSesion.setBounds(106, 371, 152, 39);
		panel_1.add(btnIniciarSesion);
	}
	
	/*
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * Sumamente_importante_para_llevar_el_nombre_en_el_FRMMENU
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * */
	public static Usuario usuario = new Usuario();
	private JLabel lblMinimarket;
	
	
	/*
	 * ++++++++++++++++++++++++++++++++++++++++
	 * Todo el codigo del boton iniciar sesion
	 * ++++++++++++++++++++++++++++++++++++++++
	 * */
	void iniciarSesion() {
		if (!txtUsuario.getText().isEmpty() && !pswContrasena.getText().isEmpty()) {
			
			GestionUsuario gu = new GestionUsuario();
			//Usuario usuario = new Usuario();
			usuario.setUsuario(txtUsuario.getText().trim());
			usuario.setContrasena(pswContrasena.getText().trim());
			if (gu.UsuarioLogueo(usuario)) {				
				JOptionPane.showMessageDialog(null, "Se registro correctamente, Bienvenido");
				
				/*
				 * +++++++++++++++++++++++++++++++++++++
				 * Abrir la ventana de carga del sistema
				 * +++++++++++++++++++++++++++++++++++++
				 * */
				FrmBarraCarga bc = new FrmBarraCarga();
				bc.setLocationRelativeTo(null);
				bc.setVisible(true);
				
				/*
				 * +++++++++++++++++++++++++++++++++++++
				 * Luego que cierre la ventana de Logueo
				 * +++++++++++++++++++++++++++++++++++++
				 * */
				dispose();
				
			} else {
				JOptionPane.showMessageDialog(null, "Usuario o clave incorrecta");				
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Ingrese sus datos correctamente");
		}
	}
	
	
}
