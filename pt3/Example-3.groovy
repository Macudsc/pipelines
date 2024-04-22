pipeline {
    agent any
    stages {
        stage('Example') {
            input { // Добавляем запрос на ввод
                message 'Will you continue?' // сообщение
                ok 'Yes, we should.' // надпись на кнопке

                parameters { // добавили параметр в окно ввода (ни на что не влияет в данном случае)
                    choice(
                        name: 'CHOICE',
                        choices: ['Yes', 'No'],
                        description: 'yes or no?'
                    )
                }
            }
            steps {
                echo "Your selected: ${CHOICE}"
            }
        }
    }
}
