install-client:
	cd client/web && npm install

run-server:
	cd server && gradle bootRun

test-server:
	cd server && gradle test