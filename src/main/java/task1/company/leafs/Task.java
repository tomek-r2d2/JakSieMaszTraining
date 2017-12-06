package task1.company.leafs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Task {

    private Employee assignedEmployee;

    private String desc;
    private LocalDate createdDate;
    private LocalDate  assignDate;
    private LocalDate  finishedDate;

    private boolean codeReviewed;
    private boolean isDone;
    private int progress;



    public Task(String desc) {
        this.assignedEmployee = null;
        this.desc = desc;
        this.createdDate = LocalDate.now();
        this.assignDate = null;
        this.finishedDate = null;
        this.codeReviewed = false;
        this.isDone = false;
        this.progress = 0;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }

    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(LocalDate assignDate) {
        this.assignDate = assignDate;
    }

    public LocalDate getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(LocalDate finishedDate) {
        this.finishedDate = finishedDate;
    }

    public boolean isCodeReviewed() {
        return codeReviewed;
    }

    public void setCodeReviewed(boolean codeReviewed) {
        this.codeReviewed = codeReviewed;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Task{" +
                "assignedEmployee=" + assignedEmployee +
                ", desc='" + desc + '\'' +
                ", createdDate=" + createdDate +
                ", assignDate=" + assignDate +
                ", finishedDate=" + finishedDate +
                ", codeReviewed=" + codeReviewed +
                ", isDone=" + isDone +
                ", progress=" + progress +
                '}';
    }
}
