package DefinicionInterfaz.Usuarios;


public class _UsuarioStub extends org.omg.CORBA.portable.ObjectImpl implements DefinicionInterfaz.Usuarios.Usuario
{

  public boolean insertarUsuario (int cedula, String nombre, String apellido, String telefono, String genero)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarUsuario", true);
                $out.write_long (cedula);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (telefono);
                $out.write_wstring (genero);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarUsuario (cedula, nombre, apellido, telefono, genero        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarUsuario

  public boolean actualizarUsuario (int cedula, String nombre, String apellido, String telefono, String genero)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarUsuario", true);
                $out.write_long (cedula);
                $out.write_wstring (nombre);
                $out.write_wstring (apellido);
                $out.write_wstring (telefono);
                $out.write_wstring (genero);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarUsuario (cedula, nombre, apellido, telefono, genero        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarUsuario

  public boolean eliminarUsuario (int cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarUsuario", true);
                $out.write_long (cedula);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarUsuario (cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarUsuario

  public String consultarUsuario (int cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarUsuario", true);
                $out.write_long (cedula);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarUsuario (cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarUsuario

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
    "IDL:Usuarios/Usuario:1.0"};

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
} // class _UsuarioStub
