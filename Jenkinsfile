pipeline {
    agent any
    stages {
        stage('Run Test') {
            steps {
                sh 'delivery/test.sh'
            }
        }
        stage('Build') {
            steps {
                sh 'delivery/build.sh'
            }
        }
        stage('Deploy') {
            steps {
                sh 'delivery/deploy.sh 5000'
            }
        }
    }
}