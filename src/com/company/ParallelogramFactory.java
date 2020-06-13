/*
 *
 * Classname: ParallelogramFactory
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Factory
 *
 */
package com.company;

public class ParallelogramFactory {

    /*
     * Create the factory with parameters
     * @param smallSide int, which will be set the Parallelogram small side
     * @param bigSide int,which will be set the Parallelogram big side
     * @param angle double, which will be set the Parallelogram angle
     */

    public static Parallelogram create(int smallSide, int bigSide, double angle) {

        /*
         * check that all sides and angle should be > 0
         *
         * @return new Parallelogram object if true
         * if false - null on console
         */

        if (smallSide > 0 && bigSide > 0 && angle > 0) {
            return new Parallelogram(smallSide, bigSide, angle);
        } else {
            return null;
        }
    }
}
