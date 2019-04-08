// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class NodeBuilderOps(val self: Node.Builder) extends AnyVal {

  final def nodeIdAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeId(v)
    }
  } // String

  final def endpointAsScala(value: Option[Endpoint]): Node.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  } // Endpoint

  final def nodeCreateTimeAsScala(value: Option[java.time.Instant]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeCreateTime(v)
    }
  } // java.time.Instant

  final def availabilityZoneAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  } // String

  final def nodeStatusAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeStatus(v)
    }
  } // String

  final def parameterGroupStatusAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.parameterGroupStatus(v)
    }
  } // String

}

final class NodeOps(val self: Node) extends AnyVal {

  final def nodeIdAsScala: Option[String] = Option(self.nodeId) // String

  final def endpointAsScala: Option[Endpoint] = Option(self.endpoint) // Endpoint

  final def nodeCreateTimeAsScala: Option[java.time.Instant] = Option(self.nodeCreateTime) // java.time.Instant

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) // String

  final def nodeStatusAsScala: Option[String] = Option(self.nodeStatus) // String

  final def parameterGroupStatusAsScala: Option[String] = Option(self.parameterGroupStatus) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeOps {

  implicit def toNodeBuilderOps(v: Node.Builder): NodeBuilderOps = new NodeBuilderOps(v)

  implicit def toNodeOps(v: Node): NodeOps = new NodeOps(v)

}
