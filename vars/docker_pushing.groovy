def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([
    usernamePassword(
        credentialsId: "dockerhubcred",
        usernameVariable: "DOCKER_USER",
        passwordVariable: "DOCKER_PASS"
    )
]) {
    sh "echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin"
}
}
