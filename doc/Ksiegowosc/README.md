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
