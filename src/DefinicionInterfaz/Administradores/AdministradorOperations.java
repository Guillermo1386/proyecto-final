package  DefinicionInterfaz.Administradores;


public interface AdministradorOperations 
{
  boolean insertarAdministrador (int codigo, String nombre, String genero, String valor, String cantidad, String estado);
  boolean actualizarAdministrador (int codigo, String nombre, String genero, String valor, String cantidad, String estado);
  boolean eliminarAdministrador (int codigo);
  String consultarAdministrador (int codigo);
  void shoutdown ();
} // interface AdministradorOperations
