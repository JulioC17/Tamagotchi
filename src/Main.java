import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int entrada = 0;
        Perro [] mascota = new Perro[5];

        do{
            System.out.println("Crear nuevo perro (1)");
            System.out.println("Alimentar Perro (2)");
            System.out.println("Jugar (3)");
            System.out.println("Dormir (4)");
            System.out.println("Mostrar Estado(5)");
            System.out.println("Salir (6)");

            entrada = opcion.nextInt();
            opcion.nextLine();

            switch (entrada){
                case 1:
                    System.out.println("Ha nacido un nuevo Perro");
                    System.out.println("Como le quieres llamar a tu mascota?");
                    String nuevo_perro = opcion.nextLine();
                    mascota[Perro.cantidad] = new Perro(nuevo_perro, 0, 100, 0, "Feliz");
                    Perro.cantidad++;
                    System.out.println("Perro creado con Exito");
                    break;
                case 2:
                    for(int i = 0; i <= Perro.cantidad-1; i++){
                        mascota[i].mostrar_estado();
                    }
                    break;
            }
        }
        while (entrada != 6);




    }
}