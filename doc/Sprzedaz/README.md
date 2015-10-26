#Sprzedaż


##1. Wprowadzenie.
Nasza usługa jest usługą końcową przeznaczoną dla końcowego klienta.


##2. Osoby odpowiedzialne za usługę.
1. Rafał Chudeusz
2. Jacek Wiślak


##3. Opis usługi.
| Usługa           | Wejście                                          | Wyjście   | Wyjątek |
| ---------------- | ------------------------------------------------ | -------   | :---: |
|1. Sprzedaj            | lista(kod_produktu, ilość), id_klienta |  cena, lista(kod_sprzedaży, kod_produktu)  |  brak towaru    |
|2.  Naprawa gwarancyjna     |      kod_sprzedaży, kod_produktu    | naprawa, zwrot_pięniedzy   |   nieuznanie gwarancji |
|3.  Zwroty      | kod_sprzedaży, kod_produktu         | zwrot pieniędzy   |    nie uwzględnienie zwrotu  |


Na początku trzeba wprowadzić id_klienta oraz kod_produktu i jego ilość, na wyjściu dostajemy
cenę oraz kod_sprzedaży, który identyfikuje transakcję wraz z kod_produktu który wskazuje na
nabywany artykuł. W przypadku braku artykułu wystąpi wyjątek w postaci „braku towaru” na
stanie.


Naprawa gwarancyjna na wejściu przyjmuje kod_sprzedaży oraz kod_produktu. Na wyjście
dostaniemy dwie wartości Boolean prawdopodobnie w formie listy z naprawą oraz
zwrot_pieniędzy. Wyjątek to całkowite nieuznanie gwarancji.


Zwrot na wejściu podajemy kod_sprzedaży i kod_produktu, w przypadku uznania zwrotu
otrzymujemy zwrot pieniędzy wyjątek wtedy gdy nie zostanie uznany.

###3.1 Wspópraca
Nasza usługa wspópracuje z dwoma innymi usugami: Klienci oraz Magazyn.


##4. Wymagania, instalacja (deploy), uruchomienie.
Empty.


##5. Dokumentacja operacji obsługiwanych przez usługę:

* Opis operacji

* Wejście

* Wyjście

* Wyjątki

* Przykład użycia, use case, diagramy sekwencji etc.


![alt text](http://i.imgur.com/dwnz1MR.png "Diagram klas usługi Sprzedaż")


![alt text](http://i.imgur.com/QB5urr1.png "Przypadki użycia dla usługi Sprzedaż")


##6. Change log.

    * 20.10.2015 - dodanie pliku README.md, dodanie operacji i opis usługi, osób odpowiedzialnych za usług, powiązanie z innymi usługami

