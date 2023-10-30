# Wikistream

## Wikimedia Real-Time Data Processing with Apache Kafka and Spring Boot

This project demonstrates how to build a real-time data processing system for consuming and producing Wikimedia data using Apache Kafka and Spring Boot microservices. It allows you to stream and process data from Wikimedia in a structured manner. This README provides an overview of the project's architecture, setup, and usage.

## Images
### SpringBoot Producer
<img width="1496" alt="Screenshot 2023-10-30 at 4 20 04 AM" src="https://github.com/ameyagidh/Wikistream/assets/65457905/989544a6-2925-46b8-bf72-848d670bee2b">

### SpringBoot Consumer
<img width="1496" alt="Screenshot 2023-10-30 at 4 20 28 AM" src="https://github.com/ameyagidh/Wikistream/assets/65457905/f6c343a7-8572-4780-8ad7-3096077b48ac">

### SQL DataBase stores wiki data 
<img width="773" alt="Screenshot 2023-10-30 at 4 22 47 AM" src="https://github.com/ameyagidh/Wikistream/assets/65457905/19dd80e2-0389-4b53-8d26-83bf0df3b30d">

### Apache Kafka Consumer and Producer
<img width="1496" alt="Screenshot 2023-10-30 at 4 25 30 AM" src="https://github.com/ameyagidh/Wikistream/assets/65457905/fb597389-f44c-4fdb-b3b1-31030459507d">


## Table of Contents
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)


## Architecture

The project is built around the following components:

- **Kafka Producer**:
  - A Spring Boot microservice responsible for fetching real-time Wikimedia data and publishing it to a Kafka topic.

- **Kafka Consumer**:
  - Another Spring Boot microservice that subscribes to the Kafka topic and processes the incoming Wikimedia data.

- **Zookeeper**:
  - Used for managing the Kafka brokers.

The architecture follows a publish-subscribe pattern with Apache Kafka as the message broker. Wikimedia data is fetched from the internet and pushed to a Kafka topic by the producer. The consumer processes and analyzes the data as required.

## Technologies Used

- Apache Kafka: A distributed streaming platform for building real-time data pipelines.
- Spring Boot: A Java-based framework for building microservices.
- Zookeeper: A distributed configuration and synchronization service for managing Kafka.

## Setup

To set up this project, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/ameyagidh/Wikistream.git
   cd springbootkafka
   ```
2. Install SQL and start the service
3. Install IntelliJ IDE

