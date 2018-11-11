package DefinicionInterfaz.Juegos;


/**
* VentasJuegos/VentajuegoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from VentaJuego.idl
* domingo 11 de noviembre de 2018 02:20:52 AM COT
*/

public abstract class VentajuegoPOA extends org.omg.PortableServer.Servant
 implements DefinicionInterfaz.Juegos.VentajuegoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarVentajuego", new java.lang.Integer (0));
    _methods.put ("actualizarVentajuego", new java.lang.Integer (1));
    _methods.put ("eliminarVentajuego", new java.lang.Integer (2));
    _methods.put ("consultarVentajuego", new java.lang.Integer (3));
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
       case 0:  // VentasJuegos/Ventajuego/insertarVentajuego
       {
         int nombre = in.read_long ();
         String nombreJuego = in.read_wstring ();
         String generoJuego = in.read_wstring ();
         String precio = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String total = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarVentajuego (nombre, nombreJuego, generoJuego, precio, cantidad, total);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // VentasJuegos/Ventajuego/actualizarVentajuego
       {
         int nombre = in.read_long ();
         String nombreJuego = in.read_wstring ();
         String generoJuego = in.read_wstring ();
         String precio = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String total = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarVentajuego (nombre, nombreJuego, generoJuego, precio, cantidad, total);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // VentasJuegos/Ventajuego/eliminarVentajuego
       {
         int nombre = in.read_long ();
         boolean $result = false;
         $result = this.eliminarVentajuego (nombre);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // VentasJuegos/Ventajuego/consultarVentajuego
       {
         int nombre = in.read_long ();
         String $result = null;
         $result = this.consultarVentajuego (nombre);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // VentasJuegos/Ventajuego/shoutdown
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
    "IDL:VentasJuegos/Ventajuego:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Ventajuego _this() 
  {
    return VentajuegoHelper.narrow(
    super._this_object());
  }

  public Ventajuego _this(org.omg.CORBA.ORB orb) 
  {
    return VentajuegoHelper.narrow(
    super._this_object(orb));
  }


} // class VentajuegoPOA
