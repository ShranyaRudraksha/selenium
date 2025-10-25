pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven_3.9'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                git branch: 'main', url: 'https://github.com/ShranyaRudraksha/selenium.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Maven project...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                echo 'Running Selenium tests...'
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        success {
            echo '✅ Selenium Tests Passed!'
        }
        failure {
            echo '❌ Build or Tests Failed!'
        }
    }
}
