pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
//               cmd_exec('gradle test')
              bat 'gradle test --no-daemon'
              junit '**/build/test-results/test/*.xml'
              returnStdout: true
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
// def cmd_exec(command) {
//     return bat(script: "${command}", returnStdout: true).trim()
// }
