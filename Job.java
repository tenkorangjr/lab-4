public class Job {
    double arrivalTime;
    double processingTime;
    double currProcessedTime;
    double finishedTime;

    public Job(double arrivalTime, double processingTime) {
        this.arrivalTime = arrivalTime;
        this.processingTime = processingTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getTotalProcessingTime() {
        return processingTime;
    }

    public boolean isFinished() {
        return currProcessedTime == processingTime;
    }

    public double timeInQueue() {
        return finishedTime - arrivalTime;
    }

    public double getFinishTime() {
        return finishedTime;
    }

    public void setFinishTime(double time) {
        finishedTime = time;
    }

    public double getTimeProcessed() {
        return currProcessedTime;
    }

    public double getTimeRemaining() {
        return processingTime - currProcessedTime;
    }

}
