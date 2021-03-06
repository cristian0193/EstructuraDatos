package cliente_servidores2;


/**
* cliente_servidores2/Despachos_ProductosPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Productos.idl
* s�bado 22 de abril de 2017 10:47:05 PM COT
*/

public abstract class Despachos_ProductosPOA extends org.omg.PortableServer.Servant
 implements cliente_servidores2.Despachos_ProductosOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarProductos", new java.lang.Integer (0));
    _methods.put ("consultaProductos_id", new java.lang.Integer (1));
    _methods.put ("validarUsuarioServidor2", new java.lang.Integer (2));
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
       case 0:  // cliente_servidores2/Despachos_Productos/insertarProductos
       {
         String codigo_producto = in.read_wstring ();
         String descripcion = in.read_wstring ();
         int cantidad_stock = in.read_long ();
         String fecha_fabricacion = in.read_wstring ();
         String fecha_vencimiento = in.read_wstring ();
         String fecha_creacion = in.read_wstring ();
         int $result = (int)0;
         $result = this.insertarProductos (codigo_producto, descripcion, cantidad_stock, fecha_fabricacion, fecha_vencimiento, fecha_creacion);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // cliente_servidores2/Despachos_Productos/consultaProductos_id
       {
         String id_producto = in.read_wstring ();
         String $result = null;
         $result = this.consultaProductos_id (id_producto);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // cliente_servidores2/Despachos_Productos/validarUsuarioServidor2
       {
         String usuario = in.read_wstring ();
         String contrasena = in.read_wstring ();
         int $result = (int)0;
         $result = this.validarUsuarioServidor2 (usuario, contrasena);
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
    "IDL:cliente_servidores2/Despachos_Productos:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Despachos_Productos _this() 
  {
    return Despachos_ProductosHelper.narrow(
    super._this_object());
  }

  public Despachos_Productos _this(org.omg.CORBA.ORB orb) 
  {
    return Despachos_ProductosHelper.narrow(
    super._this_object(orb));
  }


} // class Despachos_ProductosPOA
