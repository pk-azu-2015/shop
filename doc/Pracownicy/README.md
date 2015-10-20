#Pracownicy

##Skład:
1. Łukasz Winkler
2. Michał Szaleniec
3. Jakub Hudzik

###Usługi:
| Usługa           | Wejście                                          | Wyjście   | Error |
| ---------------- | ------------------------------------------------ | -------   | :---: |
| Dodaj            | Imię, Nazwisko, Adres, PESEL, Stanowisko, Pensja | PESEL     |       |
| Usuń             | PESEL                                            | OneWay    |       |
| Edytuj           | Imię, Nazwisko, Adres, Stanowisko, Pensja        | OneWay    |       |
| Podaj listę płac | All(PESEL)                                       | ListaPłac |       |

###Opis słowny usług:
| Usługa           | Opis                           | 
| ---------------- | ------------------------------ | 
| Dodaj            |Usługa dodająca nowego pracownika do bazy. Dane wejściowe to dane osobowe osoby: imię, nazwisko, adres, pesel, stanowisko pracy oraz pensja. Pesel to unikalny numer id | 
| Usuń             | Usługa pozwalająca na zwolnienie pracownika. Dane wejściowe to id (czyli numer pesel)| 
| Edytuj           | Usługa pozwalająca na edycję danych osobowych danego pracownika | 
| Podaj listę płac | Usługa która pozwala na wyświetlenie listy wszystkich płac pracowników | 

