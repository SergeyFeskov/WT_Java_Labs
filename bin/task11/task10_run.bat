cd C:\Users\serge\source\WT\WT_Java_Labs\Lab1\src
javac .\task9\*.java
jar cfm task9.jar ..\task11\manifest.mf .\App.class .\model\Ball.class .\model\Basket.class .\model\Color.class .\service\BasketService.class
java -jar test.jar