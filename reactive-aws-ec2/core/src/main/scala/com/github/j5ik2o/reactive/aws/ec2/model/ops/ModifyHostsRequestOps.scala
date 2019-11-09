// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyHostsRequestBuilderOps(val self: ModifyHostsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoPlacementAsScala(value: Option[AutoPlacement]): ModifyHostsRequest.Builder = {
    value.fold(self) { v =>
      self.autoPlacement(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdsAsScala(value: Option[Seq[String]]): ModifyHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostRecoveryAsScala(value: Option[HostRecovery]): ModifyHostsRequest.Builder = {
    value.fold(self) { v =>
      self.hostRecovery(v)
    }
  }

}

final class ModifyHostsRequestOps(val self: ModifyHostsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdsAsScala: Option[Seq[String]] = Option(self.hostIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostRecoveryAsScala: Option[HostRecovery] = Option(self.hostRecovery)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyHostsRequestOps {

  implicit def toModifyHostsRequestBuilderOps(v: ModifyHostsRequest.Builder): ModifyHostsRequestBuilderOps =
    new ModifyHostsRequestBuilderOps(v)

  implicit def toModifyHostsRequestOps(v: ModifyHostsRequest): ModifyHostsRequestOps = new ModifyHostsRequestOps(v)

}
