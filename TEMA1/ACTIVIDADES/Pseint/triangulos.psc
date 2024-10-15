Algoritmo triangulos
	Definir lado1 Como Real
	Definir lado2 Como Real
	Definir lado3 Como Real
	Escribir "Insertar Lado1"
	Leer lado1
	Escribir "Insertar Lado2"
	Leer lado2
	Escribir "Insertar Lado3"
	Leer lado3
	Si (lado1 + lado2 >= lado3) y (lado1 + lado3 >= lado2) y (lado2 + lado3 >= lado1) Entonces
		Escribir "Es un triángulo, y su tipo es "
		Si (lado1 = lado2) y (lado2 = lado3) Entonces
			Escribir"equilátero"
		SiNo
			Si (lado1 = lado2) o (lado2 = lado3) o (lado3 = lado1) Entonces
				Escribir"isósceles"
			SiNo
				Si (lado1 <> lado2) y (lado2 <> lado3) Entonces
					Escribir"escaleno"
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir  "No es un triángulo"
	FinSi
FinAlgoritmo
