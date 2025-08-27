capturados = []

def agregar_capturado(pokemon):
    capturados.append(pokemon)
    print(f"¡{pokemon.nombre} ha sido agregado a tu lista de capturados!")

def mostrar_capturados():
    if not capturados:
        print("No tienes Pokémon capturados.")
        return
    print("Pokémon capturados:")
    for pokemon in capturados:
        pokemon.detallesPokemon()
