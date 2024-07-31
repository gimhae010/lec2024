@echo off
mkdir dist
javac -cp src -d dist src/com/gimjae/Ex15.java
echo Main-Class: com.gimjae.Ex15 > mymanifest
rem jar cvf stu.jar -C dist .
jar cmvf mymanifest stu.jar -C dist .
del /s /f /q dist
rmdir /s /q dist
echo -------------------------------------------------
rem java -cp stu.jar com.gimjae.Ex15
java -jar stu.jar
echo -------------------------------------------------
pause