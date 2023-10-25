package eje13;

import java.util.concurrent.TimeUnit;

public class eje13 {
    public static void main(String[] args)throws InterruptedException {
        int horas;
        int minutos; 
        int segundos;
        String borraAnterior = "\b\b\b\b\b\b\b\b";
        for(horas = 0; horas<=23; horas++){
            for(minutos = 0; minutos<=59; minutos++){
                for(segundos = 0; segundos<=59; segundos++){
                    System.out.printf("%02d:%02d:%02d",horas,minutos,segundos);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(borraAnterior);
                }
            }
        }
    }
}