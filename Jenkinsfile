pipeline {
    agent any
        environment {
                PATH = "C:\\Program Files\\Docker\\Docker\\resources\\bin;${env.PATH}"
                DOCKERHUB_CREDENTIALS_ID = 'Docker_Hub'
                DOCKERHUB_REPO = 'meemmi/inclass'
                DOCKER_IMAGE_TAG = 'latest'
            }
    tools {
    maven 'Maven1'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/meemmi/InClassAssignment.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }

        // create docker image from docker file
        // push docker image to docker hub
    }
}