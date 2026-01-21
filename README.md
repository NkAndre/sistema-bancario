##  SISTEMA BANCÁRIO EM JAVA ☕ 💰(POO)

Projeto pessoal desenvolvido em Java com foco em **Programação Orientada a Objetos**, simulando as operações básicas de um sistema bancário via console.

O objetivo do projeto é **praticar arquitetura, separação de responsabilidades e regras de negócio**, não interface gráfica.

---

## 📌 Funcionalidades

- Criar cliente
- Depositar valor
- Sacar valor
- Transferir entre contas
- Consultar saldo
- Exibir histórico de operações
- Menu interativo via console

---

## 🧱 Estrutura do Projeto

O projeto segue uma separação clara de responsabilidades:

- **model**
  - `Pessoa` → dados básicos (nome, CPF, RG, data de nascimento)
  - `Cliente` → herda de Pessoa e possui conta, saldo e histórico

- **service**
  - `BancoService` → regras de negócio (depósito, saque, transferência, consultas)

- **app**
  - `Menu` → interação com o usuário (console)
  - `Main` → ponto de entrada da aplicação

---

## 📊 Diagrama de Classes

O projeto foi modelado previamente com diagrama de classes (UML), reforçando o design orientado a objetos.

  <img width="770" height="691" alt="diagrama" src="https://github.com/user-attachments/assets/57613bbc-4be4-4ba6-9d63-674d71998e6b" />


---

## 🛠️ Tecnologias Utilizadas

<Center>-<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/></Center>


---

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
