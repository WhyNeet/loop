CREATE TABLE "addresses" (
    id UUID PRIMARY KEY DEFAULT(uuid_generate_v4()),
    address_line_1 VARCHAR (255) NOT NULL,
    address_line_2 VARCHAR (255),
    city VARCHAR (255) NOT NULL,
    country VARCHAR (255) NOT NULL,

    user_id UUID NOT NULL,

    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users (id)
);