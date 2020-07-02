// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateSubnetGroupRequestBuilderOps(val self: UpdateSubnetGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala(value: Option[String]): UpdateSubnetGroupRequest.Builder = {
    value.fold(self) { v => self.subnetGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateSubnetGroupRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala(value: Option[Seq[String]]): UpdateSubnetGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava)
    }
  }

}

final class UpdateSubnetGroupRequestOps(val self: UpdateSubnetGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala: Option[Seq[String]] =
    Option(self.subnetIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSubnetGroupRequestOps {

  implicit def toUpdateSubnetGroupRequestBuilderOps(
      v: UpdateSubnetGroupRequest.Builder
  ): UpdateSubnetGroupRequestBuilderOps = new UpdateSubnetGroupRequestBuilderOps(v)

  implicit def toUpdateSubnetGroupRequestOps(v: UpdateSubnetGroupRequest): UpdateSubnetGroupRequestOps =
    new UpdateSubnetGroupRequestOps(v)

}
