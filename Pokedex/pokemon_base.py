from abc import ABC, abstractmethod

class PokemonBase(ABC):
    #No entiendo los maximos o minimos
    def __init__(self, nombre="Sin Pokémon", descripcion="Sin descripción", ataque=0, defensa=0, vida=0, nivel=1, evolucion=1, atrapado=True):
        self.nombre = nombre
        self.descripcion = descripcion
        self.ataque = max(1, min(ataque, 1000))
        self.defensa = max(1, min(defensa, 1000))
        self.vida = max(1, min(vida, 1000))
        self.nivel = max(1, min(nivel, 100))
        self.evolucion = max(1, min(evolucion, 3))
        self.atrapado = atrapado
        

    @abstractmethod
    def hablar(self):
        pass

    @abstractmethod
    def actualizar(self):
        pass

    @abstractmethod
    def detallesPokemon(self):
        pass

    @abstractmethod
    def atacar(self, enemigo):
        pass
    ##Falta el metodo abstracto entrenar

    #No existe la clase abstracta entrenamiento