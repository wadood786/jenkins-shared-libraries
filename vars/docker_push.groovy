def call(string ProjectName, string ImageTag, string dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
                }
}
