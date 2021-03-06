package cliente_servidores3;


/**
* cliente_servidores3/Despachos_ConductorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Conductor.idl
* s�bado 22 de abril de 2017 10:46:39 PM COT
*/

public abstract class Despachos_ConductorPOA extends org.omg.PortableServer.Servant
 implements cliente_servidores3.Despachos_ConductorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarConductores", new java.lang.Integer (0));
    _methods.put ("consultaConductor_id", new java.lang.Integer (1));
    _methods.put ("validarUsuarioServidor3", new java.lang.Integer (2));
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
       case 0:  // cliente_servidores3/Despachos_Conductor/insertarConductores
       {
         String codigo_conductor = in.read_wstring ();
         String nombre_completo = in.read_wstring ();
         int edad = in.read_long ();
         String direccion = in.read_wstring ();
         String telefono = in.read_wstring ();
         String experiencia = in.read_wstring ();
         String fecha_creacion = in.read_wstring ();
         int $result = (int)0;
         $result = this.insertarConductores (codigo_conductor, nombre_completo, edad, direccion, telefono, experiencia, fecha_creacion);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // cliente_servidores3/Despachos_Conductor/consultaConductor_id
       {
         String id_conductor = in.read_wstring ();
         String $result = null;
         $result = this.consultaConductor_id (id_conductor);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // cliente_servidores3/Despachos_Conductor/validarUsuarioServidor3
       {
         String usuario = in.read_wstring ();
         String contrasena = in.read_wstring ();
         int $result = (int)0;
         $result = this.validarUsuarioServidor3 (usuario, contrasena);
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
    "IDL:cliente_servidores3/Despachos_Conductor:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Despachos_Conductor _this() 
  {
    return Despachos_ConductorHelper.narrow(
    super._this_object());
  }

  public Despachos_Conductor _this(org.omg.CORBA.ORB orb) 
  {
    return Despachos_ConductorHelper.narrow(
    super._this_object(orb));
  }


} // class Despachos_ConductorPOA
