// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkAclBuilderOps(val self: NetworkAcl.Builder) extends AnyVal {

  final def associationsAsScala(value: Option[Seq[NetworkAclAssociation]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.associations(v.asJava)
    }
  }

  final def entriesAsScala(value: Option[Seq[NetworkAclEntry]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.entries(v.asJava)
    }
  }

  final def isDefaultAsScala(value: Option[Boolean]): NetworkAcl.Builder = {
    value.fold(self) { v =>
      self.isDefault(v)
    }
  }

  final def networkAclIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v =>
      self.networkAclId(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): NetworkAcl.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): NetworkAcl.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

}

final class NetworkAclOps(val self: NetworkAcl) extends AnyVal {

  final def associationsAsScala: Option[Seq[NetworkAclAssociation]] = Option(self.associations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def entriesAsScala: Option[Seq[NetworkAclEntry]] = Option(self.entries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def isDefaultAsScala: Option[Boolean] = Option(self.isDefault)

  final def networkAclIdAsScala: Option[String] = Option(self.networkAclId)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkAclOps {

  implicit def toNetworkAclBuilderOps(v: NetworkAcl.Builder): NetworkAclBuilderOps = new NetworkAclBuilderOps(v)

  implicit def toNetworkAclOps(v: NetworkAcl): NetworkAclOps = new NetworkAclOps(v)

}
