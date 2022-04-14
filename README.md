# RadarPredictions
Schritt 1:
    installiere Java 11
    link: https://www.techspot.com/downloads/5553-java-jdk.html

Schritt 2:
    navigiere zu Ordner "broker" : cd /broker
    führe Befehl aus: ./mvnw spring-boot:run

Schritt 3:
    Öffne Url auf dem Browser: http://localhost:8080/predictions

    Method GET: um neue daten zu erhalten
    Method POST: um Predictions ans backend zu schicken

    bedingungen:
        headers= {'Content-Type': 'application/json', 'Accept':'*/*'}