public class Main {
    public static void main(String[] args) {
             var weightOfOneFigters = 78.2;
             var weightOfTwoSecondFighters = 82.7;
             var TotalWeightOfTwoFigters = weightOfOneFigters + weightOfTwoSecondFighters;
        System.out.println("Общий вес двух бойцов" + TotalWeightOfTwoFigters  + "кг!" );
        var weightDifferenceBetweenTwoFighters = weightOfTwoSecondFighters - weightOfOneFigters;
            System.out.println("Разница веса между бойцами" + weightDifferenceBetweenTwoFighters  + "кг!" );
            var wightDifference = weightOfTwoSecondFighters % weightOfOneFigters;
            System.out.println("Разница веса между бойцами" + wightDifference + "кг!" );
    }
}