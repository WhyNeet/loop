CREATE TABLE IF NOT EXISTS "stores" (
    id UUID PRIMARY KEY DEFAULT (uuid_generate_v4()),
    name VARCHAR (255) NOT NULL,
    banner_id UUID
);