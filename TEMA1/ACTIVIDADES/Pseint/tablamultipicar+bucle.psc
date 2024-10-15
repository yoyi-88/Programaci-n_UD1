Algoritmo tablamultiplicar
	Definir numero1 Como Entero
	Definir x Como Entero
	Definir resultado Como Entero
	Definir pregunta Como Cadena
	Repetir
		Escribir "Introduzca número para la realización de la tabla de multiplicar"
		Leer numero1
		Para x = 0 Hasta 10 Con Paso 1
			resultado = numero1 * x
			Escribir numero1 "*" , x , "=" , resultado
		FinPara
		Escribir "¿Desea continuar? (Si/Salir)"
		Leer pregunta
	Hasta Que pregunta = "salir" o pregunta = "Salir"
FinAlgoritmo
