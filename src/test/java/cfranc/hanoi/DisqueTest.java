package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		//TODO : à compléter
	}

	@Test
	public void compareTo_SmallMedium_false(){
		Disque small = new Disque (1);
		Disque medium = new Disque (2);
		int expected = -1;
		int actual= small.compareTo(medium);
	}

	@Test
	public void compareTo_MediumSmall_True(){
		Disque small = new Disque (1);
		Disque medium = new Disque (2);
		int expected = 1;
		int actual= small.compareTo(medium);
	}

	@Test
	public void compareTo_MediumSmall_Equals(){
		Disque small1 = new Disque (1);
		Disque small2 = new Disque (1);
		int expected = 0;
		int actual= small1.compareTo(small2);
	}
}
