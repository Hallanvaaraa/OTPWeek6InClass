pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Hallanvaaraa/OTPWeek6InClass.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
