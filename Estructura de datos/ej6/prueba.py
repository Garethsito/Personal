# Patrón Decorador en Python
# Caso práctico: Decorar un mensaje con diferentes estilos

# Componente base
class Mensaje:
    def obtener_mensaje(self):
        return "Hola, mundo!"

# Decorador base
class DecoradorMensaje:
    def __init__(self, mensaje):
        self._mensaje = mensaje
    
    def obtener_mensaje(self):
        return self._mensaje.obtener_mensaje()

# Decorador concreto 1: Añadir negritas
class NegritaDecorador(DecoradorMensaje):
    def obtener_mensaje(self):
        return f"**{self._mensaje.obtener_mensaje()}**"

# Decorador concreto 2: Añadir subrayado
class SubrayadoDecorador(DecoradorMensaje):
    def obtener_mensaje(self):
        return f"__{self._mensaje.obtener_mensaje()}__"

# Caso práctico
if __name__ == "__main__":
    mensaje_simple = Mensaje()
    mensaje_negrita = NegritaDecorador(mensaje_simple)
    mensaje_subrayado = SubrayadoDecorador(mensaje_simple)
    mensaje_combinado = NegritaDecorador(SubrayadoDecorador(mensaje_simple))
    
    print("Mensaje original:", mensaje_simple.obtener_mensaje())
    print("Mensaje en negritas:", mensaje_negrita.obtener_mensaje())
    print("Mensaje subrayado:", mensaje_subrayado.obtener_mensaje())
    print("Mensaje en negritas y subrayado:", mensaje_combinado.obtener_mensaje())

# Pruebas unitarias
import unittest

class TestDecoradorMensaje(unittest.TestCase):
    def test_mensaje_original(self):
        mensaje = Mensaje()
        self.assertEqual(mensaje.obtener_mensaje(), "Hola, mundo!")
    
    def test_mensaje_negrita(self):
        mensaje = NegritaDecorador(Mensaje())
        self.assertEqual(mensaje.obtener_mensaje(), "**Hola, mundo!**")
    
    def test_mensaje_subrayado(self):
        mensaje = SubrayadoDecorador(Mensaje())
        self.assertEqual(mensaje.obtener_mensaje(), "__Hola, mundo!__")
    
    def test_mensaje_combinado(self):
        mensaje = NegritaDecorador(SubrayadoDecorador(Mensaje()))
        self.assertEqual(mensaje.obtener_mensaje(), "**__Hola, mundo!__**")

if __name__ == "__main__":
    unittest.main()
