// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StaleIpPermissionBuilderOps(val self: StaleIpPermission.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala(value: Option[Int]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipProtocolAsScala(value: Option[String]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipRangesAsScala(value: Option[Seq[String]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipRanges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdsAsScala(value: Option[Seq[String]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.prefixListIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toPortAsScala(value: Option[Int]): StaleIpPermission.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdGroupPairsAsScala(value: Option[Seq[UserIdGroupPair]]): StaleIpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userIdGroupPairs(v.asJava)
    }
  }

}

final class StaleIpPermissionOps(val self: StaleIpPermission) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipRangesAsScala: Option[Seq[String]] = Option(self.ipRanges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdsAsScala: Option[Seq[String]] = Option(self.prefixListIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toPortAsScala: Option[Int] = Option(self.toPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdGroupPairsAsScala: Option[Seq[UserIdGroupPair]] = Option(self.userIdGroupPairs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStaleIpPermissionOps {

  implicit def toStaleIpPermissionBuilderOps(v: StaleIpPermission.Builder): StaleIpPermissionBuilderOps =
    new StaleIpPermissionBuilderOps(v)

  implicit def toStaleIpPermissionOps(v: StaleIpPermission): StaleIpPermissionOps = new StaleIpPermissionOps(v)

}
