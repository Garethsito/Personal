%padres: pilad y tomas
%hijos: belen y lucia
%hijos de belen son ana, pedro, oscar

es_progenitor(pilar,belen).
es_progenitor(pilar,lucia).
es_progenitor(tomas,belen).
es_progenitor(tomsa,lucia).
es_progenitor(belen,pedro).
es_progenitor(belen,ana).
es_progenitor(belen,oscar).
mujer(belen).
mujer(pilar).
hombre(tomas).

% si x es mujr y x es progenitor de y, significa que x es madre de y
madre(X,Y):-mujer(X),es_progenitor(X,Y).