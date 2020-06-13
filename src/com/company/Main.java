/*
 *
 * Classname: Main
 *
 * @version 13.06.2020
 *
 * @author Kopach Daria
 *
 * Description:Programming patterns. Factory
 *
 * Develop for your class
 *
 * 1. Factory.
 *
 * 2. Abstract factory.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        // the first method of Parallelogram object creation

        Parallelogram parallelogram1 = new Parallelogram(
                4,
                6,
                Math.PI / 6);

        System.out.println(parallelogram1);
        System.out.println("Hashcode of 1th parallelogram is "
                + parallelogram1.hashCode());

        // the second method of Parallelogram object creation

        Parallelogram parallelogram2 = new Parallelogram();
        parallelogram2.setSmallSide(3);
        parallelogram2.setBigSide(5);
        parallelogram2.setAngle(Math.PI / 3);

        System.out.println(parallelogram2);

        // check whether two parallelograms are equal

        System.out.println("Are these two parallelograms are equal? "
                + parallelogram1.equals(parallelogram2));

        /*
         * the third method of Parallelogram object creation
         *  using the ParallelogramFactory
         */


        Parallelogram parallelogram3 = ParallelogramFactory.create(
                -4,
                6,
                Math.PI / 5);

        System.out.println(parallelogram3);

        /*
         * the fourth method of Parallelogram object creation
         * using Abstract Factory
         */

        Parallelogram tr5 = ParallelogramAbstractFactory.create(4,4, Math.PI / 4);

        System.out.println(tr5);

    }

}

