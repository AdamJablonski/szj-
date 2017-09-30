# szj-servlet-form
Spotkania z Javą - formularz

1. Serwlet pokazuje formularz
2. Użytkownik wykonuje akcje submit na formularzu
3. Przeglądarka wysyła żądanie do serwletu. Parametry są przekazywane w żądaniu
4. Serwlet odczytuje parametry i na ich podstawie wyświetla formularz

Wymagania: Uruchomiony WildFly 10, z folderu WildFly:
`$ ./bin/standalone.sh`

Uruchomienie:
`$ mvn clean install wildfly:deploy`

W przeglądarce:
`http://localhost:8080/szj-servlet-form/form`
