public class Main {
    public static void main(String[] args) {
            var totalNumberOfJobs = 640;
            var oneWorkerWorking = 8;
            var totalNumberOfPeople = totalNumberOfJobs / oneWorkerWorking;
            System.out.println("Всего в компании работает" +totalNumberOfPeople + "человек");
            var newShots = 94;
           var totalNumbersOfHours = (totalNumberOfPeople + newShots );
            System.out.println("Общее колличество человек с новыми кадрами"+ totalNumbersOfHours );
            var totalWorkingHours = totalNumberOfJobs / totalNumbersOfHours;
            System.out.println("Общее число часов"+ totalWorkingHours + "Поделенное между всеми сотрудниками" );
            System.out.println("Если в компании работает"+ totalNumbersOfHours +"человек, то всего" + totalWorkingHours + "часов работы может быть поделено между сотрудниками»." );

    }
}