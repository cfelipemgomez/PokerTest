package test.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.poker.Poker;

class PokerTest 
{
	
	private Poker manoPar1=new Poker("2H 3D 5S KC KD","2C 3H 4S 8C AH");
	private Poker manoPar2=new Poker("2H 3D 5S 8C KD","2C 3H 4S AC AH");
	private Poker manoCartaAlta1=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
	private Poker manoCartaAlta2=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C 2C");
	private Poker manoDoblePar1=new Poker("2H 3D 3S KC KD","2C 3H 4S 8C AH");
	private Poker manoDoblePar2=new Poker("2H 3D 5S 8C KD","2C 3H 3S AC AH");
	private Poker manoTrio1=new Poker("2H 3D KS KC KD","2C 3H 4S 8C AH");
	private Poker manoTrio2=new Poker("2H 3D 5S 8C KD","2C 3H AS AC AH");
	private Poker manoPoker1=new Poker("2H 2D 2S 2C KD","2C 3H 4S 8C AH");
	private Poker manoPoker2=new Poker("2H 3D 5S 8C KD","2C 2H 2S 2D KH");
	private Poker manoColor1=new Poker("2H 3H 5H KH 8H","2C 3H 4S 8C AH");
	private Poker manoColor2=new Poker("2H 3D 5S 8C KD","2C 3C 4C AC AC");
	private Poker manoEscalera1=new Poker("2H 3D 4S 5C 6D","2C 3H 4S 8C AH");
	private Poker manoEscalera2=new Poker("2H 3D 5S 8C KD","2C 3H 4S 5C 6H");
	@Test
	void testpar() {
		assertEquals(true,manoPar1.par(manoPar1.m1,manoPar1.m2));
	}
	@Test
	void testpar2() {
		assertEquals(false,manoPar2.par(manoPar2.m1,manoPar2.m2));
	}
	
	@Test
	void testcartaAlta() {
		assertEquals(false,manoCartaAlta1.cartaAlta(manoCartaAlta1.m1,manoCartaAlta1.m2));
	}
	@Test
	void testcartaAlta2() {
		assertEquals(true,manoCartaAlta2.cartaAlta(manoCartaAlta2.m1,manoCartaAlta2.m2));
	}
	@Test
	void testdoblePar() {
		assertEquals(true,manoDoblePar1.doblePar(manoDoblePar1.m1,manoDoblePar1.m2));
	}
	@Test
	void testdoblePar2() {
		assertEquals(false,manoDoblePar2.doblePar(manoDoblePar2.m1,manoDoblePar2.m2));
	}
	
	@Test
	void testtrio() {
		assertEquals(true,manoTrio1.trio(manoTrio1.m1,manoTrio1.m2));
	}
	@Test
	void testtrio2() {
		assertEquals(false,manoTrio2.trio(manoTrio2.m1,manoTrio2.m2));
	}
	
	@Test
	void testpoker() {
		assertEquals(true,manoPoker1.poker(manoPoker1.m1,manoPoker1.m2));
	}
	@Test
	void testpoker2() {
		assertEquals(false,manoPoker2.poker(manoPoker2.m1,manoPoker2.m2));
	}
	
	@Test
	void testcolor() {
		assertEquals(true,manoColor1.color(manoColor1.m1,manoColor1.m2));
	}
	@Test
	void testcolor2() {
		assertEquals(false,manoColor2.color(manoColor2.m1,manoColor2.m2));
	}
	
	@Test
	void testEscalera() {
		assertEquals(true,manoEscalera1.Escalera(manoColor1.m1,manoColor1.m2));
	}
	@Test
	void testEscalera2() {
		assertEquals(false,manoEscalera2.Escalera(manoColor2.m1,manoColor2.m2));
	}
}
