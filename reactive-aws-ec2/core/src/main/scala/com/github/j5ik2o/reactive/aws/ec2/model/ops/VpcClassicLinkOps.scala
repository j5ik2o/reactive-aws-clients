// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcClassicLinkBuilderOps(val self: VpcClassicLink.Builder) extends AnyVal {

  final def classicLinkEnabledAsScala(value: Option[Boolean]): VpcClassicLink.Builder = {
    value.fold(self) { v =>
      self.classicLinkEnabled(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): VpcClassicLink.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): VpcClassicLink.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class VpcClassicLinkOps(val self: VpcClassicLink) extends AnyVal {

  final def classicLinkEnabledAsScala: Option[Boolean] = Option(self.classicLinkEnabled)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcClassicLinkOps {

  implicit def toVpcClassicLinkBuilderOps(v: VpcClassicLink.Builder): VpcClassicLinkBuilderOps =
    new VpcClassicLinkBuilderOps(v)

  implicit def toVpcClassicLinkOps(v: VpcClassicLink): VpcClassicLinkOps = new VpcClassicLinkOps(v)

}
