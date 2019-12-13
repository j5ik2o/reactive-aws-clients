// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstancePlacementRequestBuilderOps(val self: ModifyInstancePlacementRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def affinityAsScala(value: Option[Affinity]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.affinity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.hostId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala(value: Option[HostTenancy]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionNumberAsScala(value: Option[Int]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.partitionNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostResourceGroupArnAsScala(value: Option[String]): ModifyInstancePlacementRequest.Builder = {
    value.fold(self) { v =>
      self.hostResourceGroupArn(v)
    }
  }

}

final class ModifyInstancePlacementRequestOps(val self: ModifyInstancePlacementRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def affinityAsScala: Option[Affinity] = Option(self.affinity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdAsScala: Option[String] = Option(self.hostId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala: Option[HostTenancy] = Option(self.tenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionNumberAsScala: Option[Int] = Option(self.partitionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostResourceGroupArnAsScala: Option[String] = Option(self.hostResourceGroupArn)

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
