package Juegos;

/**
* Juegos/juegoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Juego.idl
* domingo 11 de noviembre de 2018 04:08:47 PM COT
*/

public final class juegoHolder implements org.omg.CORBA.portable.Streamable
{
  public Juegos.juego value = null;

  public juegoHolder ()
  {
  }

  public juegoHolder (Juegos.juego initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Juegos.juegoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Juegos.juegoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Juegos.juegoHelper.type ();
  }

}
