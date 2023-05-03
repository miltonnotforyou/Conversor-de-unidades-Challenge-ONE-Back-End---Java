# Conversor de unidades Challenge ONE Back End Java
Um conversor em Java que converte moedas, unidades de temperatura, unidades de peso e unidades de velocidade
Esse projeto consiste em uma API que utiliza a cotação de moedas do Banco Central para converter um valor de uma moeda de origem para uma moeda de destino.
<img align=left src="https://i.imgur.com/P9fjzh4.png" height=150 alt="badge-challenge">

<h2 align=center>Challenge ONE Back End - Java</h2>

<div align=center>

<img height="80" margin="10" src="https://i.imgur.com/9Gq6RS0.png">
</div>

>## Sprint 01: Crie seu próprio conversor de moeda utilizando a linguagem Java.


As características solicitadas por nosso cliente são as seguintes:

O conversor de moeda deverá:

- Converter de Reais a Dólar
- Converter de Reais a Euro
- Converter de Reais a Libras Esterlinas
- Converter de Reais a Peso Argentino
- Converter de Reais a Peso Chileno
- Lembrando que deve ser possível também converter de forma inversa.

Para obter a cotação das moedas utilizei a API do Banco Central do Brasil:

[Documentação da API](https://dadosabertos.bcb.gov.br/dataset/dados-cadastrais-de-entidades-autorizadas/resource/8600cf18-b981-456c-9ed1-bddec2690b71)

[Buscador dos códigos das moedas](https://www3.bcb.gov.br/sgspub/localizarseries/localizarSeries.do?method=prepararTelaLocalizarSeries)

Como adicional eu implementei:

- Conversor de Unidades de peso
- Conversor de Unidades de velocidade
- Conversor de Unidades de temperatura

<br>



>## Pré-requisitos

    Java 8 ou superior
    Biblioteca gson-2.8.5.jar

>## Como utilizar

    Faça o download da biblioteca gson-2.8.5.jar

    Compile o arquivo ConversorDeMoedasApiBancoCentral.java utilizando o seguinte comando:

    bash

javac -cp "gson-2.8.5.jar" ConversorDeMoedasApiBancoCentral.java

Rode o programa utilizando o seguinte comando:

bash

    java -cp ".:gson-2.8.5.jar" ConversorDeMoedasApiBancoCentral

    Insira o valor a ser convertido, a moeda de origem e a moeda de destino quando solicitado.

>## Exemplo de uso

Insira o valor a ser convertido: 100
Insira a moeda de origem: Reais
Insira a moeda de destino: Dólares

Resultado: 100.00 reais = 19.32 dólares

>## Observações
Caso a moeda de origem seja Real, o valor é dividido pela cotação da moeda de origem para obter o valor na moeda de destino.
Caso a moeda de origem não seja Real, é obtida a cotação da moeda de origem em relação ao Real e em seguida é obtida a cotação da moeda de destino em relação ao Real. O valor é convertido primeiro para Reais e em seguida para a moeda de destino.
    
 > English:

# Unit Converter Challenge ONE Back End Java

A Java converter that converts currencies, temperature units, weight units, and speed units.
This project consists of an API that uses the exchange rate of currencies from the Central Bank to convert a value from a source currency to a destination currency.
<img align=left src="https://i.imgur.com/P9fjzh4.png" height=150 alt="badge-challenge">

<h2 align=center>Challenge ONE Back End - Java</h2>

<div align=center>

<img height="80" margin="10" src="https://i.imgur.com/9Gq6RS0.png">
</div>

    Sprint 01: Create your own currency converter using the Java language.

The features requested by our client are:

The currency converter should:

    Convert from Reais to Dollars
    Convert from Reais to Euros
    Convert from Reais to British Pounds
    Convert from Reais to Argentine Pesos
    Convert from Reais to Chilean Pesos
    Remembering that it should also be possible to convert in reverse.

To obtain the currency quotes, I used the API from the Central Bank of Brazil:

API Documentation

Currency Code Finder

As an additional feature, I implemented:

    Weight unit converter
    Speed unit converter
    Temperature unit converter

<br>

    Prerequisites

Java 8 or higher
gson-2.8.5.jar library

    How to use

Download the gson-2.8.5.jar library

Compile the file ConversorDeMoedasApiBancoCentral.java using the following command:

bash

javac -cp "gson-2.8.5.jar" ConversorDeMoedasApiBancoCentral.java

Run the program using the following command:

bash

java -cp ".:gson-2.8.5.jar" ConversorDeMoedasApiBancoCentral

Enter the value to be converted, the source currency, and the destination currency when prompted.

    Example of use

Enter the value to be converted: 100
Enter the source currency: Reais
Enter the destination currency: Dollars

Result: 100.00 reais = 19.32 dollars

    Remarks

If the source currency is Real, the value is divided by the exchange rate of the source currency to obtain the value in the destination currency.
If the source currency is not Real, the exchange rate of the source currency relative to the Real is obtained and then the exchange rate of the destination currency relative to the Real is obtained. The value is first converted to Reais and then to the destination currency.

## Resultado

![Conversor](https://user-images.githubusercontent.com/67373586/227186320-a5d64c8e-f069-4d2e-a299-117310e91c26.gif)

<br>

![image](https://user-images.githubusercontent.com/67373586/226997648-9a528198-992d-47bc-b78d-7a51fdb48641.png)
![image](https://user-images.githubusercontent.com/67373586/226997766-9077192d-84e7-4737-9932-1aad5691edc8.png)

<br>

![image](https://user-images.githubusercontent.com/67373586/226997950-4db4e518-6270-42bb-9626-df5d3074e9af.png)
![image](https://user-images.githubusercontent.com/67373586/226998178-0ce1baa2-c41a-472e-a1d1-08fed6ff6b37.png)


