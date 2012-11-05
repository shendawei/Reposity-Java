package com.shendw.jar;

public class DataConvertion
{
    /*public static DataConvertion m_dataConvertion;

    public static void main(String[] arg)
    {
        m_dataConvertion = new DataConvertion();
        float dataSource = (int) (Math.random() * 10) + (float) Math.random();
        dataSource = -3.5123303f;
        // dataSource = -dataSource;
        FloatCastToInt dataCast = m_dataConvertion.new FloatCastToInt(dataSource);

        int result01 = dataCast.calResultByCast();

        MathCastMethodToInt dataMathCast = m_dataConvertion.new MathCastMethodToInt(dataSource);

        int result02 = dataMathCast.calResultByRound();
        int result03 = dataMathCast.calResultByFloor();

        System.out.println("float dataSource : " + dataSource);
        System.out.println("Cast --- result01 : " + result01);
        System.out.println("Round --- result02 : " + result02);
        System.out.println("Floor --- result03 : " + result03);
    }*/

    class FloatCastToInt
    {
        private float dataSource;
        private int   dataResult;

        // The constructor.
        public FloatCastToInt(float dataSource)
        {
            this.dataSource = dataSource;
        }

        /**
         * Return the result of casting the argument to an integer.
         * 
         * @return
         */
        public int calResultByCast()
        {
            dataResult = (int) dataSource;

            return this.dataResult;
        }
    }

    class MathCastMethodToInt
    {
        private float dataSource;
        private int   dataResult;

        // The constructor.
        public MathCastMethodToInt(float dataSource)
        {
            this.dataSource = dataSource;
        }

        /**
         * Returns the result of rounding the argument to an integer.
         * 
         * @return int value
         */
        public int calResultByRound()
        {
            dataResult = Math.round(dataSource);

            return this.dataResult;
        }

        /**
         * Returns the double conversion of the most positive (closest to
         * positive infinity) integer value which is less than the argument.
         * 
         * @return int value.
         */
        public int calResultByFloor()
        {
            double data = Math.floor(dataSource);

            dataResult = (int) data;

            return this.dataResult;
        }
    }
}
