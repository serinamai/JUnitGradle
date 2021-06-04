pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
              cmd_exec('gradle test')
              echo off
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
//        stdout = bat(returnStdout:true , script: command).trim()
//        result = stdout.readLines().drop(1).join(" ")
//        return result
    return bat(script: "${command}", returnStdout: true).trim()
}
