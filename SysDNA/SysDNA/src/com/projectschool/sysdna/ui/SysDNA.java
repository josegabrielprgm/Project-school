package com.projectschool.sysdna.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.projectschool.sysdna.telas.ui.Home;

public class SysDNA extends JFrame {

	private JPanel contentPane;
	private JPanel contentPanel;
	private JPanel homeCache;

	public SysDNA() {

		homeCache = Home.criarTelaHome();

		setTitle("DNA Analyzer - Sistema de Análise Genética");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);


		JPanel menu = new JPanel();
		menu.setBackground(new Color(33, 27, 56));
		menu.setBounds(0, 0, 325, 861);
		menu.setLayout(null);
		contentPane.add(menu);

		JLabel lblDNA = new JLabel("DNA");
		lblDNA.setForeground(Color.WHITE);
		lblDNA.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lblDNA.setBounds(52, 65, 132, 57);
		menu.add(lblDNA);

		JLabel lblAnalyzer = new JLabel("ANALYZER");
		lblAnalyzer.setForeground(new Color(14, 112, 112));
		lblAnalyzer.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblAnalyzer.setBounds(52, 114, 194, 67);
		menu.add(lblAnalyzer);

		JButton btnInicio = new JButton("Início");
		btnInicio.setForeground(new Color(0, 0, 0));
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnInicio.setBackground(new Color(67, 74, 121));
		btnInicio.setBounds(10, 230, 299, 37);
		menu.add(btnInicio);

		JButton btnNovaAmostra = new JButton("Nova Amostra");
		btnNovaAmostra.setForeground(new Color(0, 0, 0));
		btnNovaAmostra.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnNovaAmostra.setBackground(new Color(67, 74, 121));
		btnNovaAmostra.setBounds(10, 280, 299, 37);
		menu.add(btnNovaAmostra);


		contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		contentPanel.setBounds(325, 0, 1275, 900);
		contentPane.add(contentPanel);

		trocarTela(homeCache);



		btnInicio.addActionListener(e -> trocarTela(homeCache));

		btnNovaAmostra.addActionListener(e -> {

			JPanel tela = new JPanel();
			tela.setBackground(Color.WHITE);
			tela.setLayout(new FlowLayout());

			tela.add(new JLabel("OUTRA TELA AQUI"));

			trocarTela(tela);
		});
	}


	private void trocarTela(JPanel tela) {
		contentPanel.removeAll();
		contentPanel.add(tela, BorderLayout.CENTER);
		contentPanel.revalidate();
		contentPanel.repaint();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				SysDNA frame = new SysDNA();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
