Algoritmo TabladeMultiplicar
	
	Definir n,i,resultado,contadorPares Como real
	
	Escribir "Digite su numero entero"
	Leer n
	contadores<-0
	
	Para i<-1 Hasta 10 Hacer
		resultado<-n*i
		
		Escribir n,"x",i,"=",resultado
		
		si resultado MOD 2=0 Entonces
			contadorPares=contadorPares+1
		FinSi
	Fin Para
	
	Escribir "El resultado par es",contadorPares
	
FinAlgoritmo
