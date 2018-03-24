package mult.frontend;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import mult.core.Multiplier;

public class Main {

	public static void main(String[] args) {
		UIManager.put("Label.font", new Font("Sans", Font.PLAIN, 36));

		JFrame f = new JFrame("Einmaleins");
		f.setLayout(new GridLayout(2, 2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 200);

		Multiplier mult = new Multiplier();
		mult.createNewExercise();

		JLabel labelExercise = new JLabel(mult.getExercise());
		JLabel hintAndAnswer = new JLabel();

		JButton createNewExercise = new JButton("Neue Aufgabe");
		createNewExercise.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mult.createNewExercise();
				labelExercise.setText(mult.getExercise());
				hintAndAnswer.setText("");
			}
		});

		JButton showAnswer = new JButton("Antwort");
		showAnswer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hintAndAnswer.setText(mult.getHint() + "  " + mult.getAnswer());
			}
		});

		f.add(labelExercise);
		f.add(hintAndAnswer);
		f.add(createNewExercise);
		f.add(showAnswer);

		f.setVisible(true);

	}
}
