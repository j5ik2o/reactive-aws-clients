// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class IpPermissionBuilderOps(val self: IpPermission.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala(value: Option[Int]): IpPermission.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipProtocolAsScala(value: Option[String]): IpPermission.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipRangesAsScala(value: Option[Seq[IpRange]]): IpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipRanges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6RangesAsScala(value: Option[Seq[Ipv6Range]]): IpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Ranges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdsAsScala(value: Option[Seq[PrefixListId]]): IpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.prefixListIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def toPortAsScala(value: Option[Int]): IpPermission.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdGroupPairsAsScala(value: Option[Seq[UserIdGroupPair]]): IpPermission.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userIdGroupPairs(v.asJava)
    }
  }

}

final class IpPermissionOps(val self: IpPermission) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipRangesAsScala: Option[Seq[IpRange]] = Option(self.ipRanges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6RangesAsScala: Option[Seq[Ipv6Range]] = Option(self.ipv6Ranges).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdsAsScala: Option[Seq[PrefixListId]] = Option(self.prefixListIds).map { v =>
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
trait ToIpPermissionOps {

  implicit def toIpPermissionBuilderOps(v: IpPermission.Builder): IpPermissionBuilderOps = new IpPermissionBuilderOps(v)

  implicit def toIpPermissionOps(v: IpPermission): IpPermissionOps = new IpPermissionOps(v)

}
