[![Build Status](https://travis-ci.org/pablohenriquemg/zup-git.svg?branch=master)](https://travis-ci.org/pablohenriquemg/zup-git)

# O que iremos precisar

  - Elipse - https://www.eclipse.org/neon/
  - JDK8 - http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html
  - Git - https://git-scm.com/downloads

## Passos

  - Criar usuario no https://github.com/ e dar permissao para cada usuario
  - Clonar projeto git
```sh
$ git clone https://github.com/pablohenriquemg/zup-git.git
```

  - Status da pasta git
```sh
$ git status
```

  - Trocar de branch
```sh
$ git checkout -b development
```

  - Rodar o projeto na maquina
  - Adicionar uma nova pessoa na lista
  - Checar as alteracoes com o git status
```sh
$ git status
```

  - Adicionar as alteracoes e preparar para realizar o commit
```sh
$ git add .
```

  - Realizar o commit e inserir uma mensagem com o nome da pessoa
```sh
$ git commit -m "commit do pablo"
```

  - Verificar se existe algum commit pendente para baixar
```sh
$ git remote update
```

  - Se sim, baixar o commit
```sh
$ git pull
```

  - Se necessario realizar o merge
```sh
$ git merge
```

  - Resolver merge, commit com as alteracoes
  - Realizar o push para brach remota
```sh
$ git push
```
