def call(sting url, string branch){
  echo "this is cloning the code"
  git url: "${url}", branch: "${branch}"
  echo "Code cloned successfully"
}
