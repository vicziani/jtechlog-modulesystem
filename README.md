JTechLog Java Platform Modul System
===================================

Ez a program a JTechLog (<http://jtechlog.hu>) blog "Tapasztalat a Java Platform Module Systemmel" cikkéhez készült példaprogram.
Egy példa alkalmazást mutat be a modularizáció használatára a Java 9-től, Maven build rendszerrel.

Az alkalmazás függőségeit össze lehet gyűjteni a `mvn dependency:copy-dependencies -DoutputDirectory=tmp`
paranccsal, ekkor a `frontend` könyvtárban létrehoz egy `tmp` könyvtárat sok `jar` fájllal. Ezeket bemásolhatjuk
egy `mods` könyvtárba, majd mellé a `target` könyvtárakban lévő `backend-1.0-SNAPSHOT.jar` és `frontend-1.0-SNAPSHOT.jar`
fájlokat.
Az alkalmazást ekkor a `java --module-path mods -m frontend/jtechlog.frontend.App` paranccsal futtathatjuk.

viczian.istvan a gmail-en