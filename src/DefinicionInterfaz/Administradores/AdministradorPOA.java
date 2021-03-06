package DefinicionInterfaz.Administradores;


/**
* Administradores/AdministradorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Administrador.idl
* viernes 9 de noviembre de 2018 05:48:08 PM COT
*/

public abstract class AdministradorPOA extends org.omg.PortableServer.Servant
 implements DefinicionInterfaz.Administradores.AdministradorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarAdministrador", new java.lang.Integer (0));
    _methods.put ("actualizarAdministrador", new java.lang.Integer (1));
    _methods.put ("eliminarAdministrador", new java.lang.Integer (2));
    _methods.put ("consultarAdministrador", new java.lang.Integer (3));
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
       case 0:  // Administradores/Administrador/insertarAdministrador
       {
         int codigo = in.read_long ();
         String nombre = in.read_wstring ();
         String genero = in.read_wstring ();
         String valor = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String estado = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarAdministrador (codigo, nombre, genero, valor, cantidad, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Administradores/Administrador/actualizarAdministrador
       {
         int codigo = in.read_long ();
         String nombre = in.read_wstring ();
         String genero = in.read_wstring ();
         String valor = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String estado = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarAdministrador (codigo, nombre, genero, valor, cantidad, estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Administradores/Administrador/eliminarAdministrador
       {
         int codigo = in.read_long ();
         boolean $result = false;
         $result = this.eliminarAdministrador (codigo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Administradores/Administrador/consultarAdministrador
       {
         int codigo = in.read_long ();
         String $result = null;
         $result = this.consultarAdministrador (codigo);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Administradores/Administrador/shoutdown
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
    "IDL:Administradores/Administrador:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Administrador _this() 
  {
    return AdministradorHelper.narrow(
    super._this_object());
  }

  public Administrador _this(org.omg.CORBA.ORB orb) 
  {
    return AdministradorHelper.narrow(
    super._this_object(orb));
  }


} // class AdministradorPOA
