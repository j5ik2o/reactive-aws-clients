// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateSubnetGroupRequestBuilderOps(val self: CreateSubnetGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala(value: Option[String]): CreateSubnetGroupRequest.Builder = {
    value.fold(self) { v => self.subnetGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateSubnetGroupRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala(value: Option[Seq[String]]): CreateSubnetGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava)
    }
  }

}

final class CreateSubnetGroupRequestOps(val self: CreateSubnetGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala: Option[Seq[String]] =
    Option(self.subnetIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetGroupRequestOps {

  implicit def toCreateSubnetGroupRequestBuilderOps(
      v: CreateSubnetGroupRequest.Builder
  ): CreateSubnetGroupRequestBuilderOps = new CreateSubnetGroupRequestBuilderOps(v)

  implicit def toCreateSubnetGroupRequestOps(v: CreateSubnetGroupRequest): CreateSubnetGroupRequestOps =
    new CreateSubnetGroupRequestOps(v)

}
