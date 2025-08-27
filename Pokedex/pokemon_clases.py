from pokemon_base import PokemonBase

# Clase genérica de Pokémon
class Pokemon(PokemonBase):
    def __init__(self, nombre, descripcion, ataque, defensa, vida, nivel=1, evolucion=1, atrapado=False):
        super().__init__(nombre, descripcion, ataque, defensa, vida, nivel, evolucion, atrapado)

    # El metodo entrenar esta en la clase entrenamiento

    def actualizar(self):
        self.ataque += 15
        self.defensa += 30
        self.vida += 50
    #metodo abstracto
    def hablar(self):
        print(f"{self.nombre}! {self.nombre}!")

    #metodo abstracto
    def detallesPokemon(self):
        print(f"Nombre: {self.nombre}, Descripción: {self.descripcion}, Ataque: {self.ataque}, Defensa: {self.defensa}, Vida: {self.vida}, Nivel: {self.nivel}, Evolución: {self.evolucion}, Atrapado: {self.atrapado}")

    def atacar(self, enemigo):
        print(f"{self.nombre} usa un ataque básico.")
        daño = max(0, self.ataque - enemigo.defensa)
        enemigo.vida -= daño
        print(f"{enemigo.nombre} recibe {daño} de daño. Vida restante: {enemigo.vida}")

    def ganar_experiencia(self, puntos):
        """
        Incrementa los niveles del Pokémon en función de los puntos de experiencia.
        Si alcanza el nivel 100, evoluciona automáticamente.
        """
        self.nivel += puntos
        if self.nivel >= 100:
            self.nivel = 100
            self.evolucionar()

    def evolucionar(self):
        """
        Evoluciona al Pokémon si no está en la evolución máxima.
        """
        if self.evolucion < 3:
            self.evolucion += 1
            self.nivel = 1  # Reinicia el nivel al evolucionar.
            print(f"¡{self.nombre} ha evolucionado! Ahora está en la evolución {self.evolucion}.")
        else:
            print(f"{self.nombre} ya está en su evolución máxima.")


# Pokémon de tipo Agua
class PokemonAgua(Pokemon):
    def __init__(self, nombre="Squirtle", descripcion="Un Pokémon de agua", ataque=0, defensa=0, vida=0, nivel=1, evolucion=1, atrapado=False):
        super().__init__(nombre, descripcion, ataque, defensa, vida, nivel, evolucion, atrapado)
        self.ataque_especial = "Hidrobomba"

    def atacar(self, enemigo):
        print(f"{self.nombre} usa {self.ataque_especial}!")
        efectividad = 1.5 if isinstance(enemigo, PokemonFuego) else 1
        daño = max(0, (self.ataque * efectividad) - enemigo.defensa)
        enemigo.vida -= daño
        print(f"{enemigo.nombre} recibe {daño} de daño. Vida restante: {enemigo.vida}")


# Pokémon de tipo Fuego
class PokemonFuego(Pokemon):
    def __init__(self, nombre="Charmander", descripcion="Un Pokémon de fuego", ataque=0, defensa=0, vida=0, nivel=1, evolucion=1, atrapado=False):
        super().__init__(nombre, descripcion, ataque, defensa, vida, nivel, evolucion, atrapado)
        self.ataque_especial = "Llamarada"

    def atacar(self, enemigo):
        print(f"{self.nombre} usa {self.ataque_especial}!")
        efectividad = 1.5 if isinstance(enemigo, PokemonHierba) else 1
        daño = max(0, (self.ataque * efectividad) - enemigo.defensa)
        enemigo.vida -= daño
        print(f"{enemigo.nombre} recibe {daño} de daño. Vida restante: {enemigo.vida}")


# Pokémon de tipo Eléctrico
class PokemonElectrico(Pokemon):
    def __init__(self, nombre="Pikachu", descripcion="Un Pokémon eléctrico", ataque=0, defensa=0, vida=0, nivel=1, evolucion=1, atrapado=False):
        super().__init__(nombre, descripcion, ataque, defensa, vida, nivel, evolucion, atrapado)
        self.ataque_especial = "Rayo"

    def atacar(self, enemigo):
        print(f"{self.nombre} usa {self.ataque_especial}!")
        efectividad = 1.5 if isinstance(enemigo, PokemonAgua) else 1
        daño = max(0, (self.ataque * efectividad) - enemigo.defensa)
        enemigo.vida -= daño
        print(f"{enemigo.nombre} recibe {daño} de daño. Vida restante: {enemigo.vida}")


# Pokémon de tipo Hierba
class PokemonHierba(Pokemon):
    def __init__(self, nombre="Bulbasaur", descripcion="Un Pokémon de hierba", ataque=0, defensa=0, vida=0, nivel=1, evolucion=1, atrapado=False):
        super().__init__(nombre, descripcion, ataque, defensa, vida, nivel, evolucion, atrapado)
        self.ataque_especial = "Látigo Cepa"

    def atacar(self, enemigo):
        print(f"{self.nombre} usa {self.ataque_especial}!")
        efectividad = 1.5 if isinstance(enemigo, PokemonAgua) else 1
        daño = max(0, (self.ataque * efectividad) - enemigo.defensa)
        enemigo.vida -= daño
        print(f"{enemigo.nombre} recibe {daño} de daño. Vida restante: {enemigo.vida}")
