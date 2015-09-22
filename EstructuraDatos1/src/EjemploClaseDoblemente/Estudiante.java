package EjemploClaseDoblemente;

/**
 * Esta clase contiene la definición de los datos de los estudiantes
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 18Sep2015
 */ 
public class Estudiante {
   final String noAsignada = "noAsignada";
   final double notaNoAsignada = -100.0;
    
   /*
      codigoEst   Código del estudiante
      idEst       Número de documento de identidad estudiante
      nombreEst   Nombre del estudiante
      asignatura  Asignaturas del estudiante
      nota        Nota de cada asignatura
   */
   private int codigoEst, idEst;
   private String nombreEst;
   private byte semestre;
   private String[] asignatura;
   private double[] nota;

   // Constructor de la clase
   public Estudiante (int codigoEst,int idEst,String nombreEst,byte semestre,int numeroAsignatura) {
      this.codigoEst = codigoEst;
      this.idEst = idEst;
      this.nombreEst = nombreEst;
      this.semestre = semestre;  
      this.asignatura = new String[numeroAsignatura];
      this.nota = new double[numeroAsignatura];      
      iniciarAsignatura();
      iniciarNota();
   }

   // Setter y Getter de Código Estudiante
   public int getCodigoEst() {
      return codigoEst;
   }

   public void setCodigoEst(int codigoEst) {
      this.codigoEst = codigoEst;
   }

   // Setter y Getter de Número de documento de identidad estudiante
   public int getIdEst() {
      return idEst;
   }

   public void setIdEst(int idEst) {
      this.idEst = idEst;
   }
   
   // Setter y Getter de nombre del estudiante
   public String getNombreEst() {
      return nombreEst;
   }

   public void setNombreEst(String nombreEst) {
      this.nombreEst = nombreEst;
   }

   // Setter y Getter de semestre
   public byte getSemestre() {
      return semestre;
   }

   public void setSemestre(byte semestre) {
      this.semestre = semestre;
   }

   // Setter y Getter de Asignatura
   public String[] getAsignatura() {
      return asignatura;
   }

   public void setAsignatura(String[] asignatura) {
      this.asignatura = asignatura;
   }

   // Setter y Getter de nota de la asignatura
   public double[] getNota() {
      return nota;
   }

   public void setNota(double[] nota) {
      this.nota = nota;
   }

   // Inicio de arreglo de asignatura    
   private void iniciarAsignatura() {
      for (int contadorAsignatura=0;contadorAsignatura<asignatura.length;contadorAsignatura++) {
         asignatura[contadorAsignatura] = noAsignada;
      }
   }
   
   // Inicio de arreglo de notas 
   private void iniciarNota() {
      for (int contadorNota=0;contadorNota<nota.length;contadorNota++) {
         nota[contadorNota] = notaNoAsignada;
      }
   }
    
   @Override
   public String toString() {
      return "Estudiante{\n" +
             "             codigoEst = " + codigoEst + "\n" +
             "             idEst = " + idEst + "\n" +
             "             nombreEst = " + nombreEst + "\n" +
             "             semestre = " + semestre + "\n" +
             "             materias = " + nota.toString() + "\n" +
              "            materias = " + nota.length + "\n" +
             "}";
   }
}
