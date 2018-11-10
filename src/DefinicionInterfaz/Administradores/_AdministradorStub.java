package DefinicionInterfaz.Administradores;


public class _AdministradorStub extends org.omg.CORBA.portable.ObjectImpl implements  DefinicionInterfaz.Administradores.Administrador
{

  public boolean insertarAdministrador (int codigo, String nombre, String genero, String valor, String cantidad, String estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarAdministrador", true);
                $out.write_long (codigo);
                $out.write_wstring (nombre);
                $out.write_wstring (genero);
                $out.write_wstring (valor);
                $out.write_wstring (cantidad);
                $out.write_wstring (estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarAdministrador (codigo, nombre, genero, valor, cantidad, estado        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarAdministrador

  public boolean actualizarAdministrador (int codigo, String nombre, String genero, String valor, String cantidad, String estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarAdministrador", true);
                $out.write_long (codigo);
                $out.write_wstring (nombre);
                $out.write_wstring (genero);
                $out.write_wstring (valor);
                $out.write_wstring (cantidad);
                $out.write_wstring (estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarAdministrador (codigo, nombre, genero, valor, cantidad, estado        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarAdministrador

  public boolean eliminarAdministrador (int codigo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarAdministrador", true);
                $out.write_long (codigo);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarAdministrador (codigo        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarAdministrador

  public String consultarAdministrador (int codigo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarAdministrador", true);
                $out.write_long (codigo);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarAdministrador (codigo        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarAdministrador

  public void shoutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shoutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shoutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shoutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Administradores/Administrador:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AdministradorStub
