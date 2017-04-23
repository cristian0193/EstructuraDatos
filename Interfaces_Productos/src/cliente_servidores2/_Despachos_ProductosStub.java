package cliente_servidores2;


/**
* cliente_servidores2/_Despachos_ProductosStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Despachos_Productos.idl
* s�bado 22 de abril de 2017 10:47:05 PM COT
*/

public class _Despachos_ProductosStub extends org.omg.CORBA.portable.ObjectImpl implements cliente_servidores2.Despachos_Productos
{

  public int insertarProductos (String codigo_producto, String descripcion, int cantidad_stock, String fecha_fabricacion, String fecha_vencimiento, String fecha_creacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarProductos", true);
                $out.write_wstring (codigo_producto);
                $out.write_wstring (descripcion);
                $out.write_long (cantidad_stock);
                $out.write_wstring (fecha_fabricacion);
                $out.write_wstring (fecha_vencimiento);
                $out.write_wstring (fecha_creacion);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarProductos (codigo_producto, descripcion, cantidad_stock, fecha_fabricacion, fecha_vencimiento, fecha_creacion        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarProductos

  public String consultaProductos_id (String id_producto)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultaProductos_id", true);
                $out.write_wstring (id_producto);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultaProductos_id (id_producto        );
            } finally {
                _releaseReply ($in);
            }
  } // consultaProductos_id

  public int validarUsuarioServidor2 (String usuario, String contrasena)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("validarUsuarioServidor2", true);
                $out.write_wstring (usuario);
                $out.write_wstring (contrasena);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return validarUsuarioServidor2 (usuario, contrasena        );
            } finally {
                _releaseReply ($in);
            }
  } // validarUsuarioServidor2

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:cliente_servidores2/Despachos_Productos:1.0"};

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
} // class _Despachos_ProductosStub
