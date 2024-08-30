pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello Anish'
            }
        }
        stage('Hey') {
            steps {
                echo 'Hey Anish'
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
                int x = 5;
int y = 6;
int sum = x + y;
System.out.println(sum);
            }
                
        stage('Test') {
            steps {
                echo 'This is the testing stage of the software.'
            }
        }
        stage('Deployment') {
            steps {
                echo 'The software is being deployed'
            }
        }
    }
}
