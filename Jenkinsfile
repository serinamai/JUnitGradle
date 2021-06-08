pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
              sh(returnStdout: true, script: 'gradle clean test > logs.txt')
//               echo readFile('logs.txt')
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
    return bat(returnStdout:true , script: command).trim()
}
