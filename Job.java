public class Job {
    double arrivalTime;
    double processingTime;
    double timeCompleted; // for finish time
    boolean jobComplete;

    public Job(double arrivalTime, double processingTime) {
        this.arrivalTime = arrivalTime;
        this.processingTime = processingTime;
        this.jobComplete = false;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getTotalProcessingTime() {
        return processingTime;
    }

    public boolean isFinished() {
        return jobComplete;
    }

    public double timeInQueue() {
        return timeCompleted - arrivalTime;
    }

    public double getFinishTime() {
        return timeCompleted;
    }

    public void setFinishTime(double time) {
        timeCompleted = time;
    }

}
