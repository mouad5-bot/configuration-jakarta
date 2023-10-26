# ducommentation de projet

## Table of Contents

1. introduction
2. project structure
3. dependencies
4. Configuration
5. run the project

## Introduction

Resourcium Optima est une application web Java EE qui illustre comment mettre en place un projet web de base en utilisant Jakarta EE, Hibernate et MySQL. Ce projet constitue un point de départ pour la création d'applications web avec ces technologies.

## project structure
```
├───.idea
│   └───artifacts
├───.mvn
│   └───wrapper
├───src
│   └───main
│       ├───java
│       │   └───com
│       │       └───example
│       │           └───resourcium_optima
│       │               ├───auth
│       │               ├───classes
│       │               ├───config
│       │               └───entities
│       │                   └───enums
│       ├───resources
│       │   └───META-INF
│       └───webapp
│           ├───assets
│           │   ├───css
│           │   ├───images
│           │   └───js
│           ├───include
│           └───WEB-INF
└───target
    ├───classes
    │   ├───com
    │   │   └───example
    │   │       └───resourcium_optima
    │   │           ├───auth
    │   │           ├───classes
    │   │           ├───config
    │   │           └───entities
    │   │               └───enums
    │   └───META-INF
    ├───generated-sources
    │   └───annotations
    ├───maven-archiver
    ├───maven-status
    │   └───maven-compiler-plugin
    │       └───compile
    │           └───default-compile
    └───resourcium_optima-1.0-SNAPSHOT
        ├───assets
        │   ├───css
        │   ├───images
        │   └───js
            │   │   └───example
            │   │       └───resourcium_optima
            │   │           ├───auth
            │   │           ├───classes
            │   │           ├───config
            │   │           └───entities
            │   │               └───enums
            │   └───META-INF
            └───lib

```
## dependencies
Le projet utilise les dépendances suivantes gérées par Maven :

- Jakarta EE 8 : Plateforme Java EE pour la construction d'applications de niveau entreprise.
- Hibernate 5.6.15.Final : Fournisseur JPA pour la mise en correspondance objet-relation.
- MySQL Connector/J 8.0.33 : Pilote JDBC MySQL pour la connectivité à la base de données.
- Lombok 1.18.28 : Une bibliothèque permettant de réduire le code redondant en Java.

## Configuration
```persistence.xml```

Le fichier ``````persistence.xml`````` situé dans ```src/main/resources/META-INF``` définit l'unité de persistance et la configuration de la base de données. Il établit la connexion avec une base de données MySQL et spécifie Hibernate en tant que fournisseur JPA.

```web.xml```

Le fichier ```web.xml``` dans le répertoire ```webapp/WEB-INF``` configure les servlets et les auditeurs de l'application. Il inclut des correspondances de servlets et initialise la base de données.

```Maven - pom.xml```

Le fichier ```pom.xml``` à la racine du projet définit la configuration du projet et les dépendances. Il spécifie le nom du projet, la version, et configure les plugins de construction.

## Run the project
Pour exécuter le projet GatherGrid :

- Assurez-vous d'avoir Maven installé.
- Construisez le projet en exécutant la commande mvn clean install dans le répertoire racine du projet.
- Déployez le fichier WAR généré sur un serveur compatible Jakarta EE.
- Accédez à l'application en naviguant vers l'URL appropriée (par exemple, http://localhost:8080/resourcium_optima_war/).



