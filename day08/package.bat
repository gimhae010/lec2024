@echo off
mkdir dist
javac -cp src -d dist src/com/gimjae/Ex14.java
echo Main-Class: com.gimjae.Ex14 > mymanifest
rem jar cvf day08.jar -C dist .
jar cmvf mymanifest day08.jar -C dist .
del /s /f /q dist
rmdir /s /q dist
echo -------------------------------------------------
rem java -cp day08.jar com.gimjae.Ex14
java -jar day08.jar
echo -------------------------------------------------
pause