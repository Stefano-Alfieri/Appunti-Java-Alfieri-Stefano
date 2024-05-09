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
		 * 		e spuntare il flag "incremento" per far si che non vi siano altri lementi uguali
		 * 
		 * una volta creato e inseriti gli attributi ci sarà possiblie inserire e gestire i nostri dati.
		 * 
		 */
		
		
		
		
		
		
		
	}

}
