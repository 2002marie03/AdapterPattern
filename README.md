# Mon Projet Adapter HDMI-VGA

## Introduction

Ce projet illustre l'implémentation du pattern adapter dans le contexte de la conversion HDMI vers VGA.

## Structure du Projet

- **`HDMI.java`**: Interface représentant le port HDMI avec une méthode `view` pour afficher les données.
- **`VGA.java`**: Interface représentant le port VGA avec une méthode `print` pour afficher les données.
- **`TV.java`**: Classe représentant un composant d'affichage TV qui implémente l'interface HDMI.
- **`AdapterHDMIVGAComposition.java`**: Implémentation de l'adaptateur HDMI vers VGA utilisant la composition.
- **`AdapterHDMIVGACLASS.java`**: Implémentation de l'adaptateur HDMI vers VGA utilisant l'héritage.
- - **`SUPERVP.java`**: Classe  implemente les interfaces HDMI  et VGA qui représente le fait d'utiliser soit du port VGA a HDMI ou bien l'inverse .

## Utilisation

Le scénario d'utilisation de ces classes est illustré dans le code d'exemple fourni dans le dépôt.

## Exécution
<p align="center">
  <img src="https://github.com/2002marie03/AdapterPattern/assets/95045123/9ebf4a4e-799b-44b2-9b8c-0a3e19d176c9" width="200" alt="Image 1">
</p>

<p align="center">
  <img src="https://github.com/2002marie03/AdapterPattern/assets/95045123/407bf07b-7b48-4d64-af64-6938300ce61d" width="200" alt="Image 2">
</p>

<p align="center">
  <img src="https://github.com/2002marie03/AdapterPattern/assets/95045123/ddda147d-c58f-4eac-81f8-3fda093d8be6" width="200" alt="Image 3">
</p>



#Design_Pattern
