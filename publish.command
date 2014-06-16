cd ~/Documents/Git/Obskewer/
cd bin
rm Obskewer-snapshot.jar
cd ..
cd src
javac -d . -sourcepath . Algorithm/Misc.java
javac -d . -sourcepath . Algorithm/Debug.java
javac -d . -sourcepath . Algorithm/ClassicShift.java
javac -d . -sourcepath . Algorithm/TrueCaesar.java
javac -d . -sourcepath . Algorithm/Morse.java
javac -d . -sourcepath . Algorithm/Numbers.java
javac -d . -sourcepath . Algorithm/Skip.java
javac -d . -sourcepath . Obskewer.java
jar cfm ../bin/Obskewer-snapshot.jar Manifest.txt Obskewer.class Algorithm/*.class

cd ~/Documents/Git/Obskewer/src/
rm *.class
cd Algorithm
rm *.class
