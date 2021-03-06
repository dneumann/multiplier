package mult.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Multiplier {

	private int number1;
	private int number2;
	private Map<String, String> hints = new HashMap<>();
	
	public Multiplier() {
		hints.put("unknown", "");
		hints.put("3*4", "regnet");
		hints.put("3*5", "coole Jungs");
		hints.put("3*6", "Platschefüße");
		hints.put("3*7", "Gras");
		hints.put("3*8", "grün");
		hints.put("3*9", "heilig");
		hints.put("4*4", "Biene");
		hints.put("4*5", "hinter Gittern");
		hints.put("4*6", "für den Überklecks");
		hints.put("4*7", "für die Lieben");
		hints.put("4*8", "für die Schlacht");
		hints.put("4*9", "für den Toast \"Moin moin\"");
		hints.put("5*5", "5 5 5");
		hints.put("5*6", "Ping, Licht");
		hints.put("5*7", "Pimmelbus");
		hints.put("5*8", "unter Strom");
		hints.put("5*9", "Weihnachtsmänner");
		hints.put("6*6", "6 6 6");
		hints.put("6*7", "6 Tage zu Hause geblieben");
		hints.put("6*8", "6 Eier gebracht");
		hints.put("6*9", "6 Farben zum Freuen");
		hints.put("7*7", "Geometrie");
		hints.put("7*8", "sie zählen in der Nacht");
		hints.put("7*9", "sie muss vor Angst heulen");
		hints.put("8*8", "Pickel");
		hints.put("8*9", "König, Säge");
		hints.put("9*9", "Zunge, Pisse");
	}

	public void createNewExercise() {
		Random rand = new Random();
		int random1 = rand.nextInt(7) + 3;
		int random2 = rand.nextInt(7) + 3;
		if (random1 == number1 && random2 == number2) {
			createNewExercise();
		} else {
			number1 = random1;
			number2 = random2;
		}
	}

	public String getExercise() {
		return "  " + number1 + " · " + number2 + " =";
	}

	public String getAnswer() {
		return "" + number1 * number2;
	}

	public String getHint() {
		String hintKey = "";
		if (number1 <= number2) {
			hintKey = number1 + "*" + number2;
		} else {
			hintKey = number2 + "*" + number1;
		}
		String hint = hints.get(hintKey);
		if (hint == null) {
			return "";
		}
		return hint;
	}

}
