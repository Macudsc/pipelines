pipeline {
  agent any
  stages {
    stage('Build'){
      steps {
        echo "====++++pipel1++++===="
      }
    }
  }
}