pipeline {
    agent any
    stages {
        stage('Preparação') {
            steps {
                echo 'Preparando ambiente...'
                checkout scm
            }
        }
        stage('Compilar') {
            steps {
                echo 'Compilando o código...'
                sh './mvnw clean compile'
            }
        }
        stage('Testar') {
            steps {
                echo 'Executando os testes...'
                sh './mvnw test'
            }
        }
        stage('Construir') {
            steps {
                echo 'Construindo o artefato...'
                sh './mvnw package -DskipTests'
            }
        }
        stage('Rodar Aplicação') {
            steps {
                echo 'Iniciando a aplicação...'
                sh 'java -jar target/*.jar'
            }
        }
    }

    post {
        always {
            echo 'Pipeline concluída.'
        }
        success {
            echo 'Pipeline executada com sucesso!'
        }
        failure {
            echo 'A pipeline falhou.'
        }
    }
}
