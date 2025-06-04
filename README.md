# Sobre esse repositório
Atividades práticas relacionadas à disciplina Arquitetura de Software com Framework Java do curso de Especialização em Arquitetura de Software Distribuído, 2025, Oferta 9 - Turma 1

Professor: [Messias Bittencourt](https://github.com/mbittencourt)

PUC Minas

# Configuração do VS Code para desenvolver aplicações Java

- [Instruções para o setup do caminho do JDK](https://github.com/redhat-developer/vscode-java/wiki/JDK-Requirements#project-jdks)

Exemplo de configuração a ser inserida ou arquivo settings.json do usuário ou settings.json do Workspace apresentada na documentação:

```json
"java.configuration.runtimes": [
  {
    "name": "JavaSE-1.8",
    "path": "/path/to/jdk-8",
  },
  {
    "name": "JavaSE-11",
    "path": "/path/to/jdk-11",
  },
  {
    "name": "JavaSE-17",
    "path": "/path/to/jdk-17",
    "default": true
  },
]
```