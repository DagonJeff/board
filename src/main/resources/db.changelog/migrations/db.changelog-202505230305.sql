-- liquibase formatted sql
-- chnageset junior: 202505230305
-- comment: boards table create

CREATE TABLE BOARDS(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name_board VARCHAR(255) NOT NULL
)ENGINE=InnoDB;

-- rolback DROP TABLE BOARDS