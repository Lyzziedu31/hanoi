package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TourTest {

	@Test
	public void empile_TowerEmpty_True() {
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		Disques.offer(new Disque(3));
		Disques.offer(new Disque(2));
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(true, t.empiler(new Disque(1)));
	}

	@Test
	public void empile_TowerFull_False(){
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		Disques.offer(new Disque(3));
		Disques.offer(new Disque(2));
		Disques.offer(new Disque(1));
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(false, t.empiler(new Disque(4)));
	}

	@Test
	public void estpleine_True(){
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		Disques.offer(new Disque(3));
		Disques.offer(new Disque(2));
		Disques.offer(new Disque(1));
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(true, t.estPleine());
	}

	@Test
	public void estpleine_False(){
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		Disques.offer(new Disque(3));
		Disques.offer(new Disque(2));
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(false, t.estPleine());
	}

	@Test
	public void estvide_False(){
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		Disques.offer(new Disque(3));
		Disques.offer(new Disque(2));
		Disques.offer(new Disque(1));
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(false, t.estVide());
	}

	@Test
	public void estvide_True(){
		Tour t = new Tour();
		Queue <Disque> Disques = new ArrayDeque<>();
		t.hauteurMax=3;
		t.disques= Disques;
		assertEquals(true, t.estVide());
	}

}
