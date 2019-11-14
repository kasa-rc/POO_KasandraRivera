/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import poo.Persona;
import poo.Escuela;
import poo.Mochila;
import poo.Celular;
import poo.Vestido;
import poo.BotellaTekila;
import poo.Planta;
import poo.Carro;
import poo.Libro;
import poo.Pintura;
import poo.Credencial;
import poo.Pasaporte;
import poo.TicketCompra;
import poo.Zapato;
import poo.Chicle;
import poo.Elemento;
import poo.Basquetbol;
import poo.Cancion;
import poo.Calculadora;
import poo.Casa;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona beto = new Persona("Roberto", 18, 1.87 );
        beto.nombre = "Alberto";
        beto.edad = 17;
        beto.estatura = 1.50;
     
        Escuela pOLI = new Escuela("POLI", 180977576, 108.87 );
        pOLI.nombre = "UPIIZ";
        pOLI.matricula = 17987678;
        pOLI.area = 178.50;
	
	Mochila ross = new Mochila("Everets", 7, 190.87 );
        ross.marca = "Nike";
        ross.compartimentos = 17;
        ross.precio = 980.50;
     
	Celular lG = new Celular("LGStyls", 19, 32.87 );
        lG.marca = "Nokia";
        lG.app= 17;
        lG.memoria = 16.50;

	Vestido lov = new Vestido("loveth", 18, 1.67 );
        lov.marca = "ciryus";
        lov.talla = 15;
        lov.largo = 1.30;

	BotellaTekila agave = new BotellaTekila("Tres Agaves", 1878, 800.87 );
        agave.nombre = "Albatros";
        agave.año = 1734;
        agave.cantidad = 500.8;

	Planta verde = new Planta("Gardenia", "Blanco", "Suave" );
        verde.nombre = "Lilis";
        verde.color = "Morado";
        verde.textura = "Suave";

	Carro estandar = new Carro("GTz", 1867,"Amarillo");
        estandar.modelo = "Alberto";
        estandar.año = 1789;
        estandar.color = "Negro";

	Libro novela = new Libro("Roberto Gracia", 1898, "Grandes desastres" );
        novela.autor = "Alberto Rojas";
        novela.añoEd = 1897;
        novela.titulo = "Salvando el ma�ana";

	Pintura realismo = new Pintura("Tinta china", 1998, "Puente andante" );
        realismo.estilo = "Acuarela";
        realismo.año = 1977;
        realismo.nombre = "invierno en Abril";
  
	Credencial elector = new Credencial("Estefan","QWEWT3477536RET","Frac. Salida Real");
        elector.nombre = "Julia";
        elector.CURP = "TGJL197778SXERTY";
        elector.direccion = "Av. Universidad";

	Pasaporte doc = new Pasaporte("Pol", 19, "Frances" );
        doc.nombre = "Aranda";
        doc.edad = 17;
        doc.nacionalidad = "Argentino";

	TicketCompra ticket = new TicketCompra("comida china", 5, 670.98 );
        ticket.concepto = "Acuarelas";
        ticket.cantidad = 2;
        ticket.precio = 658.99;

	Zapato nike = new Zapato("nike", "Turquesa", 8.5);
        nike.marca = "nike";
        nike.color = "Rojo";
        nike.talla = 5.5;

	Chicle bomba = new Chicle("menta","azul",0.67);
        bomba.sabor = "fresa";
        bomba.color = "rosa";
        bomba.masa = 0.76;

	Elemento tabla = new Elemento("Fosforo", 34, 89.67);
        tabla.nombre = "Nitrogeno";
        tabla.numeroAtomico = 44;
        tabla.masaAtomica = 0.76;

        Basquetbol torneo = new Basquetbol("Lobos", 74, 12);
        torneo.nombreEquipo = "Aguilas";
        torneo.numeroJugador = 4;
        torneo.puntos = 26;
        System.out.println(set.NombreEquipo(String nombreEquipo));
	Cancion cover = new Cancion("se fue", 12, 4.98);
        cover.nombre = "mareas";
        cover.numeroLista = 14;
        cover.duracion = 3.4;

 	Calculadora cientifica = new Calculadora("CASIO", 7, 3.1416);
        cientifica.marca = "CASIO";
        cientifica.numero = 8;
        cientifica.PI = 3.1416;


 	Casa we = new Casa("naranja", 674, 62);
        we.color = "verde";
        we.numero = 34;
        we.area = 26;

	System.out.println(); /*para depurar*/
    }

}
