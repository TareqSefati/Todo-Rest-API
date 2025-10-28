# Todo List Rest API - Spring Boot Project 

## Objectives:
- A complete guideline to deploy a Spring Boot Project as Backend for free.

## Used Platforms & Technologies:
- PostgreSQL Database - (Use https://neon.com/ site for free DB server)
- Docker - Create Docker Image that will be deployed.
- Use https://render.com/ - site where Docker Image will be uploaded.

## Database setup
- Create an account in https://neon.com/
- Create a project and a database inside that project.
- Then collect database url, username and password.

## Deployment Process
- Clone this project and load in IntelliJ IDEA
- Set environment variable before maven build
  - For LINUX OR MACOS use following commands to set environment variable in ide terminal
    - `export DATABASE_URL=<your database url>`
    - `export DATABASE_USERNAME=<your database username>`
    - `export DATABASE_PASSWORD=<your database password>`
    - `export FRONTEND_URL=<your frontend url>`
    - Use `./mvnw package` to build project.
  - For WINDOWS [COMMAND PROMPT] use following commands to set environment variable in ide terminal
    - `set DATABASE_URL=<your database url>`
    - `set DATABASE_USERNAME=<your database username>`
    - `set DATABASE_PASSWORD=<your database password>`
    - `set FRONTEND_URL=<your frontend url>`
    - Use `mvnw package` to build project.
  - For WINDOWS [POWERSHELL] use following commands to set environment variable in ide terminal
    - `$env:DATABASE_URL="<your database url>"`
    - `$env:DATABASE_USERNAME="<your database username>"`
    - `$env:DATABASE_PASSWORD="<your database password>"`
    - `$env:FRONTEND_URL="<your frontend url>"`
    - Use `./mvnw package` to build project.
- Docker commands to build docker image from Dockerfile & push in docker hub
  - `docker build -t <Your_docker_image_name> .`
  - `docker tag <Your_docker_image_name> <Your_docker_account_username>/<Your_docker_image_name>:latest`
  - `docker push <Your_docker_account_username>/<Your_docker_image_name>:latest`
- From Render dashboard Add new 'Web Service' & put docker hub url of existing image
- Add all environment variables from .env file & deploy project.

# Great! You have successfully deployed your project. 