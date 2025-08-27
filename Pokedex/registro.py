def guardar_combate_en_archivo(pokemon_usuario, pokemon_enemigo, archivo="registro_combates.txt"):
    """
    Guarda los detalles de un combate en un archivo de texto.
    """
    with open(archivo, "a") as file:
        file.write(f"\n--- Combate Registrado ---\n")
        file.write(f"Nombre del enemigo: {pokemon_enemigo.nombre}\n")
        if pokemon_enemigo.vida < pokemon_usuario.vida:
            file.write(f"GANADOR: {pokemon_usuario.nombre}!!")
        else:
            file.write(f"GANADOR: {pokemon_enemigo.nobre}\n!!")
        file.write(f"Detalles finales del enemigo:\n")
        file.write(f"Ataque: {pokemon_enemigo.ataque}\n")
        file.write(f"Defensa: {pokemon_enemigo.defensa}\n")
        file.write(f"Vida: {pokemon_enemigo.vida}\n")
        file.write(f"Nivel: {pokemon_enemigo.nivel}\n")
        file.write(f"Evolución: {pokemon_enemigo.evolucion}\n")
        file.write("-------------------------\n")
    print("El combate ha sido guardado exitosamente.")

def leer_registros_combates(archivo="registro_combates.txt"):
    """
    Lee y muestra el contenido del archivo de combates.
    """
    try:
        with open(archivo, "r") as file:
            contenido = file.read()
            if contenido:
                print("\n--- Registros de Combates ---")
                print(contenido)
            else:
                print("No hay registros de combates aún.")
    except FileNotFoundError:
        print("No hay registros de combates aún. El archivo no existe.")
