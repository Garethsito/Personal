import random
from capturados import agregar_capturado
from registro import guardar_combate_en_archivo


def ataque_basico(pokemon, objetivo):
    daño = max(0, pokemon.ataque - objetivo.defensa)
    objetivo.vida -= daño
    objetivo.defensa -= 15  # El ataque básico reduce la defensa del objetivo.
    print(f"{pokemon.nombre} realizó un ataque básico. {objetivo.nombre} recibió {daño} de daño. Vida restante: {objetivo.vida}. Defensa restante: {objetivo.defensa}.")


def ataque_especial(pokemon, objetivo):
    daño = max(0, (pokemon.ataque * 2) - objetivo.defensa)
    objetivo.vida -= daño
    objetivo.defensa -= 30
    print(f"{pokemon.nombre} utilizó un ataque especial. {objetivo.nombre} recibió {daño} de daño. Vida restante: {objetivo.vida}.")


def curar(pokemon):
    pokemon.vida += 10
    print(f"{pokemon.nombre} se curó 20 puntos de vida. Vida actual: {pokemon.vida}.")


def turno_enemigo(pokemon_enemigo, pokemon_usuario):
    accion = random.choice(["ataque_basico", "ataque_especial", "curar"])
    if accion == "ataque_basico":
        ataque_basico(pokemon_enemigo, pokemon_usuario)
    elif accion == "ataque_especial":
        ataque_especial(pokemon_enemigo, pokemon_usuario)
    elif accion == "curar":
        curar(pokemon_enemigo)


def turno_usuario(pokemon_usuario, pokemon_enemigo):
    print("\n--- Tu Turno ---")
    print("Elige una acción:")
    print("1. Ataque Básico")
    print("2. Ataque Especial")
    print("3. Curar")
    try:
        eleccion = int(input("Selecciona una acción (1-3): "))
        if eleccion == 1:
            ataque_basico(pokemon_usuario, pokemon_enemigo)
        elif eleccion == 2:
            ataque_especial(pokemon_usuario, pokemon_enemigo)
        elif eleccion == 3:
            curar(pokemon_usuario)
        else:
            print("Opción no válida. Pierdes el turno.")
    except ValueError:
        print("Entrada inválida. Pierdes el turno.")


def simular_combate_por_turnos(pokemon_usuario, pokemon_enemigo):
    print(f"\n¡El combate comienza entre")
    pokemon_usuario.detallesPokemon()
    print("Y")
    pokemon_enemigo.detallesPokemon()
    while pokemon_usuario.vida > 0 and pokemon_enemigo.vida > 0:
        turno_usuario(pokemon_usuario, pokemon_enemigo)
        if pokemon_enemigo.vida <= 0:
            print(f"\n¡Has derrotado a {pokemon_enemigo.nombre}!")
            pokemon_usuario.ganar_experiencia(20)  # Gana experiencia al ganar el combate.
            break
        turno_enemigo(pokemon_enemigo, pokemon_usuario)
        if pokemon_usuario.vida <= 0:
            print(f"\n¡{pokemon_usuario.nombre} ha sido derrotado!")
            break

    # Intentar capturar si defensa del enemigo es ≤ 10
    if pokemon_enemigo.defensa <= 10:
        while (True):
            capturar = input(f"\n¿Deseas capturar a {pokemon_enemigo.nombre}? (sí/no): ").lower()
            if (capturar == "sí") or (capturar=="si"):#cambio de en caso de error en el acento
                pokemon_enemigo.atrapado=True
                agregar_capturado(pokemon_enemigo)
                print(f"¡Has capturado a {pokemon_enemigo.nombre}!")
                break
            elif capturar =="no":
                print(f"Decidiste no capturar a {pokemon_enemigo.nombre}.")
                break
            else:
                print("Opcion no valida, intente de nuevo!")
            
    else:
        print(f"No puedes capturar a {pokemon_enemigo.nombre} porque su defensa es mayor a 10.")

    # Guardar detalles del combate en archivo
    guardar_combate_en_archivo(pokemon_usuario, pokemon_enemigo)
