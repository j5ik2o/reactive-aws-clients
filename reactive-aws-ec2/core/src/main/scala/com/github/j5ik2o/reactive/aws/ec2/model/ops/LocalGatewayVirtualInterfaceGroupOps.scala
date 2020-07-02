// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayVirtualInterfaceGroupBuilderOps(val self: LocalGatewayVirtualInterfaceGroup.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala(
      value: Option[String]
  ): LocalGatewayVirtualInterfaceGroup.Builder = {
    value.fold(self) { v => self.localGatewayVirtualInterfaceGroupId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdsAsScala(
      value: Option[Seq[String]]
  ): LocalGatewayVirtualInterfaceGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGatewayVirtualInterfaceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala(value: Option[String]): LocalGatewayVirtualInterfaceGroup.Builder = {
    value.fold(self) { v => self.localGatewayId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): LocalGatewayVirtualInterfaceGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class LocalGatewayVirtualInterfaceGroupOps(val self: LocalGatewayVirtualInterfaceGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceGroupIdAsScala: Option[String] =
    Option(self.localGatewayVirtualInterfaceGroupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayVirtualInterfaceIdsAsScala: Option[Seq[String]] =
    Option(self.localGatewayVirtualInterfaceIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayVirtualInterfaceGroupOps {

  implicit def toLocalGatewayVirtualInterfaceGroupBuilderOps(
      v: LocalGatewayVirtualInterfaceGroup.Builder
  ): LocalGatewayVirtualInterfaceGroupBuilderOps = new LocalGatewayVirtualInterfaceGroupBuilderOps(v)

  implicit def toLocalGatewayVirtualInterfaceGroupOps(
      v: LocalGatewayVirtualInterfaceGroup
  ): LocalGatewayVirtualInterfaceGroupOps = new LocalGatewayVirtualInterfaceGroupOps(v)

}
