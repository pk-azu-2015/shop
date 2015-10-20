#Pracownicy
Zarządzanie pracownikami sklepu, wypłaty pensji


##Osoby odpowiedzialne za usługę:
1. Łukasz Winkler
2. Michał Szaleniec
3. Jakub Hudzik

###Operacje:
| Usługa           | Wejście                                          | Wyjście   | Wyjątki |
| ---------------- | ------------------------------------------------ | -------   | :-----: |
| Dodaj            | Imię, Nazwisko, Adres, PESEL, Stanowisko, Pensja | PESEL     |         |
| Usuń             | PESEL                                            | OneWay    |         |
| Edytuj           | Imię, Nazwisko, Adres, Stanowisko, Pensja        | OneWay    |         |
| Podaj listę płac | List(PESEL)                                       | List(PESEL, Wypłata) |         |

###Opis słowny operacji:
| Usługa           | Opis                           | 
| ---------------- | ------------------------------ | 
| Dodaj            | Operacja dodająca nowego pracownika do bazy. Dane wejściowe to dane osobowe osoby: imię, nazwisko, adres, PESEL, stanowisko pracy oraz pensja. PESEL to unikalny numer ID. | 
| Usuń             | Operacja pozwalająca na zwolnienie pracownika. Dane wejściowe to id (czyli numer PESEL).| 
| Edytuj           | Operacja pozwalająca na edycję danych osobowych danego pracownika. | 
| Podaj listę płac | Operacja która pozwala na wyświetlenie listy płac pracowników z podanym na wejście numerem PESEL. Jeśli puste poda listę płac wszystkich pracowników. | 

```
changelog:
20.10.2015: Dokumentacja, dodanie operacji i opisu operacji
```
