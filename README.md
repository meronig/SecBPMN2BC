# SecBPMN2BC REST Service

SecBPMN2BC REST Service is a fork of the original SecBPMN2BC repository, aimed at wrapping the tools developed to support the method as a REST server. The original SecBPMN2BC repository can be found here: https://github.com/MattiaSalnitri/SecBPMN2BC

## Requirements
* Java 8

## Deployment with Docker

* Clone this repository, generate and deploy Docker images:

```
git clone https://github.com/meronig/secbpmn2bc-rest-service.git
cd secbpmn2bc-rest-service/deployment
docker-compose create
docker-compose start
```
* REST service APIs will be accessible on localhost at port 8080

# REST service APIs:
## /convert
Converts a process model from BPMN to SecBPMN2BC
* Request type: POST (Multipart)
* Input: BPMN model (file)
* Output: SecBPMN2BC model

## /check
Verifies if no conflicting annotations are present in a SecBPMN2BC model
* Request type: POST (Multipart)
* Input: SecBPMN2BC model (file)
* Output: text file containing analysis results

## /annotate
Identifies which elements of a SecBPMN2BC model could be moved on a blockchain
* Request type: POST (Multipart)
* Input: SecBPMN2BC model (file), whether or not to override existing annotations (override)
* Output: SecBPMN2BC model annotated with on-chain elements

## /updateModel
Merges anotations in a SecBPMN model to the original BPMN model
* Request type: POST (Multipart)
* Input: BPMN model (bpmnfile), SecBPMN2BC model (secbpmnfile) 
* Output: BPMN model annotated with on-chain elements

# Acknowledgements
Copyright © 2022-2024 Technical University of Denmark

Copyright of existing SecBPMN2BC portions © 2020-2021 Politecnico di Milano
