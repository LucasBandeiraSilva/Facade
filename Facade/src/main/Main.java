package main;

import main.facade.Facade;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Facade facade = Facade.getInstance();
        facade.gerarRelatorio();


    }
}
