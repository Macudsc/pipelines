pipeline {
    agent any
    triggers {
        cron('H */8 * * 1-5') //дали расписание + избегаем одновременнный запуск проектов
    }
    stages {
        stage('Build') {
            steps {
                echo 'Hello World(cron)'
            }
        }
    }
}
