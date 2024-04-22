pipeline{
  agent any
  parameters {
    string(name: "NUKA", description: "Pls enter smth")
  }
  stages {
    stage('Build') {
      steps {
        echo "sfs: ${params.NUKA}"
      }
    }
    stage('Test') {
      steps {
        echo "${HOSTNAME}"
      }
    }
  }
}
/*
pipeline {
    agnet any
    parameters {
    }
    environment {
    }
    stages {
        stage ("Buld") {
        echo "Building......"
        sleep 1
        }
    }
    post {
        sh "ls"
    }
}
*/