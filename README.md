# 🛡️ Système de Gestion d’Assurances (POO Avancée en Java)

## 📌 Description
Ce projet illustre la mise en pratique des concepts avancés de la **programmation orientée objet en Java**.  
Il simule la gestion d’un portefeuille de contrats d’assurance pour une compagnie fictive : **SecureLife Assurances**.

Types d’assurances pris en charge :
- 🚗 **Assurance Automobile** : couverture des véhicules
- 🏠 **Assurance Habitation** : protection des logements
- 👤 **Assurance Vie** : protection des personnes
- 🏥 **Assurance Santé** : formules santé avec niveaux de couverture

---

## 🎯 Objectifs pédagogiques
- Maîtriser les concepts avancés de la POO :
  - Classes et méthodes abstraites
  - Héritage et constructeurs (`super()`)
  - Polymorphisme
  - Redéfinition et surcharge de méthodes
  - Attributs/méthodes statiques
  - Bonnes pratiques (`this`, `toString()`, encapsulation)

---

## ⚙️ Fonctionnalités
- Génération automatique du numéro de contrat (`ASS0001`, `ASS0002`, …)
- Calcul polymorphe des primes annuelles selon le type d’assurance
- Affichage des contrats : individuel, global, ou filtré par type
- Calcul du chiffre d’affaires total (somme des primes)
- Recherche de l’assurance la moins chère
- Surcharge du coût total (avec/sans réduction)
- Calcul de la prime moyenne sur un tableau d’assurances

---

## 📂 Structure du projet
- `src/Assurance.java` → Classe abstraite (socle commun, utilitaires statiques)
- `src/AssuranceAuto.java` → Spécialisation véhicule
- `src/AssuranceHabitation.java` → Spécialisation logement
- `src/AssuranceVie.java` → Spécialisation vie
- `src/AssuranceSante.java` → Extension santé (exemple d’extension)
- `src/GestionnaireAssurance.java` → Affichages, calculs globaux, filtrage
- `src/TestAssurance.java` → Programme de démonstration (point d’entrée)

---

## 🧰 Prérequis
- Java JDK 8+ (recommandé: 17 ou 21)
- Un IDE Java (IntelliJ IDEA, Eclipse, VS Code) OU la ligne de commande `javac`/`java`

---

## 🚀 Installation et exécution
1) Cloner le projet
```bash
git clone https://github.com/ndourmouhammad/gestion-assurances-java.git
cd gestion-assurances-java
```

2) Compiler et exécuter en ligne de commande
- Sous Windows (PowerShell) depuis la racine du projet :
```powershell
javac -d out src\*.java
java -cp out TestAssurance
```

3) Exécuter avec IntelliJ IDEA
- Fichier > Ouvrir > Sélectionner le dossier du projet
- Attendre l’indexation, puis créer une configuration d’exécution avec la classe `TestAssurance`
- Lancer la configuration (bouton Run)

---

## ▶️ Exemple de sortie (extrait)
```
=== Affichage individuel ===
Contrat: ASS0001 | Client: Aliou Ndiaye | Cotisation mensuelle: 50000.0FCFA
Prime annuelle : ... FCFA
...
=== Calcul des primes ===
Auto - Prime : ... FCFA
...
Nombre total de contrats : 6
Chiffre d’affaires total : ... FCFA
Assurance la moins chère : ... → Prime : ... FCFA
=== Calcul du coût total avec réduction ===
Coût normal sur 5 ans : ... FCFA
Coût avec réduction (10%) : ... FCFA
Prime moyenne : ... FCFA
```

---

## 🧠 Concepts POO mis en œuvre
- Abstraction: `Assurance` définit l’API commune (`calculerPrime`, `getTypeAssurance`)
- Polymorphisme: appels sur un tableau `Assurance[]` de types concrets variés
- Encapsulation: attributs privés + getters/setters
- Surcharge: `calculerCoutTotal(int)` et `calculerCoutTotal(int, double)`
- Membre statique: compteur global de contrats et utilitaires de calcul

---

## 📈 Extensions possibles
- Nouvelles formules santé (paliers, franchises, plafonds)
- Persistance (fichiers/DB) des contrats
- Interface utilisateur (console enrichie, CLI, ou interface graphique)
- Tests unitaires JUnit et CI

---

## 👤 Auteur
- [Mouhammad NDOUR](https://github.com/ndourmouhammad)