package DefinicionInterfaz.Administradores;


public final class AdministradorHolder implements org.omg.CORBA.portable.Streamable
{
  public DefinicionInterfaz.Administradores.Administrador value = null;

  public AdministradorHolder ()
  {
  }

  public AdministradorHolder (DefinicionInterfaz.Administradores.Administrador initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DefinicionInterfaz.Administradores.AdministradorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DefinicionInterfaz.Administradores.AdministradorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DefinicionInterfaz. Administradores.AdministradorHelper.type ();
  }

}
