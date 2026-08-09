def cell (Strong image_name, String tag) {
    sh "docker build -t ${image_name}:${tag} ."
}