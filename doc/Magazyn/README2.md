
##1 Wspólpraca.
Modul magazyn wspólpracuje z Asortyment, Sprzedaż, Ksiegowosc

##2. Diagram przypadkow użycia.
![alt text](https://github.com/pk-azu-2015/shop/blob/master/doc/Magazyn/UseCaseDiagram.jpg)

##3. Opis przypadków użycia.

**sprzedaj()** – sprzedaż produktu o podanym kodzie_produktu
               - komunikaty
**naprawaGwarancyjna()** - naprawa gwarancyjna na wejściu przyjmuje kod_sprzedaży oraz 
dostaniemy dwie wartości Boolean prawdopodobnie w formie listy z naprawą oraz 
zwrot_pieniędzy. Wyjątek to całkowite nieuznanie gwarancji

**zwróć()** - podajemy kod_sprzedaży i kod_produktu, w przypadku uznania zwrotu
otrzymujemy zwrot pieniędzy wyjątek wtedy gdy nie zostanie uznany

**dodajProdukt()** - oznacza dodanie nowego dobra (towaru/usługi) do asortymentu sklepu.
Produkt zostanie dodany do już istniejącej listy produktów.

**usunProdukt()** - oznacza wykasowanie produktu z asortymentu sklepu. Produkt zostanie
usunięty z listy produktów dostępnych.

**pobierz()** – produkt usuwany z listy magazynu podczas wywołania przypadku sprzedaj() z usługi Sprzedaż

**dodajDoMagazynu()** – produkt dodawany do listy magazynu w momencie zwrotu w usłudze Sprzedaż

**uzupelnij()** – przypadek, w którym uzupełniane są stany magazynowe. Metoda wykonywana jest automatycznie, a informacje na temat uzupełnień zwracane są w logach.

**wyswietlStan()** – wyświetla stany magazynowe

**dodajSprzedaż()** – zapisuje w bazie danych dane na temat sprzedaży

**dodajZakup()** – zapisuje w bazie danych dane na temat zakupów 


##4.  Diagram sekwencji UML.
![alt text](https://github.com/pk-azu-2015/shop/blob/master/doc/Magazyn/SequenceDiagram.jpg)


