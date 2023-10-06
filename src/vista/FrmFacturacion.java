package vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FrmFacturacion extends JInternalFrame {
	private JLabel lblFPantalla;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnAnadirProductos;
	private JComboBox cboCliente;
	private JComboBox txtProducto;
	private JTextField txtBuscar;
	private JTextField txtCantidad;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton btnCalcularCambio;
	private JTextField txtSubTotal;
	private JTextField txtDescuento;
	private JTextField txtIgv;
	private JTextField txtTotalPagar;
	private JTextField txtEfectivo;
	private JTextField txtCambio;
	private JButton btnRegistrarVentas;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFacturacion frame = new FrmFacturacion();
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
	public FrmFacturacion() {
		setFrameIcon(new ImageIcon(FrmFacturacion.class.getResource("/img/facturar01.png")));
		setTitle("Facturar- Nueva Factura");
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 964, 545);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("EN PROCESO...");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(386, 20, 279, 37);
		getContentPane().add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 282, 932, 224);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 912, 204);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(10, 73, 401, 199);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 23, 65, 20);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 78, 78, 20);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Cantidad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 145, 87, 20);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Buscar");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(198, 50, 65, 20);
		panel_1.add(lblNewLabel_4);
		
		btnAnadirProductos = new JButton("A\u00F1adir Productos");
		btnAnadirProductos.setBackground(SystemColor.textHighlight);
		btnAnadirProductos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAnadirProductos.setBounds(208, 136, 170, 39);
		panel_1.add(btnAnadirProductos);
		
		cboCliente = new JComboBox();
		cboCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboCliente.setBounds(93, 23, 170, 23);
		panel_1.add(cboCliente);
		
		txtProducto = new JComboBox();
		txtProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtProducto.setBounds(93, 78, 170, 23);
		panel_1.add(txtProducto);
		
		txtBuscar = new JTextField();
		txtBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBuscar.setBounds(262, 50, 129, 24);
		panel_1.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(86, 145, 102, 22);
		panel_1.add(txtCantidad);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(541, 73, 401, 199);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_5 = new JLabel("SubTotal");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 24, 65, 20);
		panel_2.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Descuento");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 74, 80, 20);
		panel_2.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("IGV");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 119, 65, 20);
		panel_2.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("TotalPagar");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(200, 24, 80, 20);
		panel_2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Efectivo");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(200, 74, 65, 20);
		panel_2.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Cambio");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(200, 119, 65, 20);
		panel_2.add(lblNewLabel_10);
		
		btnCalcularCambio = new JButton("Calcular Cambio");
		btnCalcularCambio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcularCambio.setBackground(SystemColor.activeCaption);
		btnCalcularCambio.setBounds(84, 156, 235, 33);
		panel_2.add(btnCalcularCambio);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setForeground(SystemColor.activeCaptionText);
		txtSubTotal.setEditable(false);
		txtSubTotal.setFont(new Font("Arial", Font.BOLD, 12));
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(85, 24, 102, 22);
		panel_2.add(txtSubTotal);
		
		txtDescuento = new JTextField();
		txtDescuento.setEditable(false);
		txtDescuento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(100, 74, 87, 22);
		panel_2.add(txtDescuento);
		
		txtIgv = new JTextField();
		txtIgv.setEditable(false);
		txtIgv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtIgv.setColumns(10);
		txtIgv.setBounds(85, 119, 102, 22);
		panel_2.add(txtIgv);
		
		txtTotalPagar = new JTextField();
		txtTotalPagar.setEditable(false);
		txtTotalPagar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTotalPagar.setColumns(10);
		txtTotalPagar.setBounds(290, 24, 87, 22);
		panel_2.add(txtTotalPagar);
		
		txtEfectivo = new JTextField();
		txtEfectivo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEfectivo.setColumns(10);
		txtEfectivo.setBounds(275, 74, 102, 22);
		panel_2.add(txtEfectivo);
		
		txtCambio = new JTextField();
		txtCambio.setEditable(false);
		txtCambio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCambio.setColumns(10);
		txtCambio.setBounds(275, 119, 102, 22);
		panel_2.add(txtCambio);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		panel_3.setBounds(421, 95, 110, 147);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		btnRegistrarVentas = new JButton("");
		btnRegistrarVentas.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnRegistrarVentas.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarVentas.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegistrarVentas.setBackground(SystemColor.inactiveCaption);
		btnRegistrarVentas.setIcon(new ImageIcon(FrmFacturacion.class.getResource("/img/impresora01.png")));
		btnRegistrarVentas.setBounds(10, 38, 90, 73);
		panel_3.add(btnRegistrarVentas);
		
		lblNewLabel_11 = new JLabel(" Registrar Venta");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(10, 111, 100, 26);
		panel_3.add(lblNewLabel_11);
		
		lblFPantalla = new JLabel("");
		lblFPantalla.setIcon(new ImageIcon(FrmFacturacion.class.getResource("/img/carga04.jpg")));
		lblFPantalla.setBounds(0, 0, 952, 516);
		getContentPane().add(lblFPantalla);

	}
}
