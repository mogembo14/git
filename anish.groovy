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
                import java.io.*;
    import java.util.Scanner;

    class GFG {
    public static void main (String[] args) {
      
        String str= "Geeks", nstr="";
        char ch;
      
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
            }
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
