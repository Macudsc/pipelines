pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    echo 'script..'
                    def libLoop = load 'shared_libz/utils/loop.groovy'
                    libLoop.getInfoGit('https://github.com/elestopadov/jenkins-course-example.git')
                    libLoop.loopMethod()

                    libLoop.getInfoGitBranch('https://github.com/elestopadov/jenkins-course-example.git')
                }
            }
        }
    }
}
