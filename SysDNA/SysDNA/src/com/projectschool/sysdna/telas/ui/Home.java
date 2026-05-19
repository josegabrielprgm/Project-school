package com.projectschool.sysdna.telas.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Home {

    public static JPanel criarTelaHome() {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        ImageIcon image = new ImageIcon(
                Home.class.getResource("/images/dna-cell.jpg")
        );

        Image img = image.getImage().getScaledInstance(
                1275, 900, Image.SCALE_SMOOTH
        );

        JLabel background = new JLabel(new ImageIcon(img));
        background.setLayout(new BorderLayout());

        Color corTexto = new Color(143, 170, 202);


        JLabel titulo = new JLabel("Bem-Vindo ao DNA Analyzer");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 40));
        titulo.setForeground(corTexto);


        JLabel subtitulo = new JLabel("Selecione uma das opções ao lado para começar");
        subtitulo.setHorizontalAlignment(SwingConstants.CENTER);
        subtitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));

        subtitulo.setOpaque(true);
        subtitulo.setBackground(new Color(0, 0, 0, 120)); // fundo escuro transparente
        subtitulo.setForeground(Color.WHITE);
        subtitulo.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        JPanel textoPanel = new JPanel(new BorderLayout());
        textoPanel.setOpaque(false);

        textoPanel.setBorder(BorderFactory.createEmptyBorder(60, 0, 0, 0));

        textoPanel.add(titulo, BorderLayout.NORTH);
        textoPanel.add(subtitulo, BorderLayout.CENTER);

        background.add(textoPanel, BorderLayout.CENTER);
        panel.add(background, BorderLayout.CENTER);

        return panel;
    }
}
