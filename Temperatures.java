

public class Temperatures {
 
    public static void main (String[] args) {
        int tempGrid[][] = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};
        String days[] ={"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String times[] = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};
        
        float overallTotal = 0;
        float avgPerDay[] = new float [7];
        float avgPerTime[] = new float [4];
        //float avgDay = 0f;
        //float avgTime = 0f;

        System.out.println("Temperature Chart");
        System.out.print("         ");
        for (int index=0; index<days.length; index++) {
            System.out.print(days[index] + " ");
        }
        System.out.print("\n");
        for (int timeIndex=0; timeIndex<times.length; timeIndex++) {
            System.out.print(times[timeIndex] + "   ");
            for (int dayIndex=0; dayIndex<days.length; dayIndex++) {
                System.out.print(tempGrid[timeIndex][dayIndex] + "  ");
            }
            System.out.print("\n");
        }
        
        //average temp for each day
        System.out.println("\nAverage Temperature for each day of the week: ");
        for (int dayIndex=0; dayIndex<days.length; dayIndex++) {
            float dayTotal = 0;
            for (int timeIndex=0; timeIndex<times.length; timeIndex++) {
                dayTotal= dayTotal + tempGrid[timeIndex][dayIndex];
            }
            avgPerDay[dayIndex] = dayTotal / times.length;
            System.out.println(days[dayIndex] + ": " + avgDay);
            //avgDay = dayTotal / times.length;
            //System.out.println(days[dayIndex] + ": " + avgDay);
        }
        
        //average temp for each time
        System.out.println("\nAverage Temperature for each time: ");
        for (int timeIndex=0; timeIndex<times.length; timeIndex++) {
            float timeTotal = 0;
            for (int dayIndex=0; dayIndex<days.length; dayIndex++) {
                timeTotal = timeTotal + tempGrid[timeIndex][dayIndex];
                //System.out.print(timeTotal + " ");
            }
            //System.out.print("\n");
            avgPerTime[timeIndex] = timeTotal / days.length;
            System.out.println(times[timeIndex] + ": " + avgPerTime[timeIndex]);
            overallTotal = avgPerTime[timeIndex] + overallTotal;
            //avgTime = timeTotal / days.length;
            //System.out.println(times[timeIndex] + ": " + avgTime);
            //overallTotal = avgTime + overallTotal;
        }
                
        //overall average temp
        float overallAvg = overallTotal / times.length;
        System.out.println("\nThe overall average temperature is : " + overallAvg);
    }
}
