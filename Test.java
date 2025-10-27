import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		int nb = 0;
		String nbin = "";
		String parite = new String();
		String positif = new String();
		// Pour que l'utilisateur puisse entrer le nombre directement en ligne de commande, le programme doit pouvoir récupérer la valeur dans les paramètres du main
		// Au démarrage du programme, on vérifie si il y a un argument
		if(args.length > 0){
			nbin = args[0];
		}else{
		// Si ce n'est pas le cas, on demande un nombre à l'utilisateur
			System.out.println("Veuillez entrer un nombre entier : ");
			Scanner scan = new Scanner(System.in);
			nbin = scan.nextLine();
		}
		nb = Integer.parseInt(nbin);
		if(nb > 0){
			positif = "positif";
		}else if(nb < 0) {
			positif = "negatif";
		}else{
			positif = "egal a zero";
		}
		if(nb % 2 == 0){
			parite = "pair";
		}else{
			parite = "impair";
		}
		System.out.println(nb + " " + positif + " et " + parite);
	}
}

// Si on entre une valeur inattendue, une erreur se produit :
/*" 
Exception in thread "main" java.lang.NumberFormatException: For input string: "f"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:565)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at Test.main(Test.java:19)
"
Dans ce cas-ci, le programme attend un numérique mais on a entré une lettre. Pour régler ce problème, il faudrait utiliser un try...catch et redemander le nombre jusqu'à ce qu'une valeur correcte soit entrée. Si on ne peut pas utiliser un try catch, on peut faire en sorte que le programme teste si le String est numérique. Si oui, on continue le programme, sinon, on redemande d'entrer un nombre.
*/
