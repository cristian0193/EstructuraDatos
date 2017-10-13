package Vista;

import Conexion.ConexioSQLite;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica_Programadas_Semana extends javax.swing.JFrame {

    private JFrame frame;
    private JPanel panel;
    private JComboBox comboSemanaInicio;
    private JComboBox comboSemanaFin;
    ConexioSQLite conexion;

    // METODO CONSTRUCTOR
    public Grafica_Programadas_Semana() {
        setTitle("Como Hacer Graficos con Java");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);             
        init();
    }

    // METODO PARA CARGAR COMPONENTES
    private void init() {

        panel = new JPanel();        
        getContentPane().add(panel);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 33; i <= 37; i++) {
            int contador_programadas = contador_programadas(i);
            int contador_ejecutadas = contador_ejecutadas(i);

            dataset.setValue(contador_programadas, "Programadas", "" + i);
            dataset.setValue(contador_ejecutadas, "Ejecutadas", "" + i);
        }

        // CREANDO GRAFICO
        JFreeChart chart = ChartFactory.createBarChart("Validaciones Realizadas", "Validaciones", "Cantidad",
                dataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        p.getAnnotations();

        // MOSTRAR GRAFICO
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);

    }

    // METODO PARA CONTAR VALIDACIONES EJECUTADAS EN LA SEMANA
    public int contador_ejecutadas(int semana) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS EJECUTADAS FROM PLANEACIONES_VALIDACION WHERE SEMANA = " + semana + " AND ESTADO_PROYECTO = 'Ejecutada'; ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("EJECUTADAS"));
            }
            conexion.cerrar();
            return cont_ejecutadas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont_ejecutadas;
    }

    // METODO PARA CONTAR VALIDACIONES PROGRAMADAS EN LA SEMANA
    public int contador_programadas(int semana) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query;
        int cont_ejecutadas = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        // QUERY DE BASE DE DATOS
        query = "SELECT COUNT(ESTADO_PROYECTO) AS PROGRAMADAS FROM PLANEACIONES_VALIDACION WHERE SEMANA = " + semana + " AND (ESTADO_PROYECTO NOT IN ('En Creacion'));";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                // REGISTROS CONSULTADOS
                cont_ejecutadas = Integer.parseInt(rs.getString("PROGRAMADAS"));
            }
            conexion.cerrar();
            return cont_ejecutadas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return cont_ejecutadas;
    }

    // METODO PARA EJECUTAR
    public static void main(String args[]) {
        new Grafica_Programadas_Semana().setVisible(true);
    }
}
