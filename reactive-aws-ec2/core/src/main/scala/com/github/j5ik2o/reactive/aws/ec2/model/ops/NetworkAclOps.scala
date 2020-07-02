// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkAclBuilderOps(val self: NetworkAcl.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala(value: Option[Seq[NetworkAclAssociation]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.associations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(value: Option[Seq[NetworkAclEntry]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isDefaultAsScala(value: Option[Boolean]): NetworkAcl.Builder = {
    value.fold(self) { v => self.isDefault(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v => self.networkAclId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

}

final class NetworkAclOps(val self: NetworkAcl) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala: Option[Seq[NetworkAclAssociation]] =
    Option(self.associations).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[NetworkAclEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isDefaultAsScala: Option[Boolean] = Option(self.isDefault)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkAclOps {

  implicit def toNetworkAclBuilderOps(v: NetworkAcl.Builder): NetworkAclBuilderOps = new NetworkAclBuilderOps(v)

  implicit def toNetworkAclOps(v: NetworkAcl): NetworkAclOps = new NetworkAclOps(v)

}
