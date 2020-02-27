package com.kodilla.patterns.Factory_11_4;

public class ShoppingTask implements Task {
    //  ShoppingTask o konstruktorze ShoppingTask(String taskName, String whatToBuy, double quantity)
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isExecuted = false;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}