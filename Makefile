install-client:
	cd client/web && npm install

run-server:
	cd server && mvn spring-boot:run

test-server:
	cd server && mvn test