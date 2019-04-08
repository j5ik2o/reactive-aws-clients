// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class NodeBuilderOps(val self: Node.Builder) extends AnyVal {

  final def nodeIdAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeId(v)
    }
  }

  final def endpointAsScala(value: Option[Endpoint]): Node.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  final def nodeCreateTimeAsScala(value: Option[java.time.Instant]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeCreateTime(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def nodeStatusAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.nodeStatus(v)
    }
  }

  final def parameterGroupStatusAsScala(value: Option[String]): Node.Builder = {
    value.fold(self) { v =>
      self.parameterGroupStatus(v)
    }
  }

}

final class NodeOps(val self: Node) extends AnyVal {

  final def nodeIdAsScala: Option[String] = Option(self.nodeId)

  final def endpointAsScala: Option[Endpoint] = Option(self.endpoint)

  final def nodeCreateTimeAsScala: Option[java.time.Instant] = Option(self.nodeCreateTime)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def nodeStatusAsScala: Option[String] = Option(self.nodeStatus)

  final def parameterGroupStatusAsScala: Option[String] = Option(self.parameterGroupStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodeOps {

  implicit def toNodeBuilderOps(v: Node.Builder): NodeBuilderOps = new NodeBuilderOps(v)

  implicit def toNodeOps(v: Node): NodeOps = new NodeOps(v)

}
