    create database checkBalance;

    CREATE TABLE public.accounts
    (
        id SERIAL PRIMARY KEY NOT NULL,
        currency VARCHAR(3) NOT NULL,
        balance NUMERIC NOT NULL,
        account VARCHAR(20) NOT NULL
    );
    CREATE UNIQUE INDEX accounts_id_uindex ON public.accounts (id);

    CREATE TABLE public.users
    (
        id SERIAL NOT NULL,
        cardNumber VARCHAR(16) NOT NULL,
        pin VARCHAR(4) NOT NULL,
        expDate VARCHAR(5) NOT NULL
        accounts_id INT PRIMARY KEY,
        CONSTRAINT users_accounts_id_fk FOREIGN KEY (accounts_id) REFERENCES accounts (id)
    );
    CREATE UNIQUE INDEX users_id_uindex ON public.users (id);
