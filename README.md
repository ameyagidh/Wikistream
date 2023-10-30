# Wikistream

# Wikimedia Real-Time Data Processing with Apache Kafka and Spring Boot

This project demonstrates how to build a real-time data processing system for consuming and producing Wikimedia data using Apache Kafka and Spring Boot microservices. It allows you to stream and process data from Wikimedia in a structured manner. This README provides an overview of the project's architecture, setup, and usage.

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
   cd your-repo
   ```
2. Install SQL and start the service
3. Install IntelliJ IDE

