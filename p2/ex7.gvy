pipeline {
  agent any
  parameters {
    string(
      name: 'NAME',
      defaultValue: 'Van',
      description: 'Your name'
    )
    string(
      name: 'SURNAME',
      defaultValue: 'Vanos',
      description: ''
    )
    text(
      name: 'MESSAGE',
      defaultValue: '',
      description: 'Some info'
    )
    booleanParam(
      name: 'DO_IT',
      defaultValue: true,
      description: '.......'
    )
    choice(
      name: 'CHOICE',
      choices: ['one', '2', 'three'],
      description: 'pick!'
    )
    password(
      name: 'PASSWORD',
      defaultValue: 'SECRET',
      description: 'Enter pswd'
    )
  }
  stages {
    stage('Example') {
      steps{
        echo "qq ${params.NAME}"
        echo "Bio ${params.SURNAME}"
        echo "Toggle ${params.DO_IT}"
        echo "Choice ${params.CHOICE}"
        echo "Pswd ${params.PASSWORD}"
        sh "printenv"
      }
    }
  }
}