pipeline {
    agent any
    stages {
        stage('aluno interface') {
            steps {
                build job: 'aluno-interface', wait: true
            }
        }
        stage('aluno') { 
            steps {
                sh 'mvn clean package'
            }
        }      
        stage('build image aluno') {
            steps {
                script {
                    account = docker.build("fernandowi55/aluno:${env.BUILD_ID}", "-f Dockerfile .")
                }
            }
        }
        stage('push image aluno') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credential') {
                        account.push("latest")
                        account.push("${env.BUILD_ID}")
                       
                    }
                }
            }
        }

        stage('Deploy on k8s') {
            steps {
                sh "kubectl apply -f ./k8s/aluno.yaml"
            }
        }

        
    }
}