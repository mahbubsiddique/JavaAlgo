NPM=node_modules/.bin
NPMDEPS=$(node_modules)

$(NPM): $(NPMDEPS)
	npm install

.PHONY: npm install clean serve test

install: $(NPM)

clean:
	rm -rf $$(cat .gitignore)

serve:
	mvn package
	java -cp target/example-percy-java-selenium-1.0-SNAPSHOT.jar io.percy.examplepercyjavaselenium.App

test: install
	$(NPM)/percy exec -v -- mvn test
