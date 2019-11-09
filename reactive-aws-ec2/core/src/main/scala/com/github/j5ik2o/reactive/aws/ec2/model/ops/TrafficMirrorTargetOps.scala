// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorTargetBuilderOps(val self: TrafficMirrorTarget.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala(value: Option[String]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorTargetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkLoadBalancerArnAsScala(value: Option[String]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.networkLoadBalancerArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[TrafficMirrorTargetType]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): TrafficMirrorTarget.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): TrafficMirrorTarget.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TrafficMirrorTargetOps(val self: TrafficMirrorTarget) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkLoadBalancerArnAsScala: Option[String] = Option(self.networkLoadBalancerArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[TrafficMirrorTargetType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorTargetOps {

  implicit def toTrafficMirrorTargetBuilderOps(v: TrafficMirrorTarget.Builder): TrafficMirrorTargetBuilderOps =
    new TrafficMirrorTargetBuilderOps(v)

  implicit def toTrafficMirrorTargetOps(v: TrafficMirrorTarget): TrafficMirrorTargetOps = new TrafficMirrorTargetOps(v)

}
