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
                echo 'Executando testes automatizados'
                mvn test
            }
        }
    }
}