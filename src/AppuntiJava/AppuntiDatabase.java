package AppuntiJava;

public class AppuntiDatabase {

	public static void main(String[] args) {

		System.out.println("APPUNTI DATABASE");
		/*
		 * APPUNTI JAVA ALFIERI STEFANO
		 * 
		 */
		/*
		 * I DataBase, sono strutture per immagazzinare dei dati(come fossero dei
		 * contenitori di oggetti). Sono delle strutture contenenti delle tabelle che
		 * contengono i dati inseriti. Ogni software ne ha bisogno in quanto ogni
		 * programma gestisce dei dati e necessita di richiamarli. Infatti con gestione
		 * dei dati non si intende solo di immagazzinare dati ma anche inserimento e
		 * richiamo, per cui se i dati sono inseriti tramite il codice, saranno statici
		 * e non modificabili. Se inseriti mentre mediante l'utilizzo di un database
		 * saranno manipolabili. Per questo i dati vanno inseriti e gestiti tramite
		 * database.
		 * 
		 * 
		 * 
		 * Esempio: una macchinetta deve immagazzinare deii prodotti e la disponibilità
		 * di essi, i prezzi i codici ecc...
		 * 
		 * Quindi un database serve a gestire un insieme di dati e fare su questi una
		 * serie di operazioni (manipolazione dei dati).
		 * 
		 * All'interno di un database vengono salvati i dati ma anche la definizione del
		 * dato stesso, ossia il tipo di dato da gestire e il suo nome.
		 * 
		 * I database non dipendono dal linguaggio di programmazione utilizzato, infatti
		 * sono gestiti da un DBMS.
		 * 
		 * DBMS=Database Management System Il DBMS è il sistema di gestione del database
		 * e si occupa interamente della modellazione dei dati. I database sono infatti
		 * inseriti e gestiti tramite un unico software ossia il DBMS, come ad esempio è
		 * MySQL.
		 * 
		 * Un DBMS deve avere alcune qualità: -Deve gestire grandi quantità di dati
		 * -Gestire persistenza e condivisione di dati -Offrire funzionalità all'utente
		 * per le gestione e lo sviluppo delle applicazioni -Garantire velocità di
		 * elaborazione -Consentire a più utenti di consultare i dati (ad esempio un
		 * eCommerce deve poter mostrare i prodotti a più utenti contemporaneamente)
		 * -Assicurare affidabilità dei dati
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		/*
		 * MODELLAZIONE CRUD ossia 4 operazioni: 1)Create-Creazione di un dato(il
		 * gestore che crea un nuovo prodotto) 2)Read-Lettura dei dati(il gestore ha la
		 * possibilità di leggere i dati del prodotto) 3)Update-Aggiornamento dei
		 * dati(il gestore può modificare dei dati cambiando ad esempio il prezzo, ma
		 * anche l'utente può modificare un dato ad esempio acquistandolo)
		 * 4)Delete-Cancellazione del dato
		 * 
		 * Un modello di dati consiste nella rappresentazione astratta delle strutture
		 * dei dati di un DataBase. l'atto di creazione di un modello prende il nome di
		 * modellazione dei dati(data modelling).
		 * 
		 * MODELLAIZONE DEI DATI
		 * 
		 * esistono due modi: -il modello entità relazioni(E-R) -il modello a oggetti
		 * 
		 * 
		 * Modello E-R
		 * 
		 * -Le entità sono gli oggetti principali su cui vengono raccolte informazioni.
		 * Ad esempio potrebbe essere una persona, una macchina o un evento. Nel caso
		 * della macchinetta possono essere le bevande e gli incassi, nel caso di un
		 * autovelox possono essere i trasgressori oppure le multe stesse con le
		 * relative sanzioni importi ecc..
		 * 
		 * -Gli attributi descrivono le entità ai quali sono associati. ad esempio
		 * avendo un'entità scontrino, come attributi avremo il numero seriale, la data
		 * e l'importo. Sono classificati come identificatori e descrittori. -gli
		 * Identificatori, sono chiamati anche chiavi e identificano univocamente una
		 * istanza di entità -i Descrittori, descrivono una caratteristica dell'istanza
		 * a cui sono associati
		 * 
		 * 
		 * -Le relazioni sono delle associazioni tra entità. sono quindi collegamenti
		 * tra entità, in quanto talvolta hanno la necessita di condividere dati tra di
		 * loro. Le relazioni sono classificate in termini di Grado, Cardinalità,
		 * Direzione ed Esistenza. Ciò avviene tramite le chiavi che possono essere
		 * primarie o esterne.
		 * 
		 * 
		 * La chiave primaria è un campo univoco che contiene il codice che identifica
		 * in maniera univoca il codice del prodotto, chiamato anche id. E' differente
		 * dalla chiave esterna, hanno funzioni opposte ma sono necessarie entrambe per
		 * mettere in relazione delle tabelle diverse.
		 * 
		 * 
		 */

		/*
		 * creazione di una tabella:
		 * 
		 * Utilizzare "XAMPP", attivare "Apache" e "MySQL". copiare
		 * http://localhost/phpmyadmin/ nell'url. di qui sarà possibile creare un nuovo
		 * DataBase tramite il menu di sinistra. al momento della creazione dovremo:
		 * -Dargli un nome -Inserire il numero di attributi che ci serviranno (tendendo
		 * conto dell'attributo id) -inserire ogni attributo dichiarando il tipo di dato
		 * che metteremo dentro e se necessario la lunghezza(perlopiù per le stringhe)
		 * -fare attenzione alla creazione della chiave primaria (id) accertandoci di
		 * attribuirgli dove sta scritto "indice" il valore "primaria" e spuntare il
		 * flag "auto incremento" per far si che non vi siano altri lementi uguali
		 * 
		 * 
		 * una volta creato e inseriti gli attributi ci sarà possiblie inserire e
		 * gestire i nostri dati.
		 * 
		 * 
		 * 
		 * creazione di una chiave esterna:
		 * 
		 * Una volta creata una seconda tabella che vorremo collegare alla prima, ci
		 * accertiamo di inserire come entità, l'id della tabellla che vorremo
		 * collegare. Successivamente selezioniamo l'entità con l'id della tabella da
		 * collegare e clickiamo su "indice" poi clickiamo su "vista relazioni" e
		 * selezioniamo la colonna, il DB e la tabella da collegare. ora si genererà la
		 * chhiave esterna e le tabelle saranno collegate.
		 * 
		 * Si consiglia per una struttura corretta di creare prima tutte le tabelle con
		 * i vari id e relazioni e poi inserire gli elementi, altrimenti potrebbe dare
		 * errore.
		 * 
		 * Si consiglia di partire dalla tabella principale e di collegare quelle più
		 * piccole a quellas
		 * 
		 * 
		 */

		/*
		 * *DATABASE RELAZIONALI*
		 * 
		 * Un database relazionale è una struttura dove la modellazione e
		 * l'archiviazione dei dati avviene a partire da una tabella. La tabella è un
		 * matrice bidimensionale che rappresenta un'identità logica. Ogni tabella è
		 * organizzata in una serie di righe e colonne, ogni singola riga viene detta
		 * record e rappresenta un' identità.
		 * 
		 * Esempio: immaginiamo una tabella che rappresenti il concetto di persona, la
		 * seconda riga ne rappresenta i dati relativi la colonna invcece contene i dati
		 * relativi alla specifica proprietà ad esempio il nome, l'età ecc. quindi ogni
		 * colonna ha una propria intestazione che fa parte della descrizione della
		 * tabella (che si chiama schema).
		 * 
		 * L'incrocio tra una riga e una colonna è definita cella o campo ed è cio che
		 * conterrà il singolo valore e potrà contenerne solo uno.
		 * 
		 * 
		 * All'atto pratico una tabella la vediamo così:
		 * 
		 * PERSONA |ID | Nome | Cognome | Età | Computer | |1 |Mario | Rossi | 30 |
		 * asus,Apple | |2 |Giuseppe | Verdi | 45 | Apple |
		 * 
		 * Questa è un tabella con 10 celle, in quanto le prime sono di intestaizone.
		 * 
		 * Essendo che una delle persone ha due computer, possiamo collegarli tramite le
		 * relazioni. ossia togliamo dalla tabella la colonna del computer (in quanto
		 * ogni cella può contenere un solo valore) e colleghiamo una seconda tabella
		 * tramite una chiave esterna (foreign key).
		 * 
		 * Quindi creiamo una seconda tabella alla quale attribuiamo la chiave primaria
		 * della prima tabella come chiave esterna.
		 * 
		 * Ad esempio:
		 * 
		 * COMPUTER |id persona | computer | | 1 | asus | | 1 | apple | | 2 | asus |
		 * 
		 * 
		 * 
		 */

		/*
		 * SQL
		 * 
		 * Structured Query Lenguage, ossia linguaggio di interrogazione strutturato ed
		 * è l'interfaccia per la creazione, manipolazione e controllo dei db
		 * relazionali.
		 * 
		 * Prevverde una serie di componenti ma 2 sono i più importanti:
		 * 
		 * 1) DDL data definition lenguage ossia tutti i comandi preposti per la
		 * creazione di tabelle e definizione dei dati. mediante questo linguaggio si
		 * definiscono tutte le strutture relazionali del db
		 * 
		 * 2)DML data manipulation lenguage la lista dei comandi che appartengono alla
		 * lista CRUD
		 * 
		 * su SQL si possono inserie anche i commenti, i vari modi sono con "#" su una
		 * sola riga con /* fino alla fine della sequenza
		 * 
		 * 
		 * ogni blocco di codice SQL si divide in:
		 * 
		 * -COMANDO
		 * 
		 * una riga di codice che termina con ";"
		 * 
		 * -COSTRUTTO
		 * 
		 * -CLAUSOLE
		 * 
		 * 
		 * Il linguaggio è caseinsensitive ossia non fa differenza tra maiuscole e
		 * minuscole. Per convenzione si scrviono le parole chiave in maiuscolo e le
		 * altre in minuscolo.
		 * 
		 * *LISTA QUERY*
		 * 
		 * SHOW serve a mostrare il nome delle tabelle esistenti, l'elenco delle tabelle
		 * oppure le caratteristiche.
		 * 
		 * SELECT ci permette di cercare dei dati
		 * 
		 * FROM ci permettere di indicare da che tabella dobbiamo svolegere il nostro
		 * comando
		 * 
		 * WHERE ci permette di selezionare un valore di un attributo per filtrare tra i
		 * vari attributi
		 * 
		 * 
		 * CREATE DATABASE [IF NOT EXISTS] nome database [DEFAULT]CHARACTER SET nome set
		 * caratteri[...] è il comando che serve per creare un db
		 * 
		 * DROP DATABASE [IF EXISTS] nome database è il comando che serve ad eliminare
		 * un db
		 * 
		 * ALTER DATABASE [IF NOT EXISTS] nome database [DEFAULT]CHARACTER SET nome set
		 * caratteri[...] è il comando che serve pper modificare un database
		 * 
		 * CREATE TABLE nome ({attributo dominio(lunghezza)[vincolo]}[,..] [vincoli
		 * multipli] è il comando che serve a creare una tabella
		 * 
		 * esempio: CREATE TABLE alunni (matricola CHAR(4) PRIMARY KEY, nome CHAR(40),
		 * indirizzo CHAR(80) );
		 * 
		 * nel caso di mySQL si usa VARCHAR invece di CHAR
		 * 
		 * FOREIGN KEY (entità da collegare) REFERENCES nome tabella alla quale
		 * collegarsi(nome entità alla quale collegarsi) è il comando che serve a creare
		 * una chiave esterna e collegarla
		 * 
		 * per aggiungere un campo invece usiamo: ALTER TABLE nome tabella ADD COLUMN
		 * nome entità da aggiungere DATE;
		 * 
		 * per eliminare un campo usiamo invece: ALTER TABLE nome tabella DROP COLUMN
		 * nome entità da eliminare;
		 * 
		 * con RENAME possiamo rinominare le tabelle inserendo il vecchio nome e poi il
		 * nuovo nome, ovviamente preceduto da ALTER TABLE
		 * 
		 * 
		 * *LE INTERROGAZIONI*
		 * 
		 * l'interrogazione del db viene esposta tramite il costrutto SELECT
		 * 
		 * le tre operazioni base che select fa sono:
		 * 
		 * 1) selezione, si esprime tramite la condizione WHERE che consente di
		 * selezionre ciò che vogliamo ricercare
		 * 
		 * es: SELECT * amici WHERE telefono="3232232343"; possiamo esprimere quindi una
		 * target list
		 * 
		 * 2) proiezione, ci permette di dire quali campi vogliamo selezionare
		 * 
		 * es: SELECT nome cognome FROM amici WHERE telefono="3232232343";
		 * 
		 * 3) congiunzione
		 * 
		 * possiamo prendere dati anche da più tabelle utilizando il punto "." si chiama
		 * Dot Notation
		 * 
		 * es: SELECT articoli.descrizione, percentuali.percentuale FORM articoli,
		 * percentuali WHERE articoli.codice=percentuali.codice
		 * 
		 * in questo esempio prendiamo articoli dalla tabella descrizione e percentuali
		 * dalla trabella percentuale
		 * 
		 * 
		 * *OPERATORI DI CONFRONTO*
		 * 
		 * =,!=,>,!>,<,!<,>=,<=,LIKE,BETWEEN
		 * 
		 * LIKE viene utilizzato come clausola di WHERE e permette di usare dei
		 * caratteri jolly:
		 * 
		 * "%" indica che prima o dopo ci puo essere qualsiasi carattere, il carattere
		 * potrebbe anchew non esserci il risultato verrà restituito comunque. (si può
		 * mettere sia prima che dopo l'elemento da cercare, in base a ciò che dobbiamo
		 * filtrare) ovviamente posto prima se dobbiamo cercare qualcosa che inizia
		 * diversamente e dopo se ha qualcosa dopo la fine.
		 * 
		 * "_" ci permette di mettere quanti caratteri deve ricercare dopo un elemento o
		 * prima di un elemento, va messo singolarmente per ogni carattere o pirma o
		 * dopo in base alla ricerca da effettuare si usa per indicare qualcosa che si
		 * avvicina alla mia ricerca.
		 * 
		 * i caratteri jolly sono conbinabil tra loro.
		 * 
		 * BETWEEN seleziona i valori in un determinato intervallo con gli estremi
		 * compresi si accomppaghna ad AND
		 * 
		 * 
		 * DISTINCT si usa per cercare gli elementi diversi in un campo
		 * 
		 * SELECT DISTINCT nome FROM alunni WHERE 1; in quersto modo restituirà solo i
		 * nomi diversi della tabella alunni
		 * 
		 * 
		 * ORDER BY ci permette di cercare in ordine alfabetico e non solo
		 * 
		 * es SELECT * FROM alunni ORDER BY cognome; in questo modo restituirà in ordine
		 * alfabetico (per nome) tutti gli alunni.
		 * 
		 * Si può determinare l'ordinamento desiderato con delle clausole.
		 * 
		 * esempio SELECT * FROM alunni ORDER BY cognome DESC; in questo modo saranno
		 * ordinati dal Z alla A per cognome
		 * 
		 * 
		 * 
		 * *GLI OPERATORI LOGICI*
		 * 
		 * sono gli stessi di java quindi:
		 * 
		 * AND
		 * 
		 * OR
		 * 
		 * NOT
		 * 
		 * e la loro logica di funzionamento è la stessa
		 * 
		 * 
		 * *COMANDI PER LA MODIFICA DEI DATI*
		 * 
		 * INSERT consente di inserire nuovi dati in una tabella.
		 * 
		 * es INSERT INTO nome tabella VALUE (lista di valori)
		 * 
		 * si possono inserire anche i nomi dei campi nei quali inserire i valori
		 * 
		 * INSERT INTO nome tabella (nome campo1, nome campo2, nome campo3) VALUE
		 * (valore 1 , valore 2, valore 3) in questomodo verranno inseriti i valori
		 * negli attributti descritti nello stesso ordine.
		 * 
		 * è possibile anche concatenare i valori inserendo più valori
		 * contemporaneamente mettendo una virgola tra le parentesi di un valore e
		 * l'altro
		 * 
		 * es: INSERT INTO nome tabella (nome campo1, nome campo2, nome campo3) VALUE
		 * (valore 1 , valore 2, valore 3),(valore 1 , valore 2, valore 3)
		 * 
		 * 
		 * DELETE
		 * 
		 * permette di cancellare dei dati, molto impotrante sppecificare dopo la
		 * condizione where cosa cancellare o verrà cancellato tutto nella tabella
		 * 
		 * es: DELETE FORM nome tabella WHERE condizione così verrà cancellato dalla
		 * tabellla solo ciò che indichiamo
		 * 
		 * DELETE FROM nome tabella cosi verrà cancellato tutto dalla tabella
		 * 
		 * 
		 * UPDATE
		 * 
		 * permette di sovrascrivere dei dati
		 * 
		 * es UPDATE nome tabella SET nome attriibuto = valore;
		 * 
		 * esempio UPDATE alunni SET cognome="Rossi" WHERE cognome=mario and nome=verdi;
		 * 
		 * oppure UPDATE articoli SET prezzo= prezzo+(prezzo*0,1); in questo modo verrà
		 * aumentato il prezzo di tutti i prodotti del 10%
		 * 
		 * 
		 */

	}

}
