public class Main {
    public static void main(String[] args) {
var liftingCompasity = 50;
var stuffWeigt = 20;
var capacityLeft = liftingCompasity - stuffWeigt;
        System.out.println("еще можно положить" + capacityLeft + "кг вещей");
        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitsWeight = appleWeight + orangeWeight;
        System.out.println(" Общий вес фруктов " + fruitsWeight);
        var meatWeight = 4;
        var waterWeight = 5;
        var tomatesWeight = 2;
        var cucumbesWeight = 2;
        var peppersWeight = 2;
        var zuchiniWeigth = 2;
        var vegetablesWeight = tomatesWeight + cucumbesWeight + peppersWeight + zuchiniWeigth;
        var produktsweights = fruitsWeight  + vegetablesWeight + meatWeight + waterWeight;
        System.out.println(" Общий вес фруктов " + produktsweights +"кг!");
        var leftWeigth = liftingCompasity - stuffWeigt - produktsweights;
            System.out.println("Места осталось " + leftWeigth + "кг!");
            produktsweights = produktsweights * 2;
            System.out.println("Теперь вес продуктов " + produktsweights);
        leftWeigth = liftingCompasity - stuffWeigt - produktsweights;
        System.out.println("Теперь места осталось " + leftWeigth + "кг!");
        var overLoard = ( stuffWeigt + produktsweights ) % liftingCompasity;
        System.out.println("Перегруз на" + overLoard + "кг!");
        var productsInOneCar = produktsweights / 2;
        System.out.println("Продуктов в одной машине" + productsInOneCar + "кг!");
    }
}