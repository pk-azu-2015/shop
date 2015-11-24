#Ksiegowosc
Przechowuje informacje o wszystkich sprzedażach (paragony), zamówieniach (z fabryki) i wypłatach (pracownikom pensji).
##Skład:
1. Łukasz Winkler
2. Michał Szaleniec
3. Jakub Hudzik

###Operacje:
| Operacje           | Wejście                                          | Wyjście   | Wyjatki |
| ------------------ | ------------------------------------------------ | -------   | :---: |
| Dodaj sprzedaż     | Lista(kod produktu, cena), kod sprzedaży         | OneWay    |       |
| Dodaj zakup        | Lista(kod produktu, cena), kod zakupu            | OneWay    |       | 
| Wyplaty            | Lista plac                                       | OneWay    |       |
| Pobierz stan konta |                                                  | Stan konta|       |
| Pobierz informacje o zakupie |Id zakupu                               | Lista(kod produktu,cena) | Nieprawodlowe ID
| Pobierz informacje o sprzedaży |Id sprzedaży                           | Lista(kod produktu,cena) | Nieprawodlowe ID|

###Opis slowny operacji
| Operacje  | Opis |
|-----------|----|
| Dodaj sprzedaż | Operacja umożliwiająca zapisanie do bazy danych informacji na temat danej sprzedaży. Na wejściu jest lista z kodem produktu z magazynu, cena za produkt oraz kod sprzedaży z działu Sprzedaż |
| Dodaj zakup | Operacja umożliwiająca zapisanie do bazy danych informacji na temat danego zakupu. Na wejściu jest lista z kodem produktu, ceną oraz kodem zakupu z działu Magazyn |
| Wyplaty | Operacja umożliwiająca realizację zapłaty pracownikom za pracę. Na wejście lista płac |
| Pobierz stan konta | Operacja umożliwiająca sprawdzenie aktualnego stanu konta firmy |
| Pobierz informacje o zakupie | Operacja umożliwia sprawdzenie informacji dotyczącej wybranego zakupu/sprzedaży. Na wejście podajemy id zakupu. Na wyjściu otrzymujemy listę produktów z ceną za produkt. Może wystąpić błąd, jeśli dany id zakupu nie istnieje |
| Pobierz informacje o sprzedaży | Operacja umożliwia sprawdzenie informacji dotyczącej wybranego sprzedaży. Na wejście podajemy id sprzedaży. Na wyjściu otrzymujemy listę produktów z ceną za produkt. Może wystąpić błąd, jeśli dany id sprzedaży nie istnieje |

###Powiazanie z innymi uslugami
* Sprzedaz - Dodaj sprzedaz - pobranie kodu sprzedaży
* Magazyn - Dodaj zakup - pobranie kodu zakupu
* Pracownicy - Wyplaty - pobranie listy płac

```
changelog:
20.10.2015: Dokumentacja, dodanie operacji i opisu operacji, powiazanie z innymi uslugami
```
