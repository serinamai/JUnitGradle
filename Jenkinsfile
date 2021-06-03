pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
              cmd_exec('gradle test')
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}
def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}
