def build(string ProjectName, string ImageTag, string dockerHubUser){
   sh "docker build -t "${dockerHubUser}"${ProjectName}":"${ImageTag}" ."

}
