def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
                }
}
