pipeline {
    agent any
    stages {
        stage ('Iniciando pipeline') {
            steps {
                sh 'Iniciando pipeline!'
            }
        }
        stage('Executando testes automatizados') {
            steps {
                sh 'Executando testes automatizados'
                mvn test
            }
        }
    }
}