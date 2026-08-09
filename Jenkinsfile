@Library('devops-shared-library') _
pipeline {
    agent any
    tools {
        maven 'mymaven'
    }
    stages {
        stage ("CheckoutCode") {
            steps {
                checkoutCode()
            }
        }
        stage ("MavenBuild") {
            steps {
                mavenBuild()
            }
        }
        stage ("DockerBuild") {
            steps {
                dockerBuild('kvreddy9120/jenkins-shared', "${BUILD_NUMBER}")
            }
        }
        stage ("DockerPush") {
            steps {
                script {
                    dockerPush('kvreddy9120/jenkins-shared', "${BUILD_NUMBER}")
                }
            }
        }
    }
}
