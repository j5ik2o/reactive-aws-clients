// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssignPrivateIpAddressesRequestBuilderOps(val self: AssignPrivateIpAddressesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowReassignmentAsScala(value: Option[Boolean]): AssignPrivateIpAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.allowReassignment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): AssignPrivateIpAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala(value: Option[Seq[String]]): AssignPrivateIpAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.privateIpAddresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secondaryPrivateIpAddressCountAsScala(value: Option[Int]): AssignPrivateIpAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.secondaryPrivateIpAddressCount(v)
    }
  }

}

final class AssignPrivateIpAddressesRequestOps(val self: AssignPrivateIpAddressesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowReassignmentAsScala: Option[Boolean] = Option(self.allowReassignment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala: Option[Seq[String]] = Option(self.privateIpAddresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secondaryPrivateIpAddressCountAsScala: Option[Int] = Option(self.secondaryPrivateIpAddressCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssignPrivateIpAddressesRequestOps {

  implicit def toAssignPrivateIpAddressesRequestBuilderOps(
      v: AssignPrivateIpAddressesRequest.Builder
  ): AssignPrivateIpAddressesRequestBuilderOps = new AssignPrivateIpAddressesRequestBuilderOps(v)

  implicit def toAssignPrivateIpAddressesRequestOps(
      v: AssignPrivateIpAddressesRequest
  ): AssignPrivateIpAddressesRequestOps = new AssignPrivateIpAddressesRequestOps(v)

}
