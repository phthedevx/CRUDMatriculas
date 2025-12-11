# 📚 Sistema de Gestão de Matrículas (CRUD)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## 🎯 Objetivo
Projeto desenvolvido para praticar a implementação de operações **CRUD** (Create, Read, Update, Delete) com foco em **Testes Unitários** e **Regras de Negócio**.
O sistema simula o gerenciamento de matrículas de alunos em cursos, garantindo a integridade dos dados acadêmicos.

## ⚙️ Funcionalidades e Regras
O sistema gerencia as seguintes entidades e validações:

### 🧑‍🎓 Aluno
- Cadastro com validação de documentos e idade.
- **Regra:** Não permite cadastro de alunos com dados nulos ou vazios.

### 🏫 Curso
- Gerenciamento de cursos disponíveis.
- **Regra:** Validação de carga horária e nomes de cursos.

### 📝 Matrícula
- Associação entre Aluno e Curso.
- **Regra de Ouro:** O sistema impede duplicidade de matrículas (o mesmo aluno não pode se matricular duas vezes no mesmo curso).
- Geração de número de matrícula único.

## 🧪 Cobertura de Testes (JUnit 5)
Este projeto foca na qualidade de código através de testes automatizados:
- **Testes de Sucesso:** Validação dos fluxos normais de cadastro e leitura.
- **Testes de Exceção:** Garantia de que o sistema bloqueia dados inválidos (`assertThrows`).
- **Testes de Integração (Mock):** Validação da interação entre Aluno e Matrícula.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **JUnit 5**
- **Maven** (Gerenciamento de dependências)
- **Git/GitHub** (Versionamento)

## 📂 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/phthedevx/CRUDMatriculas.git](https://github.com/phthedevx/CRUDMatriculas.git)
