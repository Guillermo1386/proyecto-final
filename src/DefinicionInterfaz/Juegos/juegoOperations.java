package Juegos;


/**
* Juegos/juegoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Juego.idl
* domingo 11 de noviembre de 2018 04:08:47 PM COT
*/

public interface juegoOperations 
{
  boolean insertarVentajuego (int id, String nombre, String nombreJuego, String generoJuego, int subtotal, int cantidad, int totalPagar);
  boolean actualizarVentajuego (int id, String nombre, String nombreJuego, String generoJuego, int subtotal, int cantidad, int totalPagar);
  boolean eliminarVentajuego (int id);
  String consultarVentajuego (int id);
  void shoutdown ();
} // interface juegoOperations