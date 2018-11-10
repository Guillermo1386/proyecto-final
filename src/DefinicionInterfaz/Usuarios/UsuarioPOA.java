package DefinicionInterfaz.Usuarios;


public abstract class UsuarioPOA extends org.omg.PortableServer.Servant
 implements DefinicionInterfaz.Usuarios.UsuarioOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarUsuario", new java.lang.Integer (0));
    _methods.put ("actualizarUsuario", new java.lang.Integer (1));
    _methods.put ("eliminarUsuario", new java.lang.Integer (2));
    _methods.put ("consultarUsuario", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Usuarios/Usuario/insertarUsuario
       {
         int cedula = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String genero = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarUsuario (cedula, nombre, apellido, telefono, genero);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Usuarios/Usuario/actualizarUsuario
       {
         int cedula = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String genero = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarUsuario (cedula, nombre, apellido, telefono, genero);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Usuarios/Usuario/eliminarUsuario
       {
         int cedula = in.read_long ();
         boolean $result = false;
         $result = this.eliminarUsuario (cedula);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Usuarios/Usuario/consultarUsuario
       {
         int cedula = in.read_long ();
         String $result = null;
         $result = this.consultarUsuario (cedula);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Usuarios/Usuario/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Usuarios/Usuario:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Usuario _this() 
  {
    return UsuarioHelper.narrow(
    super._this_object());
  }

  public Usuario _this(org.omg.CORBA.ORB orb) 
  {
    return UsuarioHelper.narrow(
    super._this_object(orb));
  }


} // class UsuarioPOA
