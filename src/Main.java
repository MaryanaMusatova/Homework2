public class Main {
   //int i = 3645;  byte b = 121;  short s = -21876; long l = 655422345;  float g = 7.66f; double d = 156667.567878; float gs = 27.12F;
    //long bigCh=987 678 965 549; - выдает ошибку - "слишком большое число", хотя мной был выбран максимальный размер целочисленной переменной
    // float gsd = 2.786f; short ih = 569; short ij = -159; short it = 27897; byte bn = 67;

    static byte studentLp = 23;
    static byte studentAs = 27;
    static byte studentEa = 30;
    static int studentSum = studentLp + studentAs + studentEa;
    static int lis = 480 / studentSum;

    static byte powerMash=16/2;
    static int powerTime20=powerMash*20;
    static int powerSut=powerMash*24*60;
    static int powerSut3=powerSut*3;
    static int powerMonth=powerSut*31;

    static byte quantityClass=120/(2+4);
    static int colorWhite=quantityClass*2;
    static int colorBrown=quantityClass*4;

    static int sumBananas=80*5;
    static int sumMilk=105*2;
    static int sumIce=100*2;
    static int sumEggs=70*4;
    static int sumAll=sumBananas+sumMilk+sumIce+sumEggs;
    static int sumaKg=sumAll/1000;

    static int dayLonger=7000/250;
    static int dayShot=7000/500;
    static int dayMedium=(dayLonger+dayShot)/2;

    static int payMasha=67760+(67760/100)*10;
    static int payDenis=83690+(83690/100)*10;
    static int payKristy=76230+(76230/100)*10;
    static int difMasha=(payMasha*12)-(67760*12);
    static int difDenis=(payDenis*12)-(83690*12);
    static int difKristy=(payKristy*12)-(76230*12);


    public static void main (String[] args){

        System.out.println ("На каждого ученика рассчитано "+lis+" листов бумаги");
        System.out.println ("За 20 минут машина произвела "+powerTime20+" штук бутылок ");
        System.out.println ("За сутки машина произвела "+powerSut+" штук бутылок ");
        System.out.println ("За 3 дня машина произвела "+powerSut3+" штук бутылок ");
        System.out.println ("За месяц машина произвела "+powerMonth+" штук бутылок ");
        System.out.println ("В школе, где  "+quantityClass+" классов нужно "+colorWhite+" банок белой краски и "+colorBrown+" банок коричневой краски");
        System.out.println ("Вес завтрака спортсмена составляет "+sumAll+ " грамм( " + sumaKg+" килограмм) ");
        System.out.println ("При потере веса 250 грамм в день спортсмен будет худеть "+dayLonger+ " дней, при потере веса 500 грамм в день спортсмен будет худеть "+dayShot+" дней, в среднем спортсмен будет худеть "+dayMedium+" день");
        System.out.println ("Маша теперь получает "+payMasha+" рублей. Годовой доход вырос на "+difMasha+" рублей ");
        System.out.println ("Денис теперь получает "+payDenis+" рублей. Годовой доход вырос на "+difDenis+" рублей ");
        System.out.println ("Кристина теперь получает "+payKristy+" рублей. Годовой доход вырос на "+difKristy+" рублей ");



    }}