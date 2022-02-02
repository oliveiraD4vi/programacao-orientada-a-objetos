pipeline {
  agent any
  stages {
    stage('Inicializar/Mensagem') {
      steps {
        echo 'Esta é a pipeline teste'
        mail(subject: '[Jenkins] Iniciando pipeline', body: 'Estamos iniciando a pipeline', to: 'oliveiradavi@alu.ufc.br')
      }
    }

  }
}