package dsalgo.datastructure.immutabledatastructure.graph
trait Graph[V] {
  def vertices: List[V]
  def edges: List[(V, V)]
  def addEdge(a: V, b: V): Graph[V]
  def neighbours(v: V): List[V]
}
object Graph {
  def apply[V](adjList: Map[V, List[V]]): Graph[V] = new DirectedGraph(adjList)
  def apply[V](): Graph[V] = new DirectedGraph(Map[V, List[V]]())
}
