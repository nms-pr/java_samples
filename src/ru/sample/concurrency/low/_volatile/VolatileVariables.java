package ru.sample.concurrency.low._volatile;

/**
 * Created by Nechaev Mikhail
 * Since 08/11/2018.
 *
 * Чтение и запись volatile переменных происходит через общую память
 * Также запись устанавливает отношение happens-before (изменения видны других потокам)
 *
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/atomic.html
 */
@SuppressWarnings("unused")
class VolatileVariables {
    private volatile long x;
    private volatile double y;
}
