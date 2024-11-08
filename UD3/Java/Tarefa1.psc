Algoritmo sin_titulo
	Leer n;
	Mientras (n <> 0) hacer
		Si (n > 0) entonces
			numPositivos <- + 1;
			sumaPositivos <- + n;
		SiNo
			numNegativos <- + 1;
			sumaNegativos <- + n;
		FinSi
	Leer n;
FinMientras
mediaPositivos = sumaPositivos / numPositivos;
mediaNegativos = sumaNegativos / numNegativos;
Si numPositivos <> 0 entonces
Mostrar ("La media de los números positivos es de ");
Mostrar (mediaPositivos);
FinSi
Si numNegativos <> 0 entonces
Mostrar ("La media de los números positivos es de ");
Mostrar (mediaNegativos);
FinSi
FinAlgoritmo
