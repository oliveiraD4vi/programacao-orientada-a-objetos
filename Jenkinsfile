pipeline {
  agent any
  stages {
    stage('Inicializar/Mensagem') {
      steps {
        echo 'Esta é a pipeline teste'
        mail(subject: '[Jenkins] Iniciando pipeline', body: 'Estamos iniciando a pipeline', to: 'oliveiradavi@alu.ufc.br')
      }
    }

    stage('Test') {
      steps {
        echo 'Esse � o stage test'
        sleep(time: 10, unit: 'MINUTES')
      }
    }

  }
}