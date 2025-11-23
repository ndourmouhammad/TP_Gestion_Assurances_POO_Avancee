# 🛡️ Système de Gestion d’Assurances (POO Avancée en Java)

## 📌 Description
Ce projet illustre la mise en pratique des concepts avancés de la **programmation orientée objet en Java**.  
Il simule la gestion d’un portefeuille de contrats d’assurance pour une compagnie fictive : **SecureLife Assurances**.

Trois types d’assurances sont proposés :
- 🚗 **Assurance Automobile** : couverture des véhicules
- 🏠 **Assurance Habitation** : protection des logements
- 👤 **Assurance Vie** : protection des personnes

---

## 🎯 Objectifs pédagogiques
- Maîtriser les concepts avancés de la POO :
    - Classes abstraites et méthodes abstraites
    - Héritage et constructeurs (`super()`)
    - Polymorphisme
    - Redéfinition et surcharge de méthodes
    - Variables et méthodes statiques
    - Utilisation de `this` et `toString()`

---

## ⚙️ Fonctionnalités
- Création de contrats d’assurance avec numéro généré automatiquement (`ASS0001`, `ASS0002`, …)
- Calcul des primes annuelles selon le type d’assurance
- Affichage des informations des contrats (individuel, global, filtré par type)
- Calcul du chiffre d’affaires total
- Gestion polymorphe d’un tableau d’assurances
- Extensions possibles : assurance santé, comparaison des primes, calcul de prime moyenne

---

## 📂 Structure du projet
- `Assurance` → Classe abstraite définissant les attributs et méthodes communes
- `AssuranceAuto` → Spécialisation pour les véhicules
- `AssuranceHabitation` → Spécialisation pour les logements
- `AssuranceVie` → Spécialisation pour la protection des personnes
- `GestionnaireAssurance` → Classe utilitaire pour l’affichage et les calculs
- `TestAssurance` → Programme principal de démonstration

---

## 🚀 Installation
1. Cloner le projet :
   ```bash
   git clone https://github.com/<ton-username>/gestion-assurances-java.git
## Auteur
- [Mouhammad NDOUR](https://github.com/ndourmouhammad)