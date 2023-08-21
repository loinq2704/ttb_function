pipeline {
    agent any
    stages {
        stage('Deploy') {
            when { tag "release-*" }
            steps {
                echo 'Deploying only because this commit is tagged...'
            }
        }
    }
}