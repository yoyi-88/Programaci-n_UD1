Algoritmo paroimparfuncion
	leer n
	resultado = espar(n)
	escribir resultado
	si resultado = Verdadero
		Escribir "El número es par"
	SiNo
		Escribir "El número es impar"
	FinSi
	
FinAlgoritmo

Funcion resultado = espar(n)
	si (n mod 2) = 0 
		resultado = Verdadero
	SiNo
		resultado = Falso
	FinSi
FinFuncion