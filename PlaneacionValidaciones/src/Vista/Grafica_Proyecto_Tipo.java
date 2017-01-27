package Vista;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Grafica_Proyecto_Tipo extends javax.swing.JFrame {

    JPanel panel;
    ConexioSQLite conexion;
    DefaultPieDataset dataset;

    public Grafica_Proyecto_Tipo() {
        setTitle("Como Hacer Graficos con Java");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        init();
    }

    private void init() {

        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        dataset = new DefaultPieDataset();

        cadena_tipo_validacion();

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart("Proyectos x Tipo", dataset, true, true, false);

        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black);

        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);

    }     
    
    public void cadena_tipo_validacion() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        String tipo_calificacion = "";
        double cantidades = 0;
        double resultado = 0;
        double porcentaje = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT TIPO_VALIDACION AS TIPO_VALIDACIONES,COUNT(TIPO_VALIDACION) AS CONTADOR FROM PLANEACIONES_VALIDACION WHERE (ESTADO_PROYECTO NOT IN ('En Creacion')) GROUP BY TIPO_VALIDACION;";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            while (rs.next()) {
                tipo_calificacion = rs.getString("TIPO_VALIDACIONES");
                cantidades = Double.parseDouble(rs.getString("CONTADOR"));                

                dataset.setValue(tipo_calificacion + "\n " + cantidades + "%", cantidades);
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

   

    public static void main(String args[]) {
        new Grafica_Proyecto_Tipo().setVisible(true);
    }
}
