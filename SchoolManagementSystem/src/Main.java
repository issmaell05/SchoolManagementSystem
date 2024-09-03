public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "lesebs", "del monte", "05-05-2003", "graduado");
        Estudiante estudiante2 = new Estudiante(2, "mariana", "romero", "23-02-1983", "inactivo");

        Curso curso1 = new Curso(1, "Matemáticas", "Integrales", 34, "versión 3");
        Curso curso2 = new Curso(2, "Artes", "Libre creatividad", 26, "versión 2");

        GestorAcademico gestoracademico = new GestorAcademico();

        gestoracademico.matricularEstudiante(estudiante1);
        System.out.println();

        gestoracademico.agregarCurso(curso1);
        System.out.println();

        gestoracademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
        gestoracademico.inscribirEstudianteCurso(estudiante2, curso2.getId());
        gestoracademico.inscribirEstudianteCurso(estudiante2, curso2.getId());

        System.out.println();
        gestoracademico.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        gestoracademico.desinscribirEstudianteCurso(estudiante2.getId(), curso1.getId());

    }
}