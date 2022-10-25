## Oblig 3 Vemund Brynjulfsen ##


Først hadde jeg filene fra obblig 2.
Prosjektet ble gjort i maven, og brukte junit for testing.

I pom.xml filen la jeg til følgende:
```
    <build>
        <plugins>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.1</version>
                <configuration>
                    <includes>
                        <include>
                            /**/*Check_If_Year_Is_Leap_Year.java
                        </include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

I taggene blir det referert til filen der testene ligger.

Så opplastet jeg filene til github via intellj.

Etter det gikk jeg inn i .github mappen, der jeg lagde en workflows fil.
I workflow filen lagde jeg en yml fil kallt "bygg_og_test_workflow.yml".
I filen skrev jeg følgende:
```
name: Oblig 3 workflow

on:
  push:


jobs:
  build:

    runs-on: windows-latest

    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: maven
    - name: Bygg og test
      run: mvn -B package --file pom.xml
```


```
on:
  push:
```
betyr at filen vil kjøre når noe blir pushet til repositoriet.

```
runs-on: windows-latest
```
betyr at koden blie kjørt på en windows maskin.

```
    steps:
    - uses: actions/checkout@v3
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'
        cache: maven
```

steps definerer det som skal skje.
checkout kopierer koden i repositoriet til en github server.
setup konfigurerer Java JDK med versjon 17, i temurin distribusjonen.

Så kjører denne koden:
```
    - name: Bygg og test
      run: mvn -B package --file pom.xml
```
Dette steppet blir navngitt "Bygg og test".
Under er en kommando som bygger prosjektet med innholdet i pom.xml,
og kjører testene definert med maven surefire.


Når man pusher noe opp til repositoriet, og klikker på "actions" tabben,
kan man se at yml filen kjører.
Under "Bygg og test" tabben kan man se at testene kjører:
![tester](https://user-images.githubusercontent.com/112019109/197818163-5360125a-e5c7-4aed-94c8-6cd6b17b8c8b.png)
Dette viser at testene kjørte vellykket.






