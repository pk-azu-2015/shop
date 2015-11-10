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
| Dodaj klienta | dodaj |
| Usuń klienta | usuń |
| Edytuj klienta | edytuj |
| Dodaj do historii zakupów | dodaj do historii |
| Oblicz rabat | Rabat. |

###Powiazanie z innymi uslugami
* Jeszcze - opis
* nie - opis1
* wiem - opis2

```
changelog:
2015-10-20: Dokumentacja, dodanie operacji i opisu operacji
```
