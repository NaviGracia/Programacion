package Ejercicio06;

public class App {
    public static void main(String[] args) {
        Avestruz a = new Avestruz();
        a.puedeCaminar();
        Gato g = new Gato();
        g.puedeCaminar();
        g.puedeNadar();
        Loro l = new Loro();
        l.puedeCaminar();
        l.puedeVolar();
        Murcielago m = new Murcielago();
        m.puedeCaminar();
        m.puedeVolar();
        Tigre t = new Tigre();
        t.puedeCaminar();
        t.puedeNadar();
    }
}
