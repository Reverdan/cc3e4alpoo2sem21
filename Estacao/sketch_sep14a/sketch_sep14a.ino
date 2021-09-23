#include <dht.h>
int pinoDHT11 = 2;
int pinoSensorChuva = A0;
int valorChuva = 0;
dht DHT;

void setup() 
{
  Serial.begin(9600);
  Serial.println("Comunicação Estação Meteorológica");
  delay(2000);
}

void loop() 
{
  DHT.read11(pinoDHT11);
  valorChuva = analogRead(pinoSensorChuva);
  Serial.print("Umidade: ");
  Serial.print(DHT.humidity);
  Serial.print("%");
  Serial.print(" | Temperatura: ");
  Serial.print(DHT.temperature,0);
  Serial.print("ºC");
  Serial.print(" | Precipitação: ");
  Serial.println(valorChuva);
  delay(2000);
}
