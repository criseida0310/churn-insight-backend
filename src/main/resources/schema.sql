CREATE TABLE clients (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  plan VARCHAR(50) NOT NULL,
  fecha_alta DATE
);

CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(100) UNIQUE NOT NULL,
  password_hash VARCHAR(255) NOT NULL,
  name VARCHAR(100),
  active BOOLEAN,
  created_at TIMESTAMP
);

CREATE TABLE roles (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE permissions (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE user_roles (
  user_id BIGINT,
  role_id BIGINT,
  PRIMARY KEY (user_id, role_id)
);

CREATE TABLE role_permissions (
  role_id BIGINT,
  permission_id BIGINT,
  PRIMARY KEY (role_id, permission_id)
);

CREATE TABLE user_client_access (
  user_id BIGINT,
  client_id BIGINT,
  access_level VARCHAR(20),
  PRIMARY KEY (user_id, client_id)
);
