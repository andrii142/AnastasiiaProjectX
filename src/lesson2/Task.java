package lesson2;

import java.util.Date;

public class Task {
    private int totalSolutions;
    private int successfultSolutions;

    private Date lastSubmit;
    private boolean isActive;

    void updateToDb() {
        System.out.println("updated!");
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getLastSubmit() {
        return lastSubmit;
    }

    public void setLastSubmit(Date lastSubmit) {
        this.lastSubmit = lastSubmit;
    }

    public int getSuccessfultSolutions() {
        return successfultSolutions;
    }

    public void setSuccessfultSolutions(int successfultSolutions) {
        this.successfultSolutions = successfultSolutions;
    }

    public void setSuccessfultSolutions() {
        this.successfultSolutions++;
    }

    public int getTotalSolutions() {
        return totalSolutions;
    }

    public void setTotalSolutions() {
        this.totalSolutions++;
    }

    public void setTotalSolutions(int totalSolutions) {
        this.totalSolutions = totalSolutions;
    }
}
