package app_despachos_cliente;

import cliente_servidores.DespachosPOA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DespachoImplementacion extends DespachosPOA {

    @Override
    public int insertarDespachos(int id_filiales, String nombre_filiales, int id_producto, String descripcion_producto, int id_conductor, String nombre_conductor, String direccion_despacho, String fecha_salida, String hora_salida, String fecha_llegada, String hora_llegada, String peso_mercancia, String autorizo, String fecha_creacion) {
        String query = "";
        int resultado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_despacho_c1", "root", "");
            query = "INSERT INTO tbl_despacho VALUES (NULL,'"
                    + id_filiales + "','"
                    + nombre_filiales + "','"
                    + id_producto + "','"
                    + descripcion_producto + "','"
                    + id_conductor + "','"
                    + nombre_conductor + "','"
                    + direccion_despacho + "','"
                    + fecha_salida + "','"
                    + hora_salida + "','"
                    + fecha_llegada + "','"
                    + hora_llegada + "','"
                    + peso_mercancia + "','"
                    + autorizo + "','"
                    + "NOW())";

            Statement st = cn.createStatement();
            int valor = st.executeUpdate(query);

            if (valor > 0) {
                resultado = valor;
            } else {
                resultado = 0;
            }

            st.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public int insertarFiliales(String nombre, String origen, String ubicacion, String actividad, String fecha_creacion) {
        String query = "";
        int resultado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_filiales_s1", "root", "");
            query = "INSERT INTO tbl_filiales VALUES (NULL,'" + nombre + "','" + origen + "','" + ubicacion + "','" + actividad + "',NOW())";
            Statement st = cn.createStatement();
            int valor = st.executeUpdate(query);

            if (valor > 0) {
                resultado = valor;
            } else {
                resultado = 0;
            }

            st.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public int insertarProductos(String descripcion, int cantidad_stock, String fecha_fabricacion, String fecha_vencimiento, String fecha_creacion) {
        String query = "";
        int resultado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_productos_s2", "root", "");
            query = "INSERT INTO tbl_productos VALUES (NULL,'" + descripcion + "'," + cantidad_stock + ",'" + fecha_fabricacion + "','" + fecha_vencimiento + "',NOW())";
            Statement st = cn.createStatement();
            int valor = st.executeUpdate(query);

            if (valor > 0) {
                resultado = valor;
            } else {
                resultado = 0;
            }

            st.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public int insertarConductores(String nombre_completo, int edad, String direccion, String telefono, String experiencia, String fecha_creacion) {
        String query = "";
        int resultado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_conductores_s3", "root", "");
            query = "INSERT INTO tbl_conductores VALUES (NULL,'" + nombre_completo + "','" + edad + "','" + direccion + "','" + telefono + "','" + experiencia + "',NOW())";
            Statement st = cn.createStatement();
            int valor = st.executeUpdate(query);

            if (valor > 0) {
                resultado = valor;
            } else {
                resultado = 0;
            }

            st.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public String consultaFiliales_id(String id_filial) {
        String query = "";
        int resultado = 0;
        String nombre = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_filiales_s1", "root", "");
            query = "SELECT nombre FROM tbl_filiales WHERE id = " + id_filial;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                nombre = rs.getString("nombre");
            }

            rs.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }

    @Override
    public String consultaProductos_id(String id_producto) {
        String query = "";
        int resultado = 0;
        String descripcion = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_productos_s2", "root", "");
            query = "SELECT descripcion FROM tbl_productos WHERE id = " + id_producto;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                descripcion = rs.getString("descripcion");
            }

            rs.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return descripcion;
    }

    @Override
    public String consultaConductor_id(String id_conductor) {
        String query = "";
        int resultado = 0;
        String nombre = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_conductores_s3", "root", "");
            query = "SELECT nombre_completo FROM tbl_conductores WHERE id = " + id_conductor;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                nombre = rs.getString("nombre_completo");
            }

            rs.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }

    @Override
    public int validarUsuarioServidor1(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarUsuarioServidor2(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int validarUsuarioServidor3(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
    }

    @Override
    public int validarUsuarioCliente(String usuario, String contrasena) {
        String query = "";
        int resultado = 0, valor = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_despacho_c1", "root", "");
            query = "SELECT count(id) as resultado FROM tbl_usuario_cliente where usuario = '" + usuario + "' and contrasena = '" + contrasena + "';";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                valor = Integer.parseInt(rs.getString("resultado"));
            }

            if (valor > 0) {
                resultado = valor;
            } else {
                resultado = 0;
            }

            st.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(DespachoImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

}
