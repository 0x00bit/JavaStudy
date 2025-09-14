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
        sh 'ls -la && javac "main.java"'
      }
    }

    stage('Test') {
      steps {
        sh 'java main'
      }
    }

  }
}