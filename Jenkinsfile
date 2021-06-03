pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
              cmd_exec('gradle check')
            }
        }
    }
    post {
        always {
            junit 'build/reports/**/*.xml'
        }
    }
}
def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}
