# 🛒 E-commerce API - Spring Boot

API REST para simulação de um sistema de e-commerce.

---

## 🚀 Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA + Hibernate
- H2 Database
- Lombok
- Postman (testes)

---

## ⚙️ Funcionalidades
- CRUD completo de usuários
- Modelagem de domínio (Produto, Categoria, Pedido, OrderItem, Pagamento)
- Relacionamentos entre entidades
- Cálculo automático do total do pedido
- Banco de dados em memória com dados iniciais

---

## ▶️ Como executar
1. Clonar o projeto  
2. Executar a classe principal  
3. Acessar:
http://localhost:9090/users

---

## 📡 Endpoints principais
- GET /users → Lista todos os usuários  
- GET /users/{id} → Busca por ID  
- POST /users → Cria usuário  
- PUT /users/{id} → Atualiza usuário  
- DELETE /users/{id} → Remove usuário  

---

## 🗄️ H2 Console
http://localhost:9090/teste-h2

JDBC: jdbc:h2:mem:testdb  
User: sa  
Password: (vazio)
