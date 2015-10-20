# Dokumentacja

System obsługi sklepu. Zarządza obsługą zamówień, uzupełnianiem stanów magazynowych i księgowością.

### Usługi:

* Sprzedaż - obsługa klienta końcowego (sprzedaż, zwrot, reklamacja)
* Pracownicy - zarządzanie pracownikami sklepu, wypłaty pensji
* Księgowość - przechowuje informacje o wszystkich sprzedażach (paragony), zamówieniach (z fabryki) i wypłatach (pracownikom pensji)
* Asortyment - przechowuje informacje o produktach jakie sklep ma w ofercie
* Magazyn - przechowuje stan magazynowy towarów dostępnych w sklepie, dba o uzupełnianie stanów gdy któregoś produktu jest mało lub wcale, a jest w asortymencie
* Klienci - informacje statystyczne o klientach, ustalanie indywidualnych rabatów

## Wytyczne jak tworzyć i utrzymywać dokumentację poszczególnych usług
Proszę tu umieszczać swoje sprawozdania, które jednocześnie będą dokumentacją projektu.

Sprawozdanie będzie się składać z kilku sekcji:

1. Nazwa usługi + krótki opis (brief)
2. Osoby odpowiedzialne za usługę
3. Opis usługi
4. Wymagania, instalacja (deploy), jak uruchomić i sprawdzić czy działa
5. Dokumentacja operacji obsługiwanych przez usługę
 + Opis operacji
 + Wejście
 + Wyjście
 + Wyjątki
 + Przykład użycia, use case, diagramy sekwencji etc.
6. Change log (postęp nad rozwojem projektu i implementacji usługi, zmiany etc.)

**Proszę unikać liter z poza alfabetu ASCII w nazwa plików tj. liter z ogonkami, cyrylicy, liter skandynawskich itp.**

Proszę użyć formatu nazwy pliku:

    {nazwa_usługi}/README.md

Ewentualne załączane pliki umieszczać w:

    {nazwa_usługi}/

Przykład:

    warehouse/README.md
    warehouse/diagram.png


Przydatne link dla formatu .md:

* [Markdown Live Preview](http://markdownlivepreview.com/)
* [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
s