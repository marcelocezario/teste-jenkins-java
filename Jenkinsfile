pipeline {
    agent any
    tools {
        maven '3.9.9'
    }
    stages {
        stage ('Iniciando pipeline') {
            steps {
                echo 'Iniciando pipeline!'
            }
        }
        stage ('Executando testes automatizados') {
            steps {
                echo 'Executando testes automatizados'
                sh 'mvn test'
            }
        }
        stage ('Criando build da aplicação') {
            steps {
                echo 'Criando build!'
                sh 'docker compose build'
                sh 'docker compose up'
            }
        }
    }
}