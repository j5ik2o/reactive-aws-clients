// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstancePlacementRequestBuilderOps(val self: ModifyInstancePlacementRequest.Builder) extends AnyVal {

  final def affinityAsScala(value: Option[Affinity]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.affinity(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def hostIdAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def tenancyAsScala(value: Option[HostTenancy]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  final def partitionNumberAsScala(value: Option[Int]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.partitionNumber(v)
    }
  }

}

final class ModifyInstancePlacementRequestOps(val self: ModifyInstancePlacementRequest) extends AnyVal {

  final def affinityAsScala: Option[Affinity] = Option(self.affinity)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def hostIdAsScala: Option[String] = Option(self.hostId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def tenancyAsScala: Option[HostTenancy] = Option(self.tenancy)

  final def partitionNumberAsScala: Option[Int] = Option(self.partitionNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstancePlacementRequestOps {

  implicit def toModifyInstancePlacementRequestBuilderOps(
      v: ModifyInstancePlacementRequest.Builder
  ): ModifyInstancePlacementRequestBuilderOps = new ModifyInstancePlacementRequestBuilderOps(v)

  implicit def toModifyInstancePlacementRequestOps(
      v: ModifyInstancePlacementRequest
  ): ModifyInstancePlacementRequestOps = new ModifyInstancePlacementRequestOps(v)

}
