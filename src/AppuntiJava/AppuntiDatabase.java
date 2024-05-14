package AppuntiJava;

public class AppuntiDatabase {

	public static void main(String[] args) {
		
		System.out.println("APPUNTI DATABASE");
		/*
		 * APPUNTI JAVA ALFIERI STEFANO
		 * 
		 */
		/*
		 * I DataBase, sono strutture per immagazzinare dei dati(come fossero dei contenitori di oggetti). 
		 * Sono delle strutture contenenti delle tabelle che contengono i dati inseriti.
		 * Ogni software ne ha bisogno in quanto ogni programma gestisce dei dati e necessita di richiamarli. 
		 * Infatti con gestione dei dati non si intende solo di immagazzinare dati ma anche inserimento e richiamo,
		 * per cui se i dati sono inseriti tramite il codice, saranno statici e non modificabili.
		 * Se inseriti mentre mediante l'utilizzo di un database saranno manipolabili.
		 * Per questo i dati vanno inseriti e gestiti tramite database.
		 * 
		 * 
		 * 
		 * Esempio: 
		 * una macchinetta deve immagazzinare deii prodotti e la disponibilità di essi, i prezzi i codici ecc...
		 * 
		 * Quindi un database serve a gestire un insieme di dati e fare su questi una serie di operazioni (manipolazione dei dati).
		 * 
		 * All'interno di un database vengono salvati i dati ma anche la definizione del dato stesso,
		 * ossia il tipo di dato da gestire e il suo nome.
		 * 
		 * I database non dipendono dal linguaggio di programmazione utilizzato, infatti sono gestiti da un DBMS.
		 * 
		 * DBMS=Database Management System
		 * Il DBMS è il sistema di gestione del database e si occupa interamente della modellazione dei dati.
		 * I database sono infatti inseriti e gestiti tramite un unico software ossia il DBMS, come ad esempio è MySQL.
		 * 
		 * Un DBMS deve avere alcune qualità:
		 * -Deve gestire grandi quantità di dati
		 * -Gestire persistenza e condivisione di dati
		 * -Offrire funzionalità all'utente per le gestione e lo sviluppo delle applicazioni
		 * -Garantire velocità di elaborazione
		 * -Consentire a più utenti di consultare i dati (ad esempio un eCommerce deve poter mostrare i prodotti a più utenti contemporaneamente)
		 * -Assicurare affidabilità dei dati
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		 * MODELLAZIONE CRUD ossia 4 operazioni:
		 * 1)Create-Creazione di un dato(il gestore che crea un nuovo prodotto)
		 * 2)Read-Lettura dei dati(il gestore ha la possibilità di leggere i dati del prodotto)
         * 3)Update-Aggiornamento dei dati(il gestore può modificare dei dati cambiando ad esempio il prezzo, ma anche l'utente può modificare un dato ad esempio acquistandolo)
         * 4)Delete-Cancellazione del dato
		 * 
		 * Un modello di dati consiste nella rappresentazione astratta delle strutture dei dati di un DataBase.
		 * l'atto di creazione di un modello prende il nome di modellazione dei dati(data modelling).
		 * 
		 * MODELLAIZONE DEI DATI
		 * 
		 * esistono due modi:
		 * -il modello entità relazioni(E-R)
		 * -il modello a oggetti
		 * 
		 * 
		 * Modello E-R
		 * 
		 * -Le entità sono gli oggetti principali su cui vengono raccolte informazioni.
		 * Ad esempio potrebbe essere una persona, una macchina o un evento.
		 * Nel caso della macchinetta possono essere le bevande e gli incassi,
		 * nel caso di un autovelox possono essere i trasgressori oppure le multe stesse con le relative sanzioni importi ecc..
		 * 
		 * -Gli attributi descrivono le entità ai quali sono associati.
		 * ad esempio avendo un'entità scontrino, come attributi avremo il numero seriale, la data e l'importo.
		 * Sono classificati come identificatori e descrittori.
		 * -gli Identificatori, sono chiamati anche chiavi e identificano univocamente una istanza di entità
		 * -i Descrittori, descrivono una caratteristica dell'istanza a cui sono associati
		 * 
		 * 
		 * -Le relazioni sono delle associazioni tra entità.
		 * sono quindi collegamenti tra entità, in quanto talvolta hanno la necessita di condividere dati tra di loro.
		 * Le relazioni sono classificate in termini di Grado, Cardinalità, Direzione ed Esistenza.
		 * Ciò avviene tramite le chiavi che possono essere primarie o esterne.
		 * 
		 * 
		 * La chiave primaria è un campo univoco che contiene il codice che identifica in maniera univoca il codice del prodotto,
		 * chiamato anche id.
		 * E' differente dalla chiave esterna,
		 * hanno funzioni opposte ma sono necessarie entrambe per mettere in relazione delle tabelle diverse.
		 * 
		 * 
		 */
		
		/*
		 * creazione di una tabella:
		 * 
		 * Utilizzare "XAMPP", attivare "Apache" e "MySQL".
		 * copiare http://localhost/phpmyadmin/ nell'url.
		 * di qui sarà possibile creare un nuovo DataBase tramite il menu di sinistra.
		 * al momento della creazione dovremo:
		 * -Dargli un nome
		 * -Inserire il numero di attributi che ci serviranno (tendendo conto dell'attributo id)
		 * -inserire ogni attributo dichiarando il tipo di dato che metteremo dentro e se necessario la lunghezza(perlopiù per le stringhe)
		 * -fare attenzione alla creazione della chiave primaria (id) accertandoci di attribuirgli dove sta scritto "indice" il valore "primaria" 
		 * 		e spuntare il flag "auto incremento" per far si che non vi siano altri lementi uguali
		 * 
		 * 
		 * una volta creato e inseriti gli attributi ci sarà possiblie inserire e gestire i nostri dati.
		 * 
		 * 
		 * 
		 * creazione di una chiave esterna:
		 * 
		 * Una volta creata una seconda tabella che vorremo collegare alla prima,
		 * ci accertiamo di inserire come entità, l'id della tabellla che vorremo collegare.
		 * Successivamente selezioniamo l'entità con l'id della tabella da collegare e clickiamo su "indice"
		 * poi clickiamo su "vista relazioni" e selezioniamo la colonna, il DB e la tabella da collegare.
		 * ora si genererà la chhiave esterna e le tabelle saranno collegate.
		 * 
		 * Si consiglia per una struttura corretta di creare prima tutte le tabelle con i vari id e relazioni
		 * e poi inserire gli elementi, altrimenti potrebbe dare errore.
		 * 
		 * Si consiglia di partire dalla tabella principale e di collegare quelle più piccole a quellas
		 * 
		 * 
		 */
		
		/*
		 * *DATABASE RELAZIONALI*
		 * 
		 * Un database relazionale è una struttura dove la modellazione e l'archiviazione
		 * dei dati avviene a partire da una tabella.
		 * La tabella è un matrice bidimensionale che rappresenta un'identità logica.
		 * Ogni tabella è organizzata in una serie di righe e colonne, ogni singola riga viene detta record 
		 * e rappresenta un' identità.
		 * 
		 * Esempio:
		 * immaginiamo una tabella che rappresenti il concetto di persona,
		 * la seconda riga ne rappresenta i dati relativi
		 * la colonna invcece contene i dati relativi alla specifica proprietà ad esempio il nome, l'età ecc.
		 * quindi ogni colonna ha una propria intestazione che fa parte della descrizione della tabella (che si chiama schema).
		 * 
		 * L'incrocio tra una riga e una colonna è definita cella o campo 
		 * ed è cio che conterrà il singolo valore e potrà contenerne solo uno.
		 * 
		 * 
		 * All'atto pratico una tabella la vediamo così:
		 * 
		 * 					PERSONA
		 * |ID | Nome    | Cognome  | Età | Computer	|
		 * |1  |Mario    |  Rossi	|  30 |	asus,Apple	|
		 * |2  |Giuseppe |  Verdi	|  45 |   Apple	 	|
		 * 
		 * Questa è un tabella con 10 celle, in quanto le prime sono di intestaizone.
		 * 
		 * Essendo che una delle persone ha due computer, possiamo collegarli tramite le relazioni.
		 * ossia togliamo dalla tabella la colonna del computer (in quanto ogni cella può contenere un solo valore)
		 * e colleghiamo una seconda tabella tramite una chiave esterna (foreign key).
		 * 
		 * Quindi creiamo una seconda tabella alla quale attribuiamo la chiave primaria della prima tabella come chiave esterna.
		 * 
		 * Ad esempio:
		 * 
		 *  	   COMPUTER
		 * |id persona | computer    |
		 * |	 1	   |	asus	 |
		 * |	 1	   |	apple	 |
		 * |	 2	   |	asus	 |
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
	}

}
