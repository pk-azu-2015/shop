#Klienci
Przechowuje informacje o wszystkich klientach sklepu, historii zakupów oraz oblicza wysokoć rabatu.
##Skład:
1. Woźniak Jakub
2. Żabicki Konrad

###Operacje:
| Operacje           | Wejście                                          | Wyjście   | Wyjatki |
| ------------------ | ------------------------------------------------ | -------   | :---: |
| Dodaj klienta      | Imi, nazwisko, adres, NIP, nr tel., PESEL        | ID_klienta| NIP, PESEL      |
| Usuń klienta       | ID_klienta                                       | OneWay    | Nieprawidowe ID      | 
| Edytuj klienta     | Imi, nazwisko, adres, nr tel.                    | OneWay    |       |
| Dodaj do historii zakupów | Kod sprzedaży                             | OneWay    |       |
| Oblicz rabat       | ID_klienta                                       | Wysokoć rabatu | Nieprawidowe ID      |

###Opis slowny operacji
| Operacje  | Opis |
|-----------|----|
| Dodaj klienta | Bla bla bla... |
| Usuń klienta | Tu też bla bla bla. |
| Edytuj klienta | Bla bla! |
| Dodaj do historii zakupów | Bla! |
| Oblicz rabat | Rabat. |

###Powiazanie z innymi uslugami
* Jeszcze - opis
* nie - opis1
* wiem - opis2


