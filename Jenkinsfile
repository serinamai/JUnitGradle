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
//             junit 'build/test-results/**/*.xml'
            junit allowEmptyResults: true, testResults: 'build/test-results/**/*.xml', keepLongStdio: true
        }
    }
}
def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}
