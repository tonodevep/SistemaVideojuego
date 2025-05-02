package Simulacion;
import Interfaces.*;
import Personajes.*;
import Personajes.base.*;
import java.util.Scanner;
import java.util.Random;

public class SimuladorBatalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Crear los personajes
        Metalero metalero = new Metalero("Metalero", 10, 100, 80, 50, "Gibson");
        Antonia antonia = new Antonia("Antonia", 8, 80, 50, 7, "del Sagrado Corazón");
        Policia policia = new Policia("Leon", 9, 80, 9, 3);
        Mutante mutante = new Mutante("Perro Sanxe", 10, 200, 15);
        
        System.out.println("¡COMIENZA LA BATALLA!");
        System.out.println("Los héroes: " + metalero.getNombre() + ", " + antonia.getNombre() + " y " + policia.getNombre());
        System.out.println("vs");
        System.out.println("El terrible " + mutante.getNombre() + "\n");
        
        // Batalla
        while (true) {
            // Turno de los héroes
            System.out.println("\n--- TURNO DE LOS HÉROES ---");
            
            // Turno de Metalero
            if (metalero.getSalud() > 0) {
                System.out.println("\nAcciones para " + metalero.getNombre() + " (Salud: " + metalero.getSalud() + "):" + " (Mana: " + metalero.getMana() + "):");
                System.out.println("1. Atacar con su guitarra");
                System.out.println("2. Defender");
                System.out.println("3. Tocar guitarra");
                System.out.print("Elige una acción: ");
                int accionMetalero = scanner.nextInt();
                
                switch (accionMetalero) {
                    case 1:
                        System.out.println(metalero.getNombre() + ": Nos vemos en el Infierno!");
                        metalero.atacar();
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (15 - 20) + metalero.getFuerza()));
                        break;
                    case 2:
                         System.out.println(metalero.getNombre() + ": Tu ataque no es tan poderoso como un riff de Slayer! No puedes vencer el poder del thrash!");
                        ((Defendible)metalero).defender(); // Uso explícito de la interfaz
                        break;
                    case 3:
                        System.out.println(metalero.getNombre() + ": Escucha como suena mi GUITARRA!!!");
                        metalero.lanzarHechizo();
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (13 - 25) + metalero.getFuerza()));
                        break;
                    default:
                        System.out.println(metalero.getNombre() + " parece estar empanao!, por lo que pierde su turno");
                }
            }
            
            // Turno de Antonia
            if (antonia.getSalud() > 0) {
                System.out.println("\nAcciones para " + antonia.getNombre() + " (Salud: " + antonia.getSalud() + ", Maná: " + antonia.getMana() + "):");
                System.out.println("1. Ataque mágico");
                System.out.println("2. Lanzar hechizo");
                System.out.println("3. Curar (usando Curable)");
                System.out.println("4. Rezar (recupera maná)");
                System.out.print("Elige una acción: ");
                int accionAntonia = scanner.nextInt();
                
                switch (accionAntonia) {
                    case 1:
                        System.out.println(antonia.getNombre() + ": Nos vemos mañana si Dios quiere!");
                        antonia.atacar();
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (7 - 14) + antonia.getFuerza()));
                        break;
                    case 2:
                        System.out.println(antonia.getNombre() + ": Un Resplandor y hace... PAUM. Ya está aquí la Guerra");
                        ((Magico)antonia).lanzarHechizo(); // Uso explícito de la interfaz
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (10 - 17) + antonia.getFuerza()));
                        break;
                    case 3:
                        System.out.println("\nA quien deseas curar?");
                        System.out.println("1. " + metalero.getNombre());
                        System.out.println("2. " + policia.getNombre());
                        System.out.print("3. " + antonia.getNombre() + " se cura a sí misma");
                        accionAntonia = scanner.nextInt();
                        System.out.println(antonia.getNombre() + ": Que la Virgen te cubra con su manto y te sane, hijo mío");
                        ((Curable)antonia).curar(); // Uso explícito de la interfaz
                        switch (accionAntonia) {
                            case 1:
                                metalero.setSalud(metalero.getSalud() + 20);
                                System.out.println(antonia.getNombre() + " cura a " + metalero.getNombre());
                                break;
                            case 2:
                                policia.setSalud(policia.getSalud() + 20);
                                System.out.println(antonia.getNombre() + " cura a " + policia.getNombre());
                                break;
                            case 3:
                                antonia.setSalud(antonia.getSalud() + 20);
                                System.out.println(antonia.getNombre() + " se cura a sí misma");
                                break;
                            default:
                                System.out.println("Acción inválida, " + antonia.getNombre() + " falla la cura");
                        }
                        break;
                    case 4:
                        System.out.println(antonia.getNombre() + ": Es hora de rezar el Rosario: Primer Misterio: La Pasión de Nuestro Señor...");
                        antonia.rezar();
                        break;
                    default:
                        System.out.println(antonia.getNombre() + " se toma un ibuprofeno, por lo que pierde su turno");
                }
            }
            
            // Turno del policía
            if (policia.getSalud() > 0) {
                System.out.println("\nAcciones para " + policia.getNombre() + " (Salud: " + policia.getSalud() + "):");
                System.out.println("1. Atacar con cuchillo");
                System.out.println("2. Disparar (usando Pistolero)");
                System.out.print("Elige una acción: ");
                int accionPolicia = scanner.nextInt();
                
                switch (accionPolicia) {
                    case 1:
                        System.out.println(policia.getNombre() + ": Es hora de acabar con esto... No dejaré que nadie más sufra.");
                        policia.atacar();
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (8 - 12) + policia.getFuerza()));
                        break;
                    case 2:
                        System.out.println(policia.getNombre() + ": No me lo piensaré dos veces... TRAGA PLOMO!");
                        ((Pistolero)policia).disparar(); // Uso explícito de la interfaz
                        mutante.setSalud(mutante.getSalud() - ((int)Math.random() * (20 - 23) + policia.getFuerza()));
                        break;
                    default:
                        System.out.println(policia.getNombre() + " está ocupado llorando, por lo que pierde su turno");
                }
            }
            
            // Comprobar si el mutante ha sido derrotado
            if (mutante.getSalud() <= 0) {
                System.out.println("\nLOS HÉROES HAN DERROTADO AL MUTANTE " + mutante.getNombre() + "!");
                break;
            }
            
            // Turno del mutante
            System.out.println("\n--- TURNO DEL MUTANTE ---");
            int accionMutante = random.nextInt(3) + 1; // 1-3
            
            // Elegir objetivo aleatorio entre los héroes vivos
            Personaje[] heroesVivos = getHeroesVivos(metalero, antonia, policia);
            if (heroesVivos.length == 0) {
                System.out.println("EL MUTANTE " + mutante.getNombre() + " HA MATADO A TODOS LOS HÉROES!");
                break;
            }
            
            Personaje objetivo = heroesVivos[random.nextInt(heroesVivos.length)];
            
            switch (accionMutante) {
                case 1:
                    System.out.println(mutante.getNombre() + ": UHGHGHHGHH!");
                    mutante.atacar();
                    objetivo.setSalud(objetivo.getSalud() - ((int)Math.random() * (10 - 14) + mutante.getFuerza()));
                    System.out.println(mutante.getNombre() + " ha atacado a " + objetivo.getNombre());
                    break;
                case 2:
                    System.out.println(mutante.getNombre() + ": RAAAAAFFF!!!");
                    ((Ladrador)mutante).alarido(); // Uso explícito de la interfaz
                    for (Personaje heroe : heroesVivos) {
                        heroe.setSalud(heroe.getSalud() - ((int)Math.random() * (2 - 5) + mutante.getFuerza()));
                    }
                    System.out.println(mutante.getNombre() + " usa ataque de área contra todos los héroes!");
                    break;
                case 3:
                    System.out.println(mutante.getNombre() + ": ARFFFF!");
                    ((Mordedor)mutante).morder(); // Uso explícito de la interfaz
                    objetivo.setSalud(objetivo.getSalud() - ((int)Math.random() * (18 - 22) + mutante.getFuerza()));
                    System.out.println(mutante.getNombre() + " ha mordido a " + objetivo.getNombre());
                    break;
            }
            
            // Comprobar si todos los héroes han muerto
            if (metalero.getSalud() <= 0 && antonia.getSalud() <= 0 && policia.getSalud() <= 0) {
                System.out.println("\nEL MUTANTE HA MATADO A TODOS LOS HÉROES!");
                break;
            }
            
            // Mostrar estado actual
            System.out.println("\n--- ESTADO ACTUAL ---");
            System.out.println("Héroes:");
            if (metalero.getSalud() > 0) System.out.println("- " + metalero.getNombre() + ": Salud " + metalero.getSalud() + ", Maná " + metalero.getMana());
            if (antonia.getSalud() > 0) System.out.println("- " + antonia.getNombre() + ": Salud " + antonia.getSalud() + ", Maná " + antonia.getMana());
            if (policia.getSalud() > 0) System.out.println("- " + policia.getNombre() + ": Salud " + policia.getSalud() + ", balas en el cartucho " + policia.getBalas());
            System.out.println("Mutante: Salud " + mutante.getSalud());
        }
        
        scanner.close(); //Cerrar el escáner al final del programa
    }
    
    // Método corregido para manejar correctamente los tipos
    private static Personaje[] getHeroesVivos(Personaje m, Personaje a, Personaje p) {
        java.util.List<Personaje> vivos = new java.util.ArrayList<>();
        if (m.getSalud() > 0) vivos.add(m);
        if (a.getSalud() > 0) vivos.add(a);
        if (p.getSalud() > 0) vivos.add(p);
        return vivos.toArray(new Personaje[0]);
    }
}
