mkdir -p ./build/classes/
javac -d build/classes src/*.java
javadoc src/*.java -d doc
jar -cfm MyHelloWord.jar MANIFEST.MF -C build/classes .
java -jar MyHelloWord.jar

