pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello Prem'
            }
        }
        stage('Hey') {
            steps {
                echo 'Hey Prem'
            }
        }
        stage('Info') {
            steps {
                echo 'What are you doing??'
            }
        }
        stage('Code') {
            steps {
                echo 'I am coding a software.'
            }
        }
        stage('Build') {
            steps {
                echo 'The software is being built now at this stage.'
            }
        }
        stage('Test') {
            steps {
                echo 'This is the testing stage of the software.'
            }
        }
        stage('Deployment') {
            steps {
                echo 'This software will be deployed on my birthday!'
            }
        }
    }
}
