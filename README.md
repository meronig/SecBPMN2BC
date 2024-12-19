# Welcome to the SecBPMN2BC page!

SecBPMN2BC is a method created to support the design of *secure business processes* to be executed in blockchain. It is composed of a modelling language, a suggested workflow and a software tool that partially support the workflow by identifying conflicts and the part of the busines process that can be executed in blockchain.

This is a fork of the original SecBPMN2BC repository, aimed at wrapping the tools developed to support the method as a REST server. The original SecBPMN2BC repository can be found here: https://github.com/MattiaSalnitri/SecBPMN2BC

## Requirements
* Java 8

## Installation and set-up instructions 
1. Download the last SecBPMN2BC zip file from here: https://github.com/MattiaSalnitri/SecBPMN2BC/releases
2. Copy the zip file inside Eclipse root directory and expand it there.
3. Start Eclipse
4. check if the plugin is installed: verify (do not click) if in the *File* -> *New* exists an element *SecBPMN2BC model*
5. Open SecBPMN2BC perspective: *Window* -> *Perspective* ->  *Open Perspective * -> *Other* -> *Secbpmn2bc

## Deployment with Docker

* Clone this repository, generate and deploy Docker images:

```
git clone https://github.com/meronig/SecBPMN2BC.git
cd SecBPMN2BC/deployment
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
