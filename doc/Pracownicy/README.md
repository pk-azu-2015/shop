#Pracownicy
Zarządzanie pracownikami sklepu, wypłaty pensji


##Osoby odpowiedzialne za usługę:
1. Łukasz Winkler
2. Michał Szaleniec
3. Jakub Hudzik

###Operacje:
| Usługa           | Wejście                                          | Wyjście              | Wyjątki |
| ---------------- | ------------------------------------------------ | ------------------   | :-----: |
| Dodaj            | Imię, Nazwisko, Adres, PESEL, Stanowisko, Pensja | PESEL                |         |
| Usuń             | PESEL                                            | OneWay               |         |
| Edytuj           | Imię, Nazwisko, Adres, Stanowisko, Pensja        | OneWay               |         |
| Pobierz liste plac|                                                 | List(PESEL, Wypłata) |         |

###Opis słowny operacji:
| Usługa           | Opis                           | 
| ---------------- | ------------------------------ | 
| Dodaj            | Operacja dodająca nowego pracownika do bazy. Dane wejściowe to dane osobowe osoby: imię, nazwisko, adres, PESEL, stanowisko pracy oraz pensja. PESEL to unikalny numer ID. | 
| Usuń             | Operacja pozwalająca na zwolnienie pracownika. Dane wejściowe to id (czyli numer PESEL).| 
| Edytuj           | Operacja pozwalająca na edycję danych osobowych danego pracownika. | 
| Pobierz listę płac | Operacja która pozwala na wyświetlenie listy płac wszystkich pracowników | 

###Powiązania z innymi usługami:
* Pobierz listę płac - operacja wykorzystywana przez usługę Księgowość -> Wypłaty
```
changelog:
2015-10-20: Dokumentacja, dodanie operacji i opisu operacji
```
