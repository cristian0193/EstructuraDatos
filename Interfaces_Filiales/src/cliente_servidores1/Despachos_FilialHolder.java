package cliente_servidores1;

/**
* cliente_servidores1/Despachos_FilialHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Filial.idl
* s�bado 22 de abril de 2017 10:46:53 PM COT
*/

public final class Despachos_FilialHolder implements org.omg.CORBA.portable.Streamable
{
  public cliente_servidores1.Despachos_Filial value = null;

  public Despachos_FilialHolder ()
  {
  }

  public Despachos_FilialHolder (cliente_servidores1.Despachos_Filial initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = cliente_servidores1.Despachos_FilialHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    cliente_servidores1.Despachos_FilialHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return cliente_servidores1.Despachos_FilialHelper.type ();
  }

}
