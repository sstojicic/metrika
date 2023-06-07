# metrika
calculator.java-LOC 134
MIT license.java-LOC 17
Start.java-LOC 19
zbirno LOC 170
Ciklomatska slozenost metode Calculate=3
Kognitivna slozenost metode Calculate je umerena do visoka zbog niza grananja
Ciklomatska slozenost metode evaluateExpression=2
Kognitivna slozenost metode evaluateExpression je umerena do visoka zbog niza grananja i petlji
Nedoslednosti fajla calculator: Metoda ToString() u klasi Operations treba biti preimenovana u toString() kako bi se uskladila s konvencijama nomenklature Java jezika.
Trenutno, pravilno pozivanje metode trebalo bi biti Operations.toString() umesto Operations.ToString().
Nedoslednosti fajla Start:U petlji while (active), objekat Scanner se stvara u svakoj iteraciji petlje.
Bolje bi bilo da se objekt Scanner stvori izvan petlje i ponovno upotrebi za svaki unos kako bi se izbeglo nepotrebno stvaranje više objekata Scanner.
Nakon svake iteracije petlje, trebalo bi koristiti metodu scanIn.close() kako bi pravilno zatvorili Scanner objekat. Trenutno zatvarate Scanner samo ako korisnik unese "exit". 
