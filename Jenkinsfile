pipeline {
  agent any
  stages {
    stage('Inicializar/Mensagem') {
      steps {
        echo 'Esta Ã© a pipeline teste'
        mail(subject: '[Jenkins] Iniciando pipeline', body: 'Estamos iniciando a pipeline', to: 'oliveiradavi@alu.ufc.br')
      }
    }

    stage('Test') {
      steps {
        echo 'Esse é o stage test'
        sleep(time: 10, unit: 'MINUTES')
      }
    }

  }
}