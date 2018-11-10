package DefinicionInterfaz.Usuarios;


abstract public class UsuarioHelper
{
  private static String  _id = "IDL:Usuarios/Usuario:1.0";

  public static void insert (org.omg.CORBA.Any a, DefinicionInterfaz.Usuarios.Usuario that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DefinicionInterfaz.Usuarios.Usuario extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DefinicionInterfaz.Usuarios.UsuarioHelper.id (), "Usuario");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DefinicionInterfaz.Usuarios.Usuario read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_UsuarioStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DefinicionInterfaz.Usuarios.Usuario value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DefinicionInterfaz.Usuarios.Usuario narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DefinicionInterfaz.Usuarios.Usuario)
      return (DefinicionInterfaz.Usuarios.Usuario)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DefinicionInterfaz.Usuarios._UsuarioStub stub = new DefinicionInterfaz.Usuarios._UsuarioStub ();
      stub._set_delegate(delegate);
      return (Usuario) stub;
    }
  }

  public static DefinicionInterfaz.Usuarios.Usuario unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DefinicionInterfaz.Usuarios.Usuario)
      return (DefinicionInterfaz.Usuarios.Usuario)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DefinicionInterfaz.Usuarios._UsuarioStub stub = new DefinicionInterfaz.Usuarios._UsuarioStub ();
      stub._set_delegate(delegate);
      return (Usuario) stub;
    }
  }

}
