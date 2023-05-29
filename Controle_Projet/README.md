# Projet Systèmes Distribués
<p>On souhaite créer un système distribué basé sur les micro-services Cette application devrait
permettre de gérer et d’automatiser le processus des infractions concernant des véhicules
suites à des dépassement de vitesses détectés par des radars automatiques. Le système se
compose de trois micro-services :</br><br>
• Le micro-service qui permet de gérer les radars. Chaque radar est défini par son id, sa
vitesse maximale, des coordonnées : Longitude et Latitude.<br>
• Le micro-service d’immatriculation qui permet de gérer des véhicules appartenant des
propriétaires. Chaque véhicule appartient à un seul propriétaire. Un propriétaire est
défini par son id, son nom, sa date de naissance, son email et son email. Un véhicule
est défini par son id, son numéro de matricule, sa marque, sa puissance fiscale et son
modèle.<br><br>
• Le micro-service qui permet de gérer les infractions. Chaque infraction est définie par
son id, sa date, le numéro du radar qui a détecté le dépassement, le matricule du
véhicule, la vitesse du véhicule, la vitesse maximale du radar et le montant de
l’infraction.<br><br>
En plus des opérations classiques de consultation et de modifications de données, le système
doit permettre de poster un dépassement de vitesse qui va se traduire par une infraction. En
plus, il doit permettre à un propriétaire de consulter ses infractions.</p>
<br>

## Architechure technique
<img src="Simulation-Radar/src/main/resources/images/img1.png">

## Architecture des fichiers
<img src="Simulation-Radar/src/main/resources/images/img2.png">

- **radars-angular-frontend** : contient la partier frontend developpée avec angular
- **immatriculation-service** : Microservice de matruculation et vehicule - proprietaire.
- **radar-service** : Microservice de radar.
- **infraction-service** : Microservice d'établissement des infractions et amendes.

## Diagramme de classe
<img src="Simulation-Radar/src/main/resources/images/img3.png">

## Testing

### Afficher les vehicules et leur proprietaires

<img src="Simulation-Radar/src/main/resources/images/img4.png">

### Afficher les proprietaies

<img src="Simulation-Radar/src/main/resources/images/img5.png">

### Afficher les proprietaies avec Postman

<img src="Simulation-Radar/src/main/resources/images/img6.png">

### Afficher les vehicules avec Postman

<img src="Simulation-Radar/src/main/resources/images/img7.png">

### Tester SOAP
<img src="Simulation-Radar/src/main/resources/images/img8.png">

<img src="Simulation-Radar/src/main/resources/images/img9.png">

### Tester GRAPHQL

<img src="Simulation-Radar/src/main/resources/images/img10.png">


<img src="Simulation-Radar/src/main/resources/images/img12.png">

### Tester GRPC

<img src="Simulation-Radar/src/main/resources/images/img13.png">

<img src="Simulation-Radar/src/main/resources/images/img14.png">

### Tester l'infraction avec REST

<img src="Simulation-Radar/src/main/resources/images/img15.png">

### Tester Radars avec REST

<img src="Simulation-Radar/src/main/resources/images/img16.png">

### Tester Eureka Discovery
<img src="Simulation-Radar/src/main/resources/images/img17.png">

<img src="Simulation-Radar/src/main/resources/images/img18.png">

### Linterface Proprietaires avec angular

<img src="Simulation-Radar/src/main/resources/images/img19.png">

### Linterface Vehicules avec angular

<img src="Simulation-Radar/src/main/resources/images/img20.png">

### Linterface Radars avec angular

<img src="Simulation-Radar/src/main/resources/images/img21.png">

