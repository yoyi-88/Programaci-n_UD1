Algoritmo iniciodesesion
	Escribir "Escriba su nombre de usuario"
	leer user
	Si user = "yoyi" Entonces
		Escribir "Nombre de usuario correcto"
		Escribir "Introduzca contraseña"
		leer contraseña
		si contraseña = "yoyi" Entonces
			escribir "Ha iniciado sesión correctamente"
		SIno
			escribir "contraseña incorrecta"
		FinSi
	SiNo
		Escribir "Nombre de usuario incorrecto"
	FinSi
FinAlgoritmo

