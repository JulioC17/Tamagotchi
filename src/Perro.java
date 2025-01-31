public class Perro {
    //atributos
     String nombre;
     int edad;
     int nivel_energia;
     int nivel_hambre;
     String estado_animo;

     public static int cantidad = 0;

    //constructor
    public Perro(String nombre, int edad, int nivel_energia, int nivel_hambre, String estado_animo){
        this.nombre = nombre;
        this.edad = 0;
        this.nivel_energia = 100;
        this.nivel_hambre = 0;
        this.estado_animo = "Feliz";
    }

    public void mostrar_estado (){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Nivel de energia: " + this.nivel_energia);
        System.out.println("Nivel de hambre: " + this.nivel_hambre);
        System.out.println("Estado de animo: " + this.estado_animo);
    }
}
