pipeline {
  agent any
  stages {
    stage('Clone') {
      steps {
        git(url: 'https://github.com/0x00bit/JavaStudy.git', branch: 'dev')
      }
    }

    stage('Build') {
      steps {
        sh 'sh "javac main.java"'
      }
    }

    stage('Test') {
      steps {
        sh 'sh "java main"'
      }
    }

  }
}