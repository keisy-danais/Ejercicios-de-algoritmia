Algoritmo DeterminacionParoImpar
	
	Definir num Como Entero
	Escribir "Digite su número Entero"
	Leer num
	
	
	si num<0 Entonces
		Escribir "Su número es negativo"
	SiNo
		si num>0 Entonces
			Escribir "Su numero es posivo"
		SiNo
			Escribir "El numero es cero"
		FinSi
		
	FinSi
	
	si num MOD 2=0 Entonces
		Escribir "Su número es par"
	SiNo
		Escribir "Su numero es impar"
	FinSi
	
FinAlgoritmo
