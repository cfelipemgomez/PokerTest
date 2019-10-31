package test.poker;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.poker.Poker;

class PokerTest {
	
	public Poker sut=new Poker("2H 3D 5S KC KD","2C 3H 4S 8C AH");
	public Poker sut1=new Poker("2H 3D 5S 8C KD","2C 3H 4S AC AH");
	public Poker sut2=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
	public Poker sut3=new Poker("2H 3D 5S 9C KD","2C 3H 4S 8C 2C");
	public Poker sut4=new Poker("2H 3D 3S KC KD","2C 3H 4S 8C AH");
	public Poker sut5=new Poker("2H 3D 5S 8C KD","2C 3H 3S AC AH");
	public Poker sut6=new Poker("2H 3D KS KC KD","2C 3H 4S 8C AH");
	public Poker sut7=new Poker("2H 3D 5S 8C KD","2C 3H AS AC AH");
	public Poker sut8=new Poker("2H 2D 2S 2C KD","2C 3H 4S 8C AH");
	public Poker sut9=new Poker("2H 3D 5S 8C KD","2C 2H 2S 2D KH");
	public Poker sut10=new Poker("2H 3H 5H KH 8H","2C 3H 4S 8C AH");
	public Poker sut11=new Poker("2H 3D 5S 8C KD","2C 3C 4C AC RC");
	@Test
	void testpar() {
		assertEquals(true,sut.par(sut.m1,sut.m2));
	}
	@Test
	void testpar2() {
		assertEquals(false,sut1.par(sut1.m1,sut1.m2));
	}
	
	@Test
	void testcartaAlta() {
		assertEquals(false,sut2.cartaAlta(sut2.m1,sut2.m2));
	}
	@Test
	void testcartaAlta2() {
		assertEquals(true,sut3.cartaAlta(sut3.m1,sut3.m2));
	}
	@Test
	void testdoblePar() {
		assertEquals(true,sut4.doblePar(sut4.m1,sut4.m2));
	}
	@Test
	void testdoblePar2() {
		assertEquals(false,sut5.doblePar(sut5.m1,sut5.m2));
	}
	
	@Test
	void testtrio() {
		assertEquals(true,sut6.trio(sut6.m1,sut6.m2));
	}
	@Test
	void testtrio2() {
		assertEquals(false,sut7.trio(sut7.m1,sut7.m2));
	}
	
	@Test
	void testpoker() {
		assertEquals(true,sut8.poker(sut8.m1,sut8.m2));
	}
	@Test
	void testpoker2() {
		assertEquals(false,sut9.poker(sut9.m1,sut9.m2));
	}
	
	@Test
	void testcolor() {
		assertEquals(true,sut10.color(sut10.m1,sut10.m2));
	}
	@Test
	void testcolor2() {
		assertEquals(false,sut11.color(sut11.m1,sut11.m2));
	}
}
