// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SubnetGroupBuilderOps(val self: SubnetGroup.Builder) extends AnyVal {

  final def withSubnetGroupNameAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withVpcIdAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  } // String

  final def withSubnetsAsScala(value: Option[Seq[Subnet]]): SubnetGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    } // Seq[Subnet]
  }

}

final class SubnetGroupOps(val self: SubnetGroup) extends AnyVal {

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def vpcIdAsScala: Option[String] = Option(self.vpcId) // String

  final def subnetsAsScala: Option[Seq[Subnet]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Subnet]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetGroupOps {

  implicit def toSubnetGroupBuilderOps(v: SubnetGroup.Builder): SubnetGroupBuilderOps = new SubnetGroupBuilderOps(v)

  implicit def toSubnetGroupOps(v: SubnetGroup): SubnetGroupOps = new SubnetGroupOps(v)

}
