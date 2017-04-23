package cliente_servidores1;


/**
* cliente_servidores1/Despachos_FilialPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Filial.idl
* s�bado 22 de abril de 2017 10:46:53 PM COT
*/

public abstract class Despachos_FilialPOA extends org.omg.PortableServer.Servant
 implements cliente_servidores1.Despachos_FilialOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarFiliales", new java.lang.Integer (0));
    _methods.put ("consultaFiliales_id", new java.lang.Integer (1));
    _methods.put ("validarUsuarioServidor1", new java.lang.Integer (2));
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
       case 0:  // cliente_servidores1/Despachos_Filial/insertarFiliales
       {
         String codigo_filial = in.read_wstring ();
         String nombre = in.read_wstring ();
         String origen = in.read_wstring ();
         String ubicacion = in.read_wstring ();
         String actividad = in.read_wstring ();
         String fecha_creacion = in.read_wstring ();
         int $result = (int)0;
         $result = this.insertarFiliales (codigo_filial, nombre, origen, ubicacion, actividad, fecha_creacion);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // cliente_servidores1/Despachos_Filial/consultaFiliales_id
       {
         String id_filial = in.read_wstring ();
         String $result = null;
         $result = this.consultaFiliales_id (id_filial);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // cliente_servidores1/Despachos_Filial/validarUsuarioServidor1
       {
         String usuario = in.read_wstring ();
         String contrasena = in.read_wstring ();
         int $result = (int)0;
         $result = this.validarUsuarioServidor1 (usuario, contrasena);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:cliente_servidores1/Despachos_Filial:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Despachos_Filial _this() 
  {
    return Despachos_FilialHelper.narrow(
    super._this_object());
  }

  public Despachos_Filial _this(org.omg.CORBA.ORB orb) 
  {
    return Despachos_FilialHelper.narrow(
    super._this_object(orb));
  }


} // class Despachos_FilialPOA