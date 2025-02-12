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

    public void mostrar_estado () {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Nivel de energia: " + this.nivel_energia);
        System.out.println("Nivel de hambre: " + this.nivel_hambre);
        if (this.nivel_energia >= 75) {
            this.estado_animo = "Feliz";
            System.out.println("Estado de animo: " + this.estado_animo);
        } else if (this.nivel_energia < 75 && this.nivel_energia >= 50) {
            this.estado_animo = "Contento";
            System.out.println("Estado de animo: " + this.estado_animo);
        } else if (this.nivel_energia < 50 && this.nivel_energia >= 25) {
            this.estado_animo = "Majomenos";
            System.out.println("Estado de animo: " + this.estado_animo);
        } else if (this.nivel_energia < 25 && this.nivel_energia >= 0) {
            this.estado_animo = "Triste";
            System.out.println("Estado de animo: " + this.estado_animo);
        }

    }
    public void alimentar_perro (){
        if( this.nivel_hambre > 0){
            this.nivel_hambre --;
            System.out.println("Este Perrito ha comido");
        }else{
            System.out.println("Este Perrito no tiene Hambre");
        }
    }

    public void jugar () {
        if(this.nivel_energia > 0 ){
            this.nivel_energia --;
            this.nivel_hambre ++;
            System.out.println("Este Perrito se ha divertido mucho jugando");
        }else{
            System.out.println("Este Perrito no tiene Energia. Deberia dormir un poco");
        }
    }

    public void dormir () {
        if(this.nivel_energia < 100 ){
            this.nivel_energia ++;
            System.out.println("Este Perrito ha dormido sus 13 horitas");
        }else{
            System.out.println("Este Perrito no tiene Sueño. Necesita Jugar");
        }
    }
}
