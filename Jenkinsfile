pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Hallanvaaraa/OTPWeek6InClass.git'
            }
        }
        stage('Build') {
            steps {
                bat 'clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'test'
            }
        }
    }
}
