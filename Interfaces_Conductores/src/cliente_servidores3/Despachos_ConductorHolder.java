package cliente_servidores3;

/**
* cliente_servidores3/Despachos_ConductorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Conductor.idl
* s�bado 22 de abril de 2017 10:46:39 PM COT
*/

public final class Despachos_ConductorHolder implements org.omg.CORBA.portable.Streamable
{
  public cliente_servidores3.Despachos_Conductor value = null;

  public Despachos_ConductorHolder ()
  {
  }

  public Despachos_ConductorHolder (cliente_servidores3.Despachos_Conductor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = cliente_servidores3.Despachos_ConductorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    cliente_servidores3.Despachos_ConductorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return cliente_servidores3.Despachos_ConductorHelper.type ();
  }

}
