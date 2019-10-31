package main.poker;

import java.util.*;

public class Poker
{
	
	public LinkedList<Carta> m1 = new LinkedList<Carta>();
	public LinkedList<Carta> m2 = new LinkedList<Carta>();
	public String Blanco;
	public String Negro;
	
	Poker(){};
	
	Poker(String B, String N)
	{
		Blanco=B;
		Negro=N;
		for (int i=0;i<B.length();)
		{
			if(B.charAt(i)=='1'){m1.add(new Carta('H',B.charAt(i+2)));}
			else if(B.charAt(i)=='K'){m1.add(new Carta('X',B.charAt(i+1)));}
			else if(B.charAt(i)=='A'){m1.add(new Carta('Z',B.charAt(i+1)));}
			else {m1.add(new Carta(B.charAt(i),B.charAt(i+1)));}			
			i=i+3;
		}
		
		for (int j=0;j<N.length();)
		{
			if(N.charAt(j)=='1'){m2.add(new Carta('H',N.charAt(j+2)));}
			else if(N.charAt(j)=='K'){m2.add(new Carta('X',N.charAt(j+1)));}
			else if(N.charAt(j)=='A'){m2.add(new Carta('Z',N.charAt(j+1)));}
			else {m2.add(new Carta(N.charAt(j),N.charAt(j+1)));}						
			j=j+3;
		}		
	}
	
	public int prueba(LinkedList<Carta> maux) 
	{
		int num = maux.get(4).valor;
		return num;
	}

/*************************** CARTA ALTA *****************************************/	
	
	protected boolean cartaAlta(LinkedList<Carta> m1, LinkedList<Carta> m2) {
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) 
        {
            int valor1=0, valor2=0;
            boolean sal=true;
            
            for (int i=0; i<m1.size() && sal; i++)
            {
                if (m1.get(i).valor()>valor1)
                    valor1 = m1.get(i).valor();
            }

            for (int i=0; i<m2.size() && sal; i++) 
            {
                if (m2.get(i).valor()>valor2)
                    valor2 = m2.get(i).valor();
            }

            //Resultado
            if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            
            else {salida=false; System.out.println("Gana el Negro con:"+Negro);}

        }
        
        return salida;
    };
	
/************************************* PAR ******************************************/
    
	public boolean par(LinkedList<Carta> m1, LinkedList<Carta> m2) {
		
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) {
            int valor1=0, valor2=0;
            
            for (int i=0; i<4; i++) 
            {
                //Obtenemos el valor de la pareja más alta de m1
                if (m1.get(i).valor()==m1.get(i+1).valor())
                {
                    if (m1.get(i).valor()>valor1)
                    	{valor1=m1.get(i).valor();}
                }
                //Obtenemos el valor de la pareja más alta de m2
                if (m2.get(i).valor()==m2.get(i+1).valor())
                {
                    if (m2.get(i).valor()>valor2)
                    	{valor2=m2.get(i).valor();}
                }
            }
            
            //Resultado
            if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
           
            else if (valor1<valor2){salida=false; System.out.println("Gana el Negro con:"+Negro);}
            
        }
        
        return salida;
    };

/********************************* DOBLE PAR ************************************************/
    
public boolean doblePar(LinkedList<Carta> m1, LinkedList<Carta> m2) {
		
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) {
            int valor1=0, valor2=0, cont1=0, cont2=0;
            
            for (int i=0; i<4; i++) 
            {
                //Obtenemos el valor de la pareja más alta de m1
                if (m1.get(i).valor()==m1.get(i+1).valor())
                {
                	cont1++;
                    if (m1.get(i).valor()>valor1)
                    	{valor1=m1.get(i).valor();}
                }
                //Obtenemos el valor de la pareja más alta de m2
                if (m2.get(i).valor()==m2.get(i+1).valor())
                {
                	cont2++;
                    if (m2.get(i).valor()>valor2)
                    	{valor2=m2.get(i).valor();}
                }
            }
            
            //Resultado
            if(cont1==cont2)
            {
            if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            else{salida=false; System.out.println("Gana el Negro con:"+Negro);}
            }
            if(cont1>cont2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            else{salida=false; System.out.println("Gana el Negro con:"+Negro);}
        }
        
        return salida;
    };
   
/************************************* TRIO ******************************************/
    
    public boolean trio(LinkedList<Carta> m1, LinkedList<Carta> m2)
    {
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) {
            int valor1=0, valor2=0, cont1=0, cont2=0;
            
            for (int i=0; i<4; i++)
            {
                //Obtenemos el valor del trío de m1
                if (m1.get(i).valor()==m1.get(i+1).valor()) {cont1++;}
                else if (cont1==2) {valor1=m1.get(i).valor();}
                else{cont1=0;}
                
                //Obtenemos el valor del trío de m2
                if (m2.get(i).valor()==m2.get(i+1).valor()) {cont2++;}
                else if (cont2==2) {valor2=m2.get(i).valor();}
                else{cont2=0;}
            }
            
            //Resultado
            if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            
            else{salida=false; System.out.println("Gana el Negro con:"+Negro);}

        }
        
        return salida;
    };
    
/************************************* POKER ******************************************/

    public boolean poker(LinkedList<Carta> m1, LinkedList<Carta> m2)
    {
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) {
            int valor1=0, valor2=0, cont1=0, cont2=0;
            
            for (int i=0; i<4; i++)
            {
                //Obtenemos el valor del poker de m1
                if (m1.get(i).valor()==m1.get(i+1).valor()) {cont1++;}
                else if (cont1==3) {valor1=m1.get(i).valor();}
                else{cont1=0;}
                
                //Obtenemos el valor del poker de m2
                if (m2.get(i).valor()==m2.get(i+1).valor()) {cont2++;}
                else if (cont2==3) {valor2=m2.get(i).valor();}
                else{cont2=0;}
            }
            
            //Resultado
            if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            
            else{salida=false; System.out.println("Gana el Negro con:"+Negro);}

        }
        
        return salida;
    };

/************************************* COLOR ******************************************/
    
    public boolean color(LinkedList<Carta> m1, LinkedList<Carta> m2) {
        boolean salida=true;
        
        if (!(m1.isEmpty() && m2.isEmpty())) 
        {
            int valor1=0, valor2=0,cont1=0,cont2=0;
            boolean sal=true;
            
            for (int i=0; i<m1.size() && sal; i++)
            {
            	if(m1.get(i).palo()==m1.get(i+1).palo()) {cont1++;}
            
                if (m1.get(i).valor()>valor1)
                    valor1 = m1.get(i).valor();
            }

            for (int j=0; j<4;j++) 
            {
            	if(m2.get(j).palo()==m2.get(j+1).palo()) {cont2++;}
            	
                if (m2.get(j).valor()>valor2)
                    valor2 = m2.get(j).valor();
            }

            //Resultado
            if (cont1==4 && cont2==4)
            {
            	if (valor1>valor2){salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            
            	else {salida=false; System.out.println("Gana el Negro con:"+Negro);}
            }
            else if (cont1==4 && cont2<4) {salida=true; System.out.println("Gana el Blanco con:"+Blanco);}
            else if (cont1<4 && cont2==4) {salida=false; System.out.println("Gana el Negro con:"+Negro);}
        }
        
        return salida;
    };   
}

