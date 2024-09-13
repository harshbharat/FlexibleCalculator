# Flexible Calculator in Java
## Overview
This project is a flexible, extensible calculator implemented in Java. It supports basic arithmetic operations such as addition, subtraction, multiplication, and division, with the ability to easily extend it by adding new operations without modifying existing code.

## Prerequisites
Before running the project, ensure you have the following installed on your system:
- **Java 8+**: You need Java Development Kit (JDK) version 8 or higher.
- **Maven**: For building the project and running tests.
- **JUnit 5**: Used for testing.
## Getting Started
To Build this project : 
```bash
mvn clean install
````
To run the test cases : 
```bash
mvn test
````

## Endpoints
## 1. Endpoint: Calculate Chain Operation
**URL**: `http://localhost:8081/api/v1/calculator/calculate-chain-operation`

### Method: POST

### Request

#### Request Body Example:
```json
{
    "initialValue" : 12,
    "nums" : [
        1, 2, 3
    ],
    "operations" : [
        "ADD", "MULTIPLY", "DIVIDE"
    ]
}
```
#### Response
```json
{
    "data": 8.666666666666666,
    "error": null,
    "timeStamp": "02:11:40 13-09-2024"
}
```

## 2. Endpoint: Calculate Basic Operation
**URL**: `http://localhost:8081/api/v1/calculator/calculate`

### Method: POST

### Request

#### Request Body Example:
```json
{
    "num1" : 1,
    "num2" : 2,
    "operation" : "DIVIDE"
}
```
#### Response
```json
{
  "data": 0.5,
  "error": null,
  "timeStamp": "03:36:55 13-09-2024"
}
```