package AppuntiJava;

//importare classe Random
import java.util.Random;
//importare classe Scanner
import java.util.Scanner;


class AppuntiAlfieri {

	public static void main(String[] args) {
		/*
		 * APPUNTI JAVA ALFIERI STEFANO
		 * 
		 */
		
		//*VARIABILI E DATI*
		
		//dichiarare una variabile e successivamente inizializzarla (attribuirgli un valore).
		//non è obbligatorio inizializzarla istantaneamente ma si può fare anche quando vi è la necessità di utilizzarla
		int a = 0; //dichiarazione e inizializzazione di una variabile di tipo "INTEGER" ossia un numero intero
		long b = 0; //dichiarazione e inizializzazione di una variabile di tipo "LONG" ossia un numero intero con dimensione massima maggiore dell'integer
		float c = 10.4f; //dichiarazione e inizializzazione di una variabile di tipo "FLOAT" ossia un numero decimale con dimensione massima minore di un double, si riconosce dalla "f" che si mette dopo
		double d = 10.5; //dichiarazione e inizializzazione di una variabile di tipo "DOUBLE" ossia un numero decimale
		boolean e = true; //dichiarazione e inizializzazione di una variabile di tipo "BOOLEAN" ossia un dato che può essere solo "true" o "false"
		String f ="ciao"; //dichiarazione e inizializzazione di una variabile di tipo "STRING" ossia una stringa di testo, si racchiude tra due virgolette
		
		//N.B. le variabili possono essere dichiarate in successione se sono dello stesso tipo in questa maniera: int a, b, c;
		//N.B. i primi sono tipi di dato primitivo, ossia predefiniti del linguaggio, la variabile String invece è tecnicamente un oggetto costruito infatti inizia con una lettera maiuscola come tutti gli oggetti e le classi
		
		//final int COSTANTE_1 = 5; //le costanti sonno dei contenitori di dati che non cambiano, si usa la keyword final per indicare che non cambia e per convenzione il nome si scrive tutto in masiuscolo usando gli underscore tra una parola e l'altra

		
		//*FINE VARIABILI E DATI*
		
		//*OPERATORI LOGICI
		
		//gli operatori logici sono dei mezzi a disposizione del programmatore pper poter indicare che delle condizioni debbanop verificarsi o contemoporanemante oppure individualmente o addirittura nessuna delle condizioni debba verificarsi
		//&& and ossia porre più di una condizione logica
		//|| or osia porre che almeno una condizione si verifichi
		//! not ossia porre che nessuna condizione si verifichi
		
		//*FINE OPERATORI LOGICI*
		
		
		
		//*OGGETTI*
		
		//DICHIARAZIONI DI OGGETTI
		//un oggetto è un tipo di dato non primitivo, ossia un dato composto da più tipi di dato e istruzioni
		//quando si dichiara un oggetto si dichiara il tipo, il nome, si utilizza la kayword "new" che indica che lo stiamo inizializzando e creando
		//per esempio adesso dichiareremo gli oggetti Random e Scanner
		Random r = new Random();
		// l'oggetto "r" di classe Random ci permette di poter generare dei numeri casuali (anche se in realtà seguono un algoritmo preciso)
		Scanner sc = new Scanner(System.in);
		//l'oggetto "sc" di classe Scanner ci per mette di far inserire all'utente da tastiera dei comandi, è utile per chiedere all'utente di inizializzare delle variabili
		//ogni oggetto può contenere dei metodi ossia sono delle azioni e interazioni che possono fare. Per gli oggetti precostruiti da java vi sono dei metodi già fatti mentre per gli oggetti creati dal proprietario del progetto si possono creare dei metodi personalizzati.
		
		
		// UTILIZZO DEGLI OGGETTI
		// Esempio: fai in modo che venga inserita una stringa da tastiera e che poi venga stampata a schermo in maiuscolo, stampa un numero random da 0 a 10
		System.out.print("Stampa di un numero casuale da 0 a 10: ");//utilizziamo il comando System.out.print() per stampare a schermo senza andare a capo successivametne
		int aEs1 = r.nextInt(11); // abbiamo dichiarato la variabile aEs1 e tramite l'ogggetto "r" abbiamo utlizzato il suo metodo nextInt per far si che venga generato un numero random e successivente abbiamo inserito i limite massimo di numeri da prendere in considerazione, essendo che parte da 0 per ottere dei numeri che vanno da 0 a 10 occorrerà mettere 11 come parametro
		System.out.println(aEs1);//utilizziamo il comando System.out.println() per stampare a schermo andando a capo successivametne, in questo modo chiediamo di stampare la nostra variabile
		System.out.println("inserire un breve testo:");
		String bEs1=sc.nextLine(); // abbiamo dichiarato la variabile bEs1 e tramite l'ogggetto "sc" abbiamo utlizzato il suo metodo nextLine per far si che venga richiesto all'utente di inserire una stringa di testo
		System.out.println(bEs1.toUpperCase());//stampiamo a schermo la variabile inserita e tramite il metodo toUpperCase sappiamo che verrà restituita in maiuscolo
		//N.B. i metodi "next" di scanner sono costruiti i maniera tale che se viene richiesto un dato diverso da una stringa, non va avanti con l'eventuale inserimento di un altro dato, quindi per risolvere eseguiamo un sc.nextLine(); subito dopo 
		//N.B. i metodi sono conosciuti anche come funzioni, nella programmazione ad oggetti si preferisce usare questa nomenclatura
		
		//*FINE OGGETTI*
		
		
		//*CONDIZIONI*
		
		//In java come in tutti gli altri linguaggi, abbiamo le condizioni ossia una parte di algoritmi che ci permette di far si che qualcosa accada se una determinata condizione si avvera.
		//Le condizioni sono : IF-ELSE IF-ELSE
		//letteralmente significano "se", "altrimenti se", "altrimenti" e si utilizzano in questa maniera:
		/*
		 * if (condizione){
		 * 		istruzioni
		 * }else if (condizione){
		 * 		istruzioni
		 * }else{
		 * 		istruzioni
		 * }
		 * 
		 * come puoi notare l'utilizzo all'interno di un algoritmo è analogo alla loro traduzione
		 * 
		 * N.B. a seguito di un if non sono necessari un else if o un else
		 */
		//ES sulle condizioni: genera un numero casuale da 0 a 100, se il risultato è maggiore di 50 stampa a schermo "ciao" altrimenti se minore di 50 stampa a schemo "addio", altrimenti se è uguale a 50 stampa "arrivederci".		
		
		int aEs2 = r.nextInt(101);
		System.out.print("generiamo un numero casuale: il numero è "+aEs2);//utilizzando il  più possiamo concatenare le cose da stampare, quindi in questa maniera stiamo concatenando un messaggio di testo ad una variabile, possiamo concatenare anche altri messaggi di testo utilizzando altri + e "". TIENI CONTO DEGLI SPAZI CHE DOVRAI STAMPARE COME FOSSERO UN MESSAGGIO, QUINDI TRA ""
		if (aEs2>50) {
			System.out.println(" ciao");
		}else if(aEs2<50) {
			System.out.println(" addio");
		}else {
			System.out.println(" salve");
		}
		
		
		//*FINE CONDIZIONI*
		
		
		//*CICLI*
		//I cicli o iterazioni sono delle parti di algoritmo che permettono di ripetere qualcosa finchè una determinata condizione non venga soddisfatta
		
		//SPIEGAZIONE CICLI WHILE, DO-WHILE, FOR
		
		// il while cicla solo se la condizione posta si verifica e si scrive come fosse un if quindi:
		 /* while (condizione){
		 * istruzioni}
		 * il ciclo while continuerà a reiterare finchè la condizione espressa sarà soddisfatta
		 */ 
		
		 // mentre il do while cicla necessarioamente almeno una volta e logicamente funziona così:
		 /* esaegue l'istruzione messa col "do" e torna indietro quando si verifica il while, si scrive:
		 * do {istruzione
		 * }while(condizione per far si che torni indietro);
		 * se la condizione non è soddisfatta, uscirà automaticamente dal ciclo e proseguirà con le istruzioni che verranno date
		 * 
		 */
		
		//ciclo for è un ciclo con contatore ossia ci permette reiterare qualcosa un numero preciso di volte si scrive cosi:
		/*for (dichiarazione variabile contatore; finchè deve svolgere l'iterazione; incremento o decremento del contatore){
		 * cosa deve fare all'interno del ciclo
		 * }
		 */
		
		//esempio ciclo Do-while: Stampa a schermo numeri random da 0 a 10 finchè non viene stampato 10
		int aEs3=0;
		do {
			aEs3= r.nextInt(11);
			System.out.println(aEs3);
		}
		while (aEs3!=10); 
			
		//esempio ciclo while: stampa a schermo numeri a partire da 1 finchè non arrivi a 5
		int aEs4 = 1;
        
        while(aEs4 <= 5) {
            System.out.println(aEs4);
            aEs4++;
        }
        
        //esempio ciclo for: stampa i primi 10 multipli di un numero
        System.out.println("inserisci un numero:");
        int aEs5=sc.nextInt();
        sc.nextLine();
        int bEs5;
        for (int i=1; i<=10 ; i++) {
        	bEs5 =	aEs5*i;
        	System.out.println(bEs5);
        }
        
        //*FINE CICLI*
        
		//*ARRAY*
		//gli array sono dei contenitori di dati, come fossero variabili.
		//bisogna indicare 3 parti quando si dichiara un arra:
		//-1) il tipo
		//-2)il nome
		//-3)la lunghezza
		//ovviamente le posizioni occupate dagli elementi nell'array partono da indice 0, quindi i numeri massimi sono quelli indicati ma le posizioni partono da 0 e arrivano a n-1
		
		//DICHIARAZIONE DI UN ARRAY
		//int [] numeri =new int[10] ; questo è uno dei metodi per dichiarare un array che in questo caso sarà di lunghezza massima 10
		//int [] numeri = {1,2,3,4} ; questo è un altro dei metodi per dichiarare e inizializzaere un array
        
        
        
		//Esempio
		System.out.println("l'array è ");
		int [] arrayEs =new int[10] ;
		for (int i=0; i<= 9; i++) {
			arrayEs[i]=r.nextInt(100);
			System.out.println("il numero che occupa lo spazio "+(i+1)+ " è "+arrayEs[i]);;
		}
		
		//esercizio: Crea una rubrica telefonica permettendo all'utente di inserire i nomi e i numeri di telefono e di ppoterli cercare.
		
		final int DIMENSIONE_RUBRICA = 5;
		String[] nomiRubr = new String [DIMENSIONE_RUBRICA];
		String[] numeriTel = new String [DIMENSIONE_RUBRICA];
		int iRub;
		boolean trovato;
		String rispostaRicerca, daCercare;
		
		for (iRub=0;iRub<nomiRubr.length;iRub++) {
			System.out.println("inserisci il nome del contatto: ");
			nomiRubr[iRub]=sc.nextLine();
			System.out.println("inserisci il numero di "+ nomiRubr[iRub]+":");
			numeriTel[iRub]=sc.nextLine();
		}
		do {
			System.out.println("quale contatto vuoi cercare?");
			daCercare=sc.nextLine();
			trovato= false;
			for ( iRub = 0; iRub < nomiRubr.length; iRub++) {
				if (nomiRubr[iRub].toLowerCase().indexOf(daCercare)>=0||(nomiRubr[iRub].toLowerCase().indexOf(daCercare)>=0 )){ //il metodo index of() restituisce un valore, questo valore è o 1 o -1 utilizziamo questo metodo in questo caso per fare in modo che se nell' array si trova più di un elemento che è composto da ciò che abbiamo cercato,in questo cadso verrà stampato ogni elemento che contiene la ricerca. per questo lo poniamo >= 0.
					trovato=true;
					System.out.println("nome: " + nomiRubr[iRub] + " numero: " + numeriTel[iRub]);
                }
            }
			if(trovato==false){
				System.out.println("il contatto non è presente in ruburica");			
			}
			System.out.println("effettuare una nuova ricerca?");
			rispostaRicerca=sc.nextLine();
		}while(rispostaRicerca.equalsIgnoreCase("si")||rispostaRicerca.equalsIgnoreCase("sì"));
		System.out.println("grazie, arrivederci");
		
		
		
		//*FINE ARRAY*
		
		
		
	}

}
