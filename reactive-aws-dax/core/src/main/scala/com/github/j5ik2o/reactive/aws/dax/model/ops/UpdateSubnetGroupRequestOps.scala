// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateSubnetGroupRequestBuilderOps(val self: UpdateSubnetGroupRequest.Builder) extends AnyVal {

  final def withSubnetGroupNameAsScala(value: Option[String]): UpdateSubnetGroupRequest.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): UpdateSubnetGroupRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withSubnetIdsAsScala(value: Option[Seq[String]]): UpdateSubnetGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    } // Seq[String]
  }

}

final class UpdateSubnetGroupRequestOps(val self: UpdateSubnetGroupRequest) extends AnyVal {

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateSubnetGroupRequestOps {

  implicit def toUpdateSubnetGroupRequestBuilderOps(
      v: UpdateSubnetGroupRequest.Builder
  ): UpdateSubnetGroupRequestBuilderOps = new UpdateSubnetGroupRequestBuilderOps(v)

  implicit def toUpdateSubnetGroupRequestOps(v: UpdateSubnetGroupRequest): UpdateSubnetGroupRequestOps =
    new UpdateSubnetGroupRequestOps(v)

}
