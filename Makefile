install-frontend:
	cd frontend && npm install

run-backend:
	cd backend && mvn spring-boot:run

test-backend:
	cd backend && mvn test