package Utilidades;
// *
// * @author Christian Rodriguez
// */
//public class Programa1_Diseño {
//
//    public static void main(String[] args) {
//
//        Programa1_Diseño diseño = new Programa1_Diseño();
//        Mensajes mensajes = new Mensajes();
//
//        int opcion;
//
//        do {
//            opcion = diseño.menu();
//            switch (opcion) {
//
//                case 1:
//
//                    int opcion1;
//
//                    do {
//                        opcion1 = diseño.menuEstudiantes();
//                        switch (opcion1) {
//
//                            case 1:
//
//                                break;
//
//                            case 2:
//
//                                break;
//
//                            case 3:
//
//                                break;
//
//                            case 0:
//                                System.exit(0);
//                                break;
//                            default:
//                                mensajes.mostrarError("¡La opción no existe!");
//                        }
//                    } while (opcion1 != 0);
//
//                    break;
//
//                case 2:
//
//                    int opcion2;
//
//                    do {
//                        opcion2 = diseño.menuProfesores();
//                        switch (opcion2) {
//
//                            case 1:
//
//                                break;
//
//                            case 2:
//
//                                break;
//
//                            case 3:
//
//                                break;
//
//                            case 0:
//                                System.exit(0);
//                                break;
//                            default:
//                                mensajes.mostrarError("¡La opción no existe!");
//                        }
//                    } while (opcion2 != 0);
//
//                    break;
//
//                case 3:
//
//                    int opcion3;
//
//                    do {
//                        opcion3 = diseño.menuCursos();
//                        switch (opcion3) {
//
//                            case 1:
//
//                                break;
//
//                            case 2:
//
//                                break;
//
//                            case 3:
//
//                                break;
//
//                            case 0:
//                                System.exit(0);
//                                break;
//                            default:
//                                mensajes.mostrarError("¡La opción no existe!");
//                        }
//                    } while (opcion3 != 0);
//
//                    break;
//
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    mensajes.mostrarError("¡La opción no existe!");
//            }
//        } while (opcion != 0);
//
//    }
//
//    public int menu() {
//        Mensajes entrada = new Mensajes();
//
//        String cadena = "M  E  N  U \n"
//                + "1) Estudiantes \n"
//                + "2) Profesores \n"
//                + "3) Cursos \n"
//                + "0) Salir. ";
//
//        return entrada.leerInt(cadena);
//    }
//
//    public int menuEstudiantes() {
//        Mensajes entrada = new Mensajes();
//
//        String cadena = "M  E  N  U \n"
//                + "1) Matricular Estudiante \n"
//                + "2) Seleccionar Cursos \n"
//                + "3) Obtener Calificacion \n"
//                + "0) Salir. ";
//
//        return entrada.leerInt(cadena);
//    }
//
//    public int menuProfesores() {
//        Mensajes entrada = new Mensajes();
//
//        String cadena = "M  E  N  U \n"
//                + "1) Asignar Cantidad de Cursos \n"
//                + "2) Asignar Horario por Curso \n"
//                + "3) Registro de Notas a Estudiante \n"
//                + "0) Salir. ";
//
//        return entrada.leerInt(cadena);
//    }
//
//    public int menuCursos() {
//        Mensajes entrada = new Mensajes();
//
//        String cadena = "M  E  N  U \n"
//                + "1) Estudiantes \n"
//                + "2) Profesores \n"
//                + "3) Cursos \n"
//                + "0) Salir. ";
//
//        return entrada.leerInt(cadena);
//    }
//
//}
