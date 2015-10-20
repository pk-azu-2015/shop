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
| Pobierz stan konta |                                                  | Lista plac|       |
| Pobierz informacje o zakupie |Id sprzedazy                            | Lista(kod produktu,cena) | Nieprawodlowe ID      |

####Opis slowny operacji
| Operacje  | Opis |
|-----------|------|
| Dodaj sprzedaż | Operacja umożliwiająca zapisanie do bazy danych informacji na temat danej sprzedaży.
Na wejściu jest lista z kodem produktu z magazynu, cena za produkt oraz kod sprzedaży
z działu Sprzedaż | 
| Dodaj zakup  | Operacja umożliwiająca zapisanie do bazy danych informacji na temat danego zakupu. Na
wejściu jest lista z kodem produktu, ceną oraz kodem zakupu z działu Magazyn |
| Wyplaty | Operacja umożliwiająca realizację zapłaty pracownikom za pracę. Na wejście lista płac |
| Pobierz stan konta | Operacja umożliwiająca sprawdzenie aktualnego stanu konta firmy |
| Pobierz informacje o zakupie | Operacja umożliwia sprawdzenie informacji dotyczącej wybranego zakupu/sprzedaży. Na
wejście podajemy id zakupu/sprzedaży. Na wyjściu otrzymujemy listę produktów z ceną
za produkt. Może wystąpić błąd, jeśli dany id zakupu/sprzedaży nie istnieje |
