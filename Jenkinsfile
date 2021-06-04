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
            junit keepLongStdio: true,
            testResults: 'build/test-results/test/*.xml'
        }
    }
}
def cmd_exec(command) {
    return bat(script: "${command}", returnStdout: true).trim()
}
