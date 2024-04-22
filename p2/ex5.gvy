pipeline {
  agent any
  environment {
    javaVersion = '/usr/var/java8'
  }
  stages {
    stage('Exmp usr/pswd') {
      environment {
        //SERVICE_CREDS = credentials('tomcat9Cred')
        SERVICE_CREDS = credentials('tomcat9')
      }
      steps{
        echo "Service user is ${SERVICE_CREDS_USR}"
        sh 'echo "PSWD IS $SERVICE_CREDS_PSW"'
      }
    }
    stage('Build') {
      steps{
        echo "====++++bild ${env.BUILD_ID} on ${env.JENKINS_URL}++++===="
        echo "====++++${env.javaVersion}++++===="
        echo "====++++${javaVersion}++++===="
        sh "printenv"
      }
    }
  }
}