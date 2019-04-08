// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateSubnetGroupRequestBuilderOps(val self: CreateSubnetGroupRequest.Builder) extends AnyVal {

  final def subnetGroupNameAsScala(value: Option[String]): CreateSubnetGroupRequest.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateSubnetGroupRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def subnetIdsAsScala(value: Option[Seq[String]]): CreateSubnetGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    } // Seq[String]
  }

}

final class CreateSubnetGroupRequestOps(val self: CreateSubnetGroupRequest) extends AnyVal {

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetGroupRequestOps {

  implicit def toCreateSubnetGroupRequestBuilderOps(
      v: CreateSubnetGroupRequest.Builder
  ): CreateSubnetGroupRequestBuilderOps = new CreateSubnetGroupRequestBuilderOps(v)

  implicit def toCreateSubnetGroupRequestOps(v: CreateSubnetGroupRequest): CreateSubnetGroupRequestOps =
    new CreateSubnetGroupRequestOps(v)

}
