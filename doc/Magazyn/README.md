#Magazyn

##1. Nazwa uslugi i opis 
Magazyn <br>
Zadaniem modułu jest umożliwienie użytkownikowi systemu dokonania operacji zwizanych z modulem Magazyn

##2. Osoby odpowiedzialne
Adrian Makuch <br>
Łukasz Kucik

##3. Opis usugi
Zadaniem modułu Magazyn jest umożliwienie użytkownikowi systemu dokonania operacji dodania obiektu do magazynu, usunięcia obiektu z magazynu, uzupełnienia magazynu jak i wyświetlenia stanu magazynu. Moduł ma postać klasy zaimplementowanej usługi w procesie biznesowym. Moduł wykorzystywany jest bezpośrednio przez użytkownika końcowego jak również jako element innego procesu w systemie.


##4. Operacje:
| Operacje           | Wejście                                          | Wyjście   | Wyjatki |
| ------------------ | ------------------------------------------------ | -------   | :---: |
| dodajDoMagazynu()  | int kod_produktu                                 | OneWay    |       |
| pobierz()          | int kod_produktu                                 | int ilość | eventException brak_towaru,niepoprawny_kod | 
| uzupelnij()        |                                                  | REPO_LOGS.txt    |       |
| wyswietlStan()     |                                                  | int ilość| eventException niepoprawny_kod|


##5. Diagram UML
![alt text](https://github.com/pk-azu-2015/shop/blob/master/doc/Magazyn/Capture.JPG)
