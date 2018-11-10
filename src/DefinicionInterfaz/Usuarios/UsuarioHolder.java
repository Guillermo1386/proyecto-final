package DefinicionInterfaz.Usuarios;



public final class UsuarioHolder implements org.omg.CORBA.portable.Streamable
{
  public DefinicionInterfaz.Usuarios.Usuario value = null;

  public UsuarioHolder ()
  {
  }

  public UsuarioHolder (DefinicionInterfaz.Usuarios.Usuario initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DefinicionInterfaz.Usuarios.UsuarioHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DefinicionInterfaz.Usuarios.UsuarioHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DefinicionInterfaz.Usuarios.UsuarioHelper.type ();
  }

}
