// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyHostsRequestBuilderOps(val self: ModifyHostsRequest.Builder) extends AnyVal {

  final def autoPlacementAsScala(value: Option[AutoPlacement]): ModifyHostsRequest.Builder = {
    value.fold(self) { v =>
      self.autoPlacement(v)
    }
  }

  final def hostIdsAsScala(value: Option[Seq[String]]): ModifyHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostIds(v.asJava)
    }
  }

}

final class ModifyHostsRequestOps(val self: ModifyHostsRequest) extends AnyVal {

  final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement)

  final def hostIdsAsScala: Option[Seq[String]] = Option(self.hostIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyHostsRequestOps {

  implicit def toModifyHostsRequestBuilderOps(v: ModifyHostsRequest.Builder): ModifyHostsRequestBuilderOps =
    new ModifyHostsRequestBuilderOps(v)

  implicit def toModifyHostsRequestOps(v: ModifyHostsRequest): ModifyHostsRequestOps = new ModifyHostsRequestOps(v)

}
