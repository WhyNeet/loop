CREATE TABLE IF NOT EXISTS "products" (
    id UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    name VARCHAR (255) NOT NULL UNIQUE,
    description VARCHAR (600) NOT NULL,
    variant_name VARCHAR (255) NOT NULL,
    price INTEGER NOT NULL,

    store_id UUID NOT NULL,

    CONSTRAINT fk_store FOREIGN KEY (store_id) REFERENCES stores (id)
);