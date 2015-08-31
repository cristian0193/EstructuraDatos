package parcialedexamenb;

import javax.swing.JOptionPane;

public class ParcialEDExamenB {

    public static String[] vectorEstudiantes;
    public static String[] vectorMateria;
    public static double[] VectorPromedioSemestral;
    public static double[][][] VetorMateriaExamen;
    public static String[] vectorNotas;
  

    public static int numeroIntero = 0;
    public static double numeroDouble = 0;
    public static String cadena = "";
    public static String nombre = "";
    public static double notaValidacion;
    public static double notaDefinitiva = 0.0;
    public static double notafinal = 0.0;
    public static double notaDefinida = 0.0;
    public static String resultado = "";
    public static String calificacionFinal = "";
    public static String resultadoAprobados = "";
    public static String resultadoReprobados = "";
    public static String nombreEstudiante = "";

    static final int numeroMaterias = 5;
    static final int numeroExamenes = 3;
    static final int numeroEstudiantes = 2;
    static final int maximaOpcionMenu = 3;

    public static void main(String[] args) {

        vectorEstudiantes = new String[numeroEstudiantes];
        VectorPromedioSemestral = new double[vectorEstudiantes.length];
        vectorNotas = new String[numeroEstudiantes];
        VetorMateriaExamen = new double[vectorEstudiantes.length][numeroMaterias][numeroExamenes];

        ParcialEDExamenB objClasePrincipal = new ParcialEDExamenB();
        int opcionMenu;

        String menu = "Seleccione una opción\n\n"
                + "1.- Agregar nota \n"
                + "2.- Consultar notas\n"
                + "3.- Consultar Notas Finales\n"
                + "4.- Consultar Estudiantes Aprobados\n"
                + "5.- Consultar Estudiantes Reprobados\n"
                + "0.- Salir\n\n";
        do {
            opcionMenu = objClasePrincipal.leerNumeroEntero(menu);

            switch (opcionMenu) {
                case 1:
                    objClasePrincipal.LlenarNotas();
                    break;
                case 2:
                    objClasePrincipal.MostarNotas(VetorMateriaExamen);
                    break;
                case 3:
                    objClasePrincipal.CalcularNotaDefinitiva();
                    break;
                case 4:
                    objClasePrincipal.mensajes(resultadoAprobados);
                    break;
                case 5:
                    objClasePrincipal.mensajes(resultadoReprobados);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    objClasePrincipal.mensajes("Error de Ingreso");
                    break;
            }

        } while (opcionMenu != 0);

    }

    public void LlenarNotas() {

        for (int cantEstiantes = 0; cantEstiantes < vectorEstudiantes.length; cantEstiantes++) {
            vectorEstudiantes[cantEstiantes] = leerString("INGRESE NOMBRE DEL ALUMNO A EVALUAR # " + (cantEstiantes + 1));
            nombre = vectorEstudiantes[cantEstiantes];
            for (int cantExamenes = 0; cantExamenes < numeroExamenes; cantExamenes++) {
                for (int cantMaterias = 0; cantMaterias < numeroMaterias; cantMaterias++) {

                    do {
                        notaValidacion = leerNumeroDouble("Ingresar nota para: \n"
                                + "   Estudiante " + nombre + "\n"
                                + "   Examen  " + (cantExamenes + 1) + "\n"
                                + "   Materia " + (cantMaterias + 1) + "\n\n");

                        //REALIZAMOS LA VALIDACION DE LA NOTA DENTRO DE LOS PARAMETROS ESTABLECIDOS O.O Y 10.0
                        if (notaValidacion < 0.0 || notaValidacion > 10.0) {
                            mensajes("INGRESE UNA NOTA VALIDA DE 0.0 A 10.0");
                        } else {
                            VetorMateriaExamen[cantEstiantes][cantMaterias][cantExamenes] = notaValidacion;
                        }
                    } while (notaValidacion < 0.0 || notaValidacion > 10.0);

                }
            }
        }
    }

    public void MostarNotas(double[][][] notaEstudiante) {

        int estudiante, materia, examen;
        double nota;

        estudiante = leerNumeroEntero("INGRESE ID DE ESTUDIANTE : ");
        materia = leerNumeroEntero("POSICION ID MATERIA : ");
        examen = leerNumeroEntero("POSICION # DEL EXAMEN : ");

        nota = notaEstudiante[estudiante - 1][materia - 1][examen - 1];

        if (nota > 0.0 && nota <= 10.0) {
            mensajes(" la Nota correspondiente para el estidiante : " + estudiante + "\n"
                    + " en la Materia : " + materia + "\n"
                    + " del examen # : " + examen + "\n "
                    + " NOTA : " + nota);
        } else if (nota == 0.0) {
            mensajes("No Hay Notas Relacionadas para este estudiante");
        }

    }

    public void CalcularNotaDefinitiva() {
        for (int cantEstudiantes = 0; cantEstudiantes < vectorEstudiantes.length; cantEstudiantes++) {
            for (int cantExamenes = 0; cantExamenes < numeroExamenes; cantExamenes++) {
                for (int cantMaterias = 0; cantMaterias < numeroMaterias; cantMaterias++) {
                    notaDefinitiva = VetorMateriaExamen[cantEstudiantes][cantMaterias][cantExamenes];
                }
                notaDefinida += CalculoNota(cantExamenes, notaDefinitiva);
            }
            calificacionFinal = ValidacionNota(notaDefinida);

            if (nombreEstudiante == null) {
                mensajes("INGRESE NOMBRE PARA UN ESTUDIANTE");
            } else {
                nombreEstudiante = vectorEstudiantes[cantEstudiantes];
                resultado += " ESTUDIANTE : " + nombreEstudiante + "\n"
                        + " NOTA DEFINITIVA : " + notaDefinida + "\n"
                        + " CALIFICACION : " + calificacionFinal + "\n"
                        + "------------------------------------------ \n";

                if (notaDefinida <= 7.5) {
                    resultadoReprobados += " ESTUDIANTE : " + nombreEstudiante + "\n"
                            + " NOTA DEFINITIVA : " + notaDefinida + "\n"
                            + " CALIFICACION : " + calificacionFinal + "\n"
                            + "------------------------------------------";
                } else {
                    resultadoAprobados += " ESTUDIANTE : " + nombreEstudiante + "\n"
                            + " NOTA DEFINITIVA : " + notaDefinida + "\n"
                            + " CALIFICACION : " + calificacionFinal + "\n"
                            + "------------------------------------------";
                }
            }

        }
        mensajes(resultado);
    }

    public String leerString(String mensaje) {
        cadena = JOptionPane.showInputDialog(mensaje);
        return cadena;
    }

    public double CalculoNota(int ExamenNumero, double notaFinal) {
        if (ExamenNumero == 0) {
            notafinal = notaFinal * 0.33;
        } else if (ExamenNumero == 1) {
            notafinal = notafinal + (notaFinal * 0.22);
        } else {
            notafinal = notafinal + (notaFinal * 0.45);
        }
        return notafinal;
    }

    public String ValidacionNota(double notaDefinitiva) {
        String calificacion = "";

        if (notaDefinitiva <= 7.5) {
            calificacion = "REAPROBADO";
        } else {
            calificacion = "APROBADO";

        }
        return calificacion;
    }

    public int leerNumeroEntero(String mensaje) {
        numeroIntero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numeroIntero;
    }

    public double leerNumeroDouble(String mensaje) {
        numeroDouble = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return numeroDouble;
    }

    public void mensajes(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
