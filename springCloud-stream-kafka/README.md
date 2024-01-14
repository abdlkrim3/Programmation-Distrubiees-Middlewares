# Programmation-Distrubiees-Middlewares

<img src="images/1.gif"><br>
<p>
Travail à faire :<br>
1. <br>
- Télécharger Kafka (voir <a href="https://kafka.apache.org/downloads">ici</a> <br>
- Démarrer Zookeeper<br>
- Démarrer Kafka-server<br>
- Tester avec Kafka-console-producer et kafka-console-consumer<br>
2. Avec Docker (voir <a href=" https://developer.confluent.io/quickstart/kafka-docker">ici</a>)<br>
 -pour plus d'information (voir <a href="https://www.youtube.com/watch?v=9O1Kuk2xXO8" >ici</a>)<br>
 - Créer le fichier docker-compose.yml<br>
 - Démarrer les conteneurs docker : zookeeper et kafka-broker<br>
 - Tester avec Kafka-console-producer et kafka-console-consumer<br>
3.<br> 
En Utilisant KAFKA et Stpring Cloud Streams, Créer :<br>
- Un Service Producer KAFKA via un Rest Controler<br>
- Un Service Consumer KAFKA<br>
- Un Service Supplier KAFKA<br>
- Un Service de Data Analytics Real Time Stream Processing avec Kaflka Streams<br>
- Une application Web qui permet d'afficher les résultats du Stream Data Analytics en temps réel<br>
</p>
<h3>1. Lancer le serveur Zookeeper:</h3><br><br>

	 > bin\windows\zookeeper-server-start.bat config/zookeeper.properties
<h3>2. Lancer le Broker KAFKA :</h3><br>

     > bin\windows\kafka-server-start.bat config/server.properties
<h3>3. Lancer Kafka-console-consumer :</h3><br>

     > bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092
        --topic R4 --property print.key=true --property print.value=true
            --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer 
        --property value.deserializer=org.apache.kafka.common.serialization.StringDeserializer
<h3>4. Lancer kafka-console-producer :</h3><br>

     > bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic R4
<h3>==================  Docker ====================</h3><br>

Lancer docker:

	 > docker-compose up -d

     > docker exec --interactive --tty broker kafka-console-consumer --bootstrap-server broker:9092 --topic R2

     > docker exec --interactive --tty broker kafka-console-producer --bootstrap-server broker:9092 --topic R2

     > docker exec --interactive --tty broker kafka-console-consumer --bootstrap-server broker:9092 --topic R66 
        --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer 
        --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer

     > docker exec --interactive --tty broker kafka-topics --bootstrap-server broker:9092 --list

