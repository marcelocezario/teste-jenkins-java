pipeline {
    agent any
    stages {
        stage ('Iniciando pipeline') {
            steps {
                sh 'Iniciando pipeline!'
            }
        }
        stage('Preparar Ambiente') {
            steps {
                echo 'Preparando o ambiente...'
                checkout scm
            }
        }
    }
}