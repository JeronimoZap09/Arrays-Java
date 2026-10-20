public class Actividad {
    public static void main(String[] args) {

        //// contruir 5 arreglos de una dimension 5 de 2 dimensiones y 3 de tres dimensiones y llenar datos con datos reales
        //// 3 DIMENSIONES NOMBRE Y EDADES
        //// 2 dimensiones materias vistas
        //// 1 dimension numeros de fichas


        //ARREGLOS DE UNA DIMENSION

        double [] FichasSena = new double[5];

        FichasSena[0] = 3412760;
        FichasSena[1] = 3687554;
        FichasSena[2] = 3155669;
        FichasSena[3] = 3245789;
        FichasSena[4] = 2668745;

        System.out.println(FichasSena[0]);


        String [] Frutas = new String[5];

        Frutas[0] = "Manzana";
        Frutas[1] = "Mango";
        Frutas[2] = "Guayaba";
        Frutas[3] = "Pera";
        Frutas[4] = "Sandia";

        System.out.println(Frutas[1]);


        String [] Colores = new String[5];

        Colores[0] = "Azul";
        Colores[1] = "Gris";
        Colores[2] = "Negro";
        Colores[3] = "Rojo";
        Colores[4] = "Blanco";

        System.out.println(Colores[2]);


        double [] numerosPrimos = new double[5];

        numerosPrimos[0] = 2;
        numerosPrimos[1] = 3;
        numerosPrimos[2] = 5;
        numerosPrimos[3] = 7;
        numerosPrimos[4] = 11;

        System.out.println(numerosPrimos[3]);


        String [] animalesGranja = new String[5];

        animalesGranja[0] = "Cerdo";
        animalesGranja[1] = "Gallina";
        animalesGranja[2] = "Oveja";
        animalesGranja[3] = "Cabra";
        animalesGranja[4] = "Vaca";

        System.out.println(animalesGranja[4]);


        //ARREGLOS DE DOS DIMENSIONES

        String [][] materiasVistas = new String[1][2];

        materiasVistas[0][0] = "Bases de Datos";
        materiasVistas[0][1] = "Python";
        materiasVistas[0][2] = "Ingles";
        materiasVistas[1][0] = "C#";
        materiasVistas[1][1] = "Php y Laravel";
        materiasVistas[1][2] = "Java";

        System.out.println(materiasVistas[1][2]);


        char [][] MayusMinus = new char[1][2];

        MayusMinus[0][0] = 'a';
        MayusMinus[0][1] = 'b';
        MayusMinus[0][2] = 'c';
        MayusMinus[1][0] = 'D';
        MayusMinus[1][1] = 'E';
        MayusMinus[1][2] = 'F';

        System.out.println(MayusMinus[1][0]);


        String [][] balonOro = new String[1][2];

        balonOro[0][0] = "Vinicius";
        balonOro[0][1] = "Lamine";
        balonOro[0][2] = "Neymar";
        balonOro[1][0] = "Messi";
        balonOro[1][1] = "Cristiano";
        balonOro[1][2] = "Platini";

        System.out.println(balonOro[0][2]);


        int [][] ParImpar = new int[1][2];

        ParImpar[0][0] = 1;
        ParImpar[0][1] = 3;
        ParImpar[0][2] = 5;
        ParImpar[1][0] = 2;
        ParImpar[1][1] = 4;
        ParImpar[1][2] = 6;

        System.out.println(ParImpar[0][0]);


        String [][] SeriePelicula = new String[1][2];

        SeriePelicula[0][0] = "Game of Thrones";
        SeriePelicula[0][1] = "Stranger Things";
        SeriePelicula[0][2] = "Demon Slayer";
        SeriePelicula[1][0] = "Avengers";
        SeriePelicula[1][1] = "La Odisea";
        SeriePelicula[1][2] = "Rapidos y Furiosos";

        System.out.println(SeriePelicula[1][1]);


        //ARREGLOS DE TRES DIMENSIONES

        String [][][] Aprendices = new String[1][1][0];

        Aprendices[0][0][0] = "Esteban Velasquez - 18 años";
        Aprendices[0][1][0] = "Jerónimo Zapata - 18 años";
        Aprendices[1][0][0] = "Andres Taborda - 17 años";
        Aprendices[1][1][0] = "Miguel Parada - 19 años";

        System.out.println(Aprendices[0][1][0]);


        double [][][] Decimales = new double[1][1][0];

        Decimales[0][0][0] = 3.5;
        Decimales[0][1][0] = 6.48;
        Decimales[1][0][0] = 1.697;
        Decimales[1][1][0] = 4.2555;

        System.out.println(Decimales[0][1][0]);


        int [][][] UndDecCenMil = new int[1][1][0];

        UndDecCenMil[0][0][0] = 5;
        UndDecCenMil[0][1][0] = 16;
        UndDecCenMil[1][0][0] = 954;
        UndDecCenMil[1][1][0] = 4763;

        System.out.println(UndDecCenMil[1][1][0]);
    }
}