// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StaleIpPermissionBuilderOps(val self: StaleIpPermission.Builder) extends AnyVal {

  final def fromPortAsScala(value: Option[Int]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  final def ipProtocolAsScala(value: Option[String]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  final def ipRangesAsScala(value: Option[Seq[String]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipRanges(v.asJava)
    }
  }

  final def prefixListIdsAsScala(value: Option[Seq[String]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.prefixListIds(v.asJava)
    }
  }

  final def toPortAsScala(value: Option[Int]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

  final def userIdGroupPairsAsScala(value: Option[Seq[UserIdGroupPair]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userIdGroupPairs(v.asJava)
    }
  }

}

final class StaleIpPermissionOps(val self: StaleIpPermission) extends AnyVal {

  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol)

  final def ipRangesAsScala: Option[Seq[String]] = Option(self.ipRanges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def prefixListIdsAsScala: Option[Seq[String]] = Option(self.prefixListIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def toPortAsScala: Option[Int] = Option(self.toPort)

  final def userIdGroupPairsAsScala: Option[Seq[UserIdGroupPair]] = Option(self.userIdGroupPairs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStaleIpPermissionOps {

  implicit def toStaleIpPermissionBuilderOps(v: StaleIpPermission.Builder): StaleIpPermissionBuilderOps =
    new StaleIpPermissionBuilderOps(v)

  implicit def toStaleIpPermissionOps(v: StaleIpPermission): StaleIpPermissionOps = new StaleIpPermissionOps(v)

}
