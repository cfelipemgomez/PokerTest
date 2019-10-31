package main.poker;

public class Carta
{
	 public char palo;
	 public char valor;
	 
	 Carta(){};
	 
	 Carta(char V,char P)
	 {
		 palo=P;
		 valor=V;
	 }
	 
	 char valor(){
		   return valor;
		   }
		
	 char palo(){
			   return palo;
			   }
}
