# TP 0 : Mise en œuvre des principes SOLID en Java

## Informations Personnelles
- **Nom** : AZEBAZE BAHEBEG
- **Prénoms** : AUREL BRYAN
- **Matricule** : 23U2290
- **Cours** : ICT301 - Conception Logicielle Orientée Objet

## Ma compréhension des principes SOLID

À travers ce TP, j'ai mis en pratique les cinq principes fondamentaux pour créer un code robuste et maintenable :

1. **SRP (Single Responsibility Principle)** : J'ai compris ici que selon ce principe,une classe doit avoir une seule responsabilite 
2. **OCP (Open-Closed Principle)** : Ce principe m'a montré comment rendre un système évolutif. Le code doit être ouvert à l'ajout de nouvelles fonctionnalités
3. **LSP (Liskov Substitution Principle)** : J'ai appris qu'une classe enfant doit pouvoir remplacer sa classe parente sans modifier le comportement attendu du programme. 
4. **ISP (Interface Segregation Principle)** : J'ai compris qu'il vaut mieux plusieurs petites interfaces spécifiques qu'une seule interface générale . Cela évite de forcer des classes  à implémenter des méthodes dont elles n'ont pas besoin.
5. **DIP (Dependency Inversion Principle)** : Ce principe souligne l'importance de dépendre des abstractions (interfaces) plutôt que des implémentations concrètes. Cela permet de changer des composants (comme passer d'une base MySQL à MongoDB) sans impacter les couches supérieures du logiciel.

## Structure du dépôt
Le projet est divisé en cinq dossiers (SRP, OCP, LSP, ISP, DIP), chacun contenant une version `Avant` (violation) et une version `Apres` (respect du principe).