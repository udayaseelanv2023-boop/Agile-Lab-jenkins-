pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Checkout Source Code') {
            steps {
                git branch: 'main', url: 'https://github.com/rosan12052006-collab/agile-lab-jenkins.git'
            }
        }

        stage('Build Application') {
            steps {
                bat 'javac StudentResult.java'
            }
        }

        stage('Execute Application') {
            steps {
                bat 'java StudentResult'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: '*.class', fingerprint: true
            echo 'Pipeline Executed Successfully. Artifact Stored.'
        }

        failure {
            echo 'Build Failed. Please Check Errors.'
        }
    }
}