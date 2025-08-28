%ejercicio 28
%relacion y objeto
esmascota(solovino).
%hechos
masgrande(camello,elefante).
masgrande(caballo,perro).
masgrande(perro,cuyo).
masgarnde(cuyo,raton).
masgrande(raton,hamnster).
masgrande(hamster,hormiga).

%reglas
muchomasgrande(A,C):-masgrande(A,B),masgarnde(B,C).