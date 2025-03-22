# quran-api

An api for Quranic verses etc built using spring boot and postgresql

## Setup

Ensure that you have `Docker` and a `PostgreSQL` client installed.

Run the following to start up the database.

```bash
./spin_up_db.sh
```

Then start the application by running:

```bash
cd quranapi

./mvnw spring-boot:run
```
