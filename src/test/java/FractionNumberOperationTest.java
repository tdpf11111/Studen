import org.junit.Assert;

public class FractionNumberOperationTest {

    @org.junit.Test(expected = ArithmeticException.class)

    public void add1(){
       FractionNumberImpl  num1 = new FractionNumberImpl(3,4);
       FractionNumberImpl  num2 = new FractionNumberImpl(2,3);


        FractionNumberOperationImpl calcul = new FractionNumberOperationImpl();
        FractionNumberImpl resultWant = new  FractionNumberImpl(17,12);
        FractionNumber resultFact = calcul.add(num1,num2);
        Assert.assertEquals(resultWant,resultFact);


    }
    @org.junit.Test(expected = ArithmeticException.class)

    public void add2(){
        FractionNumberImpl  num1 = new FractionNumberImpl(3,4);
        FractionNumberImpl  num2 = new FractionNumberImpl(2,2);


        FractionNumberOperationImpl calcul = new FractionNumberOperationImpl();
        FractionNumberImpl resultWant = new  FractionNumberImpl(17,12);
        FractionNumber resultFact = calcul.add(num1,num2);
        Assert.assertEquals(resultWant,resultFact);


    }


    @org.junit.Test(timeout = 111)

    public void add3(){
        FractionNumberImpl  num1 = new FractionNumberImpl(3,4);
        FractionNumberImpl  num2 = new FractionNumberImpl(2,3);


        FractionNumberOperationImpl calcul = new FractionNumberOperationImpl();
        FractionNumberImpl resultWant = new  FractionNumberImpl(17,12);
        FractionNumber resultFact = calcul.add(num1,num2);
        Assert.assertEquals(resultWant,resultFact);


    }
}

