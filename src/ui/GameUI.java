package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.TekenVenster;

import domain.HangMan;

public class GameUI extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private HangMan spel;	
	private TekenVenster tekenvenster;	
	private HangmanPaneel spelpaneel;

	public GameUI(HangMan spel, HangmanPaneel spelpaneel) throws IllegalArgumentException{
		super("Hangman - "+spel.getSpeler().getNaam());		
		setGame(spel);
		setTekenvenster(new TekenVenster(spel.getTekening()));
		setSpelpaneel(spelpaneel);
		spelpaneel.setGameUI(this);
		initView();
	}

	private void initView() {
		JPanel middenin = new JPanel();
		middenin.setBackground(Color.white);
		middenin.setBorder(BorderFactory.createMatteBorder( 3, 3, 3, 3, Color.darkGray));
		middenin.add(getTekenvenster());
		
		this.setLayout(new BorderLayout());
		this.add(middenin, BorderLayout.CENTER);
		this.add(spelpaneel, BorderLayout.SOUTH);
	}
	
	public void start() {
		this.pack();
		this.setVisible(true);		
	}

	public HangMan getGame() {
		return spel;
	}

	private void setGame(HangMan spel) throws IllegalArgumentException{
		if(spel == null)
			throw new IllegalArgumentException();
		this.spel = spel;
	}
	
	public TekenVenster getTekenvenster() {
		return tekenvenster;
	}

	private void setTekenvenster(TekenVenster tekenvenster) throws IllegalArgumentException{
		if(tekenvenster == null)
			throw new IllegalArgumentException();
		this.tekenvenster = tekenvenster;
	}
	
	public HangmanPaneel getSpelpaneel() {
		return spelpaneel;
	}

	private void setSpelpaneel(HangmanPaneel spelpaneel) {
		this.spelpaneel = spelpaneel;
	}
}
