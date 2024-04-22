pipeline {
    agent any
    tools {
        maven 'M3' // установка инструмента в агент
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
