pipeline {
  agent none
  stages {
    stage('Build') {
      agent any
      steps{
        echo "bildos"
      }
    }
    stage('Test') {
      agent any
      steps {
        echo "testos"
      }
    }
  }
}