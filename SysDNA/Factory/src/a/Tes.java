package a;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tes extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtSequencia;

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(() -> {
			try {
				Tes frame = new Tes();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Tes() {

		setTitle("DNA Analyzer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1275, 900);

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);

		ImageIcon image = new ImageIcon(
				Tes.class.getResource("/images/dna-cell.jpg")
		);

		Image img = image.getImage().getScaledInstance(
				1275,
				900,
				Image.SCALE_SMOOTH
		);

		JLabel background = new JLabel(new ImageIcon(img));
		background.setLayout(null);

		contentPane.add(background);

		JLabel titulo = new JLabel("Nova Amostra");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Segoe UI", Font.BOLD, 40));
		titulo.setForeground(new Color(143, 170, 202));
		titulo.setBounds(0, 40, 1275, 50);

		background.add(titulo);

		JPanel card = new JPanel();
		card.setLayout(null);
		card.setBackground(new Color(20, 20, 35, 220));
		card.setBounds(300, 140, 650, 500);

		card.setBorder(
				BorderFactory.createLineBorder(
						new Color(14, 112, 112),
						2
				)
		);

		background.add(card);

		JLabel subtitulo = new JLabel("Cadastro de Material Genético");
		subtitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));
		subtitulo.setForeground(Color.WHITE);
		subtitulo.setBounds(30, 20, 400, 40);

		card.add(subtitulo);

		JLabel lblCodigo = new JLabel("Código da Amostra");
		lblCodigo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBounds(30, 80, 300, 30);

		card.add(lblCodigo);

		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCodigo.setBounds(30, 115, 250, 35);

		card.add(txtCodigo);

		JLabel lblNome = new JLabel("Nome da Amostra");
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(30, 170, 300, 30);

		card.add(lblNome);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtNome.setBounds(30, 205, 400, 35);

		card.add(txtNome);

		JLabel lblDNA = new JLabel("Sequência Genética");
		lblDNA.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDNA.setForeground(Color.WHITE);
		lblDNA.setBounds(30, 260, 300, 30);

		card.add(lblDNA);

		txtSequencia = new JTextField();
		txtSequencia.setFont(new Font("Consolas", Font.BOLD, 16));
		txtSequencia.setBounds(30, 295, 580, 40);

		card.add(txtSequencia);

		JButton btnSalvar = new JButton("Salvar Amostra");
		btnSalvar.setFocusPainted(false);
		btnSalvar.setBorderPainted(false);
		btnSalvar.setBackground(new Color(14, 112, 112));
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnSalvar.setBounds(200, 400, 240, 45);

		card.add(btnSalvar);
	}
}