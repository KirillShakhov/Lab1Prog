class lab{

    public static void main(String[] args) {
        int n = 10;
        long[]e=new long[n];
        n=0;
        System.out.println("Создать одномерный массив a типа long. Заполнить его чётными числами от 4 до 18 включительно в порядке убывания.");
        for (long x = 4; x <= 18; x++) {
            if (x%2 == 0){
                e[n] = x;
                n++;
            }
        }
        for (int x = 0; x < n; x++) {
            System.out.println(e[x]);
        }
        System.out.println("Создать одномерный массив x типа double. Заполнить его 13-ю случайными числами в диапазоне от -3.0 до 4.0.");
        int l = 13;
        double[]x=new double[l];
        double a = -3.0f;
        double b = 4.0f;

        for (int z = 0; z < l; z++) {
            x[z] = a + (double) (Math.random() * b);
        }
        for (int z = 0; z < l; z++) {
            System.out.println(x[z]);
        }


        System.out.println(".............................");
        double[][]t=new double[8][13];

        System.out.println("........... 3...........");
        for (int i = 0; i < 8; i++){
            for(int j = 0; j<13; j++){
                if (e[i]==10){
                    t[i][j]=Math.pow(Math.pow(Math.tan(2/3)*(1-x[j]),3),2*Math.pow(0.5*Math.pow(x[j]-(1/2),x[j]),Math.sin(x[j])));
                }
                else if ((e[i]==6) || (e[i]==8) || (e[i]==12) || (e[i]==16)){
                    t[i][j]=Math.exp(Math.pow(Math.pow(Math.abs(x[j])/(Math.abs(x[j])+1),x[j])+1,Math.cos(Math.cos(x[j]))));
                }
                else{
                    t[i][j]=Math.pow((3/4)*Math.pow((1/2)*Math.pow(x[j]/2,Math.asin((x[j]+0.5)/7)),(2*Math.pow(Math.sin(x[j]),3)))
                            ,Math.asin(Math.pow(Math.E,-Math.abs(x[j]))-1)/Math.exp(Math.abs(x[j])*(2-Math.sin(x[j]))));
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for(int j = 0; j<13; j++){

                System.out.print(String.format("%.5f,", t[i][j]));

            }
            System.out.println();
        }
    }
}
class old {
    public static void main(String[] args) {
        //Создание массива e типа Short(16-разрядное целое число, от -32768 до 32767)
        int n = 10;
        short[] e = new short[n];
        //Заполнение массива нечетными числами от 6 до 24 в порядке убывания(числа типа short)
        for (short x = 24; x >= 6; x-=2) {
            e[12 - (x / 2)] = x;
        }
        //Создание массива
        n = 20;
        float[] x = new float[n];
        //Константы min и max
        final float min = -13.0f;
        final float max = 15.0f;
        //Заполнение массива рандомными числами от min до max
        for (int z = 0; z < n; z++) {
            x[z] = min + (float)Math.random() * (max - min);
        }
        //Создание двумерного массива d
        double[][]d=new double[10][20];
        String result;
        //*******************Заполнение массива d********************
        for (int i = 0; i < 10; i++){
            for(int j = 0; j<20; j++) {
                if (e[i] == 18) {
                    d[i][j] = Math.asin(0.25 * ((x[j] + 1) / 28));
                } else if ((e[i] == 10) || (e[i] == 12) || (e[i] == 14) || (e[i] == 20) || (e[i] == 24)) {
                    d[i][j] = Math.pow(Math.pow(Math.tan(x[j]) * (Math.pow((0.5 / x[j]), 3) - 1),
                            Math.asin((x[j] + 1) / 28)), 0.5 / (2 * Math.atan((x[j] + 1) / 28) + 2));
                } else {
                    d[i][j] = Math.pow(Math.E, Math.pow(Math.E, Math.pow((2.0f / 3.0f) / Math.pow(Math.E, x[j]), 3)));
                }
            }
        }
        //********************Формирование вывода********************
        System.out.println("___________________________________________________________________________Lab_1__Variant_1029___________________________________________________________________________");
        System.out.print("|       |");
        //Формирование нумерации Столбцов
        for (int g = 1; g <=20; g++){
            result = String.format("[%d] |", g);
            //Длина строки
            int length = result.length();
            //Удлинение строки
            if (result.length()<8){
                while(length<8){
                    result=" "+result;
                    length = result.length();
                }
            }
            System.out.print(result);
        }
        System.out.println();
        //Основной вывод + нумерация строк
        for (int i = 0; i < 10; i++){
            System.out.print("|");
            result = String.format("[%d]  |", i + 1);
            if (result.length()<8) {
                while (result.length() < 8) {
                    result = " " + result;
                }
            }
            System.out.print(result);
            for(int j = 0; j<20; j++){
                //Замена Infinity на Inf
                if(Double.isNaN(d[i][j])) {
                    result = "NaN  |";
                } else if(Double.isInfinite(d[i][j])) {
                    result = "Inf  |";
                } else {
                    result = String.format("%.2f |", d[i][j]);
                }
                //Удлинение строки до 8
                int length = 8;
                if (result.length()<length) {
                    while (result.length() < length) {
                        result = " " + result;
                    }
                }
                System.out.print(result);
            }
            System.out.println();
        }
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
    }
}

