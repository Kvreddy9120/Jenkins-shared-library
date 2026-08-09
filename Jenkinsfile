@Library('devops-shared-library') _

pipeline {
    agent any

    tools {
        maven 'mymaven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkoutCode()
            }
        }

        stage('Build') {
            steps {
                mavenBuild()
            }
        }

        stage('Image') {
            steps {
                dockerBuild("kvreddy9120/jenkins-shared", "myapp")
            }
        }

        stage('Push') {
            steps {
                script {
                    dockerPush("kvreddy9120/jenkins-shared", "myapp")
                }
            }
        }
    }
}
