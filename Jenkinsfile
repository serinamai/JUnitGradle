pipeline {
    agent any
    
    parameters {
        string(
                name: 'BRANCH_NAME',
                defaultValue: 'master',
                description: 'Select branch i.e. my_feature_branch'
        )
        choice(
                name: 'ENVIRONMENT',
                choices: [
                        'sit',
                        'pre',
                        'dev'
                ],
        )
    }
    stages {
        stage('Test') {
            steps {
//               cmd_exec('gradle test')
              sh(returnStdout: true, script: 'gradle clean test > logs.txt')
              echo readFile('logs.txt')
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
