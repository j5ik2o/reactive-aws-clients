// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorSessionRequestBuilderOps(val self: CreateTrafficMirrorSessionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala(value: Option[String]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorTargetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorFilterId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packetLengthAsScala(value: Option[Int]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.packetLength(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sessionNumberAsScala(value: Option[Int]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.sessionNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNetworkIdAsScala(value: Option[Int]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.virtualNetworkId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateTrafficMirrorSessionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorSessionRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateTrafficMirrorSessionRequestOps(val self: CreateTrafficMirrorSessionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packetLengthAsScala: Option[Int] = Option(self.packetLength)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sessionNumberAsScala: Option[Int] = Option(self.sessionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNetworkIdAsScala: Option[Int] = Option(self.virtualNetworkId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorSessionRequestOps {

  implicit def toCreateTrafficMirrorSessionRequestBuilderOps(
      v: CreateTrafficMirrorSessionRequest.Builder
  ): CreateTrafficMirrorSessionRequestBuilderOps = new CreateTrafficMirrorSessionRequestBuilderOps(v)

  implicit def toCreateTrafficMirrorSessionRequestOps(
      v: CreateTrafficMirrorSessionRequest
  ): CreateTrafficMirrorSessionRequestOps = new CreateTrafficMirrorSessionRequestOps(v)

}
