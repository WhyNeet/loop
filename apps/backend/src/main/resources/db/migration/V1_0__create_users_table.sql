CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    username VARCHAR (255) NOT NULL UNIQUE,
    password VARCHAR (1000) NOT NULL,
    email VARCHAR (255) NOT NULL UNIQUE,
    first_name VARCHAR (255),
    last_name VARCHAR (255),
    avatar_id UUID
);