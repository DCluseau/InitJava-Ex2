import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		int nb = 0;
		String parite = new String();
		String positif = new String();
		// Pour que l'utilisateur puisse entrer le nombre directement en ligne de commande, le programme doit pouvoir récupérer la valeur dans les paramètres du main
		// Au démarrage du programme, on vérifie si il y a un argument
		if(args.length > 0){
			nb = Integer.parseInt(args[0]);
		}else{
		// Si ce n'est pas le cas, on demande un nombre à l'utilisateur
			System.out.println("Veuillez entrer un nombre entier : ");
			Scanner scan = new Scanner(System.in);
			nb = scan.nextInt();
		}
		
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
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:977)
        at java.base/java.util.Scanner.next(Scanner.java:1632)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2297)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2251)
        at Test.main(Test.java:7)
"
Dans ce cas-ci, le programme attend un int mais on a entré un String. Pour régler ce problème, il faudrait utiliser un try...catch et redemander le nombre jusqu'à ce qu'une valeur correcte soit entrée.
*/
