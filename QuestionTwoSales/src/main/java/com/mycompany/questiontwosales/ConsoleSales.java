package com.mycompany.questiontwosales;

public class ConsoleSales extends Consoles {

    // Constructor passing parameters to superclass
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Method to display the report
    public void printReport() {
        System.out.println("==========================================");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("==========================================");
        System.out.println("Console Device Type : " + getConsoleType());
        System.out.println("Store Name          : " + getStore());
        System.out.println("Total Amount Sales  : " + getTotalSales());
        System.out.println("==========================================");
    }
}