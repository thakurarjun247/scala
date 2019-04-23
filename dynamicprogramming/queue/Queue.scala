package dynamicprogramming.queue

import scala.reflect.ClassTag
trait Queue[T] {
  def isEmpty: Boolean
  def enQueue(t: T): Queue[T]
  //Removes the element at the beginning of the immutable queue, and returns the new queue.
  def deQueue(): Queue[T]
  def head: Option[T]
}
object Queue {
  def empty[T:ClassTag]: Queue[T] = new QueueImpl[T](Array[T]())
}
