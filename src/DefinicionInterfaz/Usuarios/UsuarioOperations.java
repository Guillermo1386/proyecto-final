package DefinicionInterfaz.Usuarios;


public interface UsuarioOperations 
{
  boolean insertarUsuario (int cedula, String nombre, String apellido, String telefono, String genero);
  boolean actualizarUsuario (int cedula, String nombre, String apellido, String telefono, String genero);
  boolean eliminarUsuario (int cedula);
  String consultarUsuario (int cedula);
  void shoutdown ();
} // interface UsuarioOperations
