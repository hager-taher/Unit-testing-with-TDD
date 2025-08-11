package stopwatch;

public class StopWatch {
    int minutes;
    int hours ;
    int days ;
    boolean isWorking ;
    public void record(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        }
        if(this.minutes >= 60){
             this.hours = this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
        int hoursPerDay = 24 ;
         if(isWorking) 
         hoursPerDay =8 ;

         if(this.hours >= hoursPerDay){
            this.days = this.hours / hoursPerDay ;
            this.hours = this.hours % hoursPerDay ;
         }
    }
    public void setIsWorking(boolean isWorking){
        this.isWorking = isWorking ;
    }

    public int getMinutes() {
        return minutes;
    }
    public int getHours(){
        return hours ;
    }
    public int getDays(){
        return days;
    }
}
