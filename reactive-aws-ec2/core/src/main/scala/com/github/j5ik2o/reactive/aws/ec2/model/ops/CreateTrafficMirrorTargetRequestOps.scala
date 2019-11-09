// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorTargetRequestBuilderOps(val self: CreateTrafficMirrorTargetRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): CreateTrafficMirrorTargetRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkLoadBalancerArnAsScala(value: Option[String]): CreateTrafficMirrorTargetRequest.Builder = {
    value.fold(self) { v =>
      self.networkLoadBalancerArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateTrafficMirrorTargetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateTrafficMirrorTargetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorTargetRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateTrafficMirrorTargetRequestOps(val self: CreateTrafficMirrorTargetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkLoadBalancerArnAsScala: Option[String] = Option(self.networkLoadBalancerArn)

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
trait ToCreateTrafficMirrorTargetRequestOps {

  implicit def toCreateTrafficMirrorTargetRequestBuilderOps(
      v: CreateTrafficMirrorTargetRequest.Builder
  ): CreateTrafficMirrorTargetRequestBuilderOps = new CreateTrafficMirrorTargetRequestBuilderOps(v)

  implicit def toCreateTrafficMirrorTargetRequestOps(
      v: CreateTrafficMirrorTargetRequest
  ): CreateTrafficMirrorTargetRequestOps = new CreateTrafficMirrorTargetRequestOps(v)

}
