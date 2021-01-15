Readme

Kebutuhan aplikasi :
1. DB : Postgresql
	a. Nama DB : gtech2
	b. Username : postgres
	c. Password : postgres
2. Java 8

Cara menjalankan aplikasi :
1. Buka cmd pada path aplikasi, lalu ketik : mvn spring-boot:run

2. Setelah itu, run query berikut pada DB:
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');


List API :

1. localhost:8080/api/auth/public/signup
	Keterangan : untuk registrasi member baru
	Method : POST
2. localhost:8080/api/auth/public/signin
	Keterangan : untuk login ke system
	Method : POST
3. localhost:8080/api/auth/user/update
	Keterangan : untuk update data user
	Method : PUT
4. localhost:8080/api/auth/user/{id}
	Keterangan : untuk mengambil data user berdasarkan ID user
	Method : GET
5. localhost:8080/api/product/product?productName=
	Keterangan : untuk mengambil data product berdasarkan productName
	Method : GET
6. localhost:8080/api/product/product
	Keterangan : untuk registrasi product baru
	Method : POST
