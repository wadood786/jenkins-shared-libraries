
def call (){
  sh "trivy fs . -skip-db-update --severity HIGH,CRITICAL"

}
