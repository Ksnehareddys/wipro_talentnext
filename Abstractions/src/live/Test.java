package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {

		Veena veena = new Veena();
		veena.play();

		Saxophone sax = new Saxophone();
		sax.play();

		Playable p1 = veena;
		Playable p2 = sax;

		p1.play();
		p2.play();
	}
}