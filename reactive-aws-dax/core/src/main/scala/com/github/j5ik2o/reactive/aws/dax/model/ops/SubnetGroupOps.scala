// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class SubnetGroupBuilderOps(val self: SubnetGroup.Builder) extends AnyVal {

  final def subnetGroupNameAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): SubnetGroup.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def subnetsAsScala(value: Option[Seq[Subnet]]): SubnetGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnets(v.asJava)
    }
  }

}

final class SubnetGroupOps(val self: SubnetGroup) extends AnyVal {

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def subnetsAsScala: Option[Seq[Subnet]] = Option(self.subnets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubnetGroupOps {

  implicit def toSubnetGroupBuilderOps(v: SubnetGroup.Builder): SubnetGroupBuilderOps = new SubnetGroupBuilderOps(v)

  implicit def toSubnetGroupOps(v: SubnetGroup): SubnetGroupOps = new SubnetGroupOps(v)

}
