CREATE DATABASE IF NOT EXISTS tasks;
USE tasks;

DROP TABLE IF EXISTS task;

CREATE TABLE task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    expiration_date DATETIME NOT NULL,
    status ENUM('pending', 'in_progress', 'completed') DEFAULT 'pending',
    image_url VARCHAR(255) DEFAULT NULL
);
