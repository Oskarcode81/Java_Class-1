public class App {

    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String res = "Hola";
        int resultado = 15 + 32;
        int resultado3 = 125 - 32;
        double resultado2 =25 / 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;
        //operadores unarios
        resultado++; // resultado = resultado + 1
        resultado--; // resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        //operradores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 12 < 5 && 4 > 1;
        respuesta = 14 < 25|| 1 > 5;
        //operadores bit a bit
        // &
        // 
        // |
        // Estructura de control
        if (respuesta) {
            //bloque de codigo
        }
        if (respuesta) {
            //bloque de codigo
        } else {
            
        }


    }
}
