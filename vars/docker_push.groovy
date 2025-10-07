def call(string ProjectName, string ImageTag, string dockerhubcred){
  withCredentials([usernamePassword('credentialsId':"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker push ${env.dockerHubUser}/${ProjectName}:${ImageTag}
                }
}
