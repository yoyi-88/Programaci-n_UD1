Algoritmo calculadora
	Definir a Como Real
	Definir b Como Real
	Definir c Como Cadena
	Definir operacion como real
	Escribir "Este programa es una caclculadora"
	Escribir "Elija el primer número"
	Leer a
	Escribir "Elija el segundo número"
	Leer b
	Escribir "Suma (s) Resta (r) Multiplicación (m) División (d)"
	Leer c
	Segun c Hacer
		"s":
			operacion = a + b
		"r":
			operacion = (a - b)
		"m":
			operacion = (a * b)
		"d":
			operacion = (a / b)
		De Otro Modo:
			Escribir "Fallo de escritura"
	Fin Segun
	Escribir "el resultado es: " , operacion 
FinAlgoritmo