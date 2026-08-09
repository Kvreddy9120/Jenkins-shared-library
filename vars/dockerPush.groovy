def cell (String image_name, String tag) {
    withDockerRegistry([credentialsId: 'dockerhub']) {
        sh "docker push ${image_name}:${tag}"
    }
}
