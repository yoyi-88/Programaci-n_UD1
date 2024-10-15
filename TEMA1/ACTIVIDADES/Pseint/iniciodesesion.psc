Algoritmo iniciodesesion
	Definir usuario Como Cadena
	Definir contraseña Como Cadena
	usuario = "yoyi"
	Escribir "Escriba su nombre de usuario"
	Leer usuario
	Si usuario = "yoyi" Entonces
		Escribir "Nombre de usuario correcto"
		Escribir "Introduzca contraseña"
		Leer contraseña
		Si contraseña = "yoyi" Entonces
			Escribir "Ha iniciado sesión correctamente"
		SiNo
			Escribir "contraseña incorrecta"
		FinSi
	SiNo
		Escribir "Nombre de usuario incorrecto"
	FinSi
FinAlgoritmo