/*
 *
 * Classname: AbstractFactory
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Factory
 *
 */
package com.company;

public class ParallelogramAbstractFactory {

    /*
     * Create the abstract factory with parameters
     * @param smallSide int, which will be set the Parallelogram small side
     * @param bigSide int,which will be set the Parallelogram big side
     * @param angle double, which will be set the Parallelogram angle
     */

    public static Parallelogram create(int smallSide, int bigSide, double angle){

        /* check whether sides are equal if yes
         * @return new Rhombus object
         *
         * if no then
         * @return new Parallelogram object
         */

            if (smallSide == bigSide ) {return
                    new Rhombus (smallSide, angle);
            } else return
                    new Parallelogram (smallSide, bigSide, angle);
    }
}
