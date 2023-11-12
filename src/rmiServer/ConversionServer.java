package rmiServer;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;
public class ConversionServer {
	//dans ce classe on va faire l'exportation des objects distant
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099); // creation d'un annuaire qui va sauvegarder les objets et leurs ref
			ConversionImpl od= new ConversionImpl(); // od c l'objet distant qu'ont va l'envoyer 
			// c comme si on a creer un skeleton car on fait une instanciation de classe qui herite de la classe UnicastRemoteObject
			// od houwa li besh ihadhar il stub wyaatih lil client 
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/ObjectDistant", od); //rmi c le standard 
			//la publication de la reference de l'objet distant dans l'annuaire , Naming c un classe
			// localhost c l@ IP 1099 c le port et ObjectDistant c la ref
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
