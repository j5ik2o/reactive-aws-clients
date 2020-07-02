// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorSessionBuilderOps(val self: TrafficMirrorSession.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.trafficMirrorSessionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.trafficMirrorTargetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packetLengthAsScala(value: Option[Int]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.packetLength(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sessionNumberAsScala(value: Option[Int]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.sessionNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNetworkIdAsScala(value: Option[Int]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.virtualNetworkId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TrafficMirrorSession.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TrafficMirrorSession.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TrafficMirrorSessionOps(val self: TrafficMirrorSession) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorSessionIdAsScala: Option[String] = Option(self.trafficMirrorSessionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packetLengthAsScala: Option[Int] = Option(self.packetLength)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sessionNumberAsScala: Option[Int] = Option(self.sessionNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def virtualNetworkIdAsScala: Option[Int] = Option(self.virtualNetworkId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorSessionOps {

  implicit def toTrafficMirrorSessionBuilderOps(v: TrafficMirrorSession.Builder): TrafficMirrorSessionBuilderOps =
    new TrafficMirrorSessionBuilderOps(v)

  implicit def toTrafficMirrorSessionOps(v: TrafficMirrorSession): TrafficMirrorSessionOps =
    new TrafficMirrorSessionOps(v)

}
