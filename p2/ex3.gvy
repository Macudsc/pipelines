pipeline {
  agent any
  stages {
    stage('Test') {
      steps{
        echo "testing"
      }
    }
    stage('Bulid') {
      steps{
        echo "buldong"
        sh "ls -l"
      }
    }
    stage('Deploy') {
      steps{
        echo "deploy to cntr"
      }
    }
  }
}