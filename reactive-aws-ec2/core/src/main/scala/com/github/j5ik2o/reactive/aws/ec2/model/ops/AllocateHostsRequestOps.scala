// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateHostsRequestBuilderOps(val self: AllocateHostsRequest.Builder) extends AnyVal {

  final def autoPlacementAsScala(value: Option[AutoPlacement]): AllocateHostsRequest.Builder = {
    value.fold(self) { v =>
      self.autoPlacement(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): AllocateHostsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def quantityAsScala(value: Option[Int]): AllocateHostsRequest.Builder = {
    value.fold(self) { v =>
      self.quantity(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): AllocateHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class AllocateHostsRequestOps(val self: AllocateHostsRequest) extends AnyVal {

  final def autoPlacementAsScala: Option[AutoPlacement] = Option(self.autoPlacement)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def quantityAsScala: Option[Int] = Option(self.quantity)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateHostsRequestOps {

  implicit def toAllocateHostsRequestBuilderOps(v: AllocateHostsRequest.Builder): AllocateHostsRequestBuilderOps =
    new AllocateHostsRequestBuilderOps(v)

  implicit def toAllocateHostsRequestOps(v: AllocateHostsRequest): AllocateHostsRequestOps =
    new AllocateHostsRequestOps(v)

}
