pipeline {
    agent none
    stages {
        stage('Build & Test') {
            matrix {
                agent any
                axes { //значения для этапов
                    axis {
                        name 'SERVERS'
                        values 'DEV-1', 'TEST-2'
                    }
                    axis {
                        name 'BROWSER'
                        values 'firefox', 'chrome', 'edge'
                    }
                }
                excludes { //исключить определенную комбинацию значений
                    exclude {
                        axis {
                            name 'SERVERS'
                            values 'DEV-1'
                        }
                        axis {
                            name 'BROWSER'
                            values 'chrome', 'edge'
                        }
                    }
                }
                stages { // по всему множеству значений
                    stage('Build') {
                        steps {
                            echo "Do Build for ${SERVERS} - ${BROWSER}"
                        }
                    }
                    stage('Test') {
                        steps {
                            echo "Do Test for ${SERVERS} - ${BROWSER}"
                        }
                    }
                }
            }
        }
    }
}
