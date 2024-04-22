pipeline {
  agent any 
  stages {
    stage('Build') {
      steps{
        sh "ls -ls"
      }
    }
  }
  post {
    always {
      echo "vsegda"
      deleteDir() // -workspace
    }
    aborted {
      echo "abort"
    }
    success {
      echo "+"
    }
    unstable {
      echo "not stable"
    }
    failure {
      echo ":("
    }
  }
}