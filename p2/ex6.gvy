pipeline {
  agent any
  options {
    timestamps()
    buildDiscarder logRotator(
      daysToKeepStr: '3',
      numToKeepStr: '3'
      )
    timeout(time: 20, unit: 'MINUTES')
  }
  stages {
    stage('BUILD') {
      options {
        timeout(time: 1, unit: 'MINUTES')
      }
      steps{
        echo "build ${env.BUILD_ID} on ${env.JENKINS_URL}"
        sleep 100
      }
    }
  }
}