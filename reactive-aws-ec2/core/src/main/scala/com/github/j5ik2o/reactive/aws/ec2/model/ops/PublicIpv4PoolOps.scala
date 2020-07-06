// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PublicIpv4PoolBuilderOps(val self: PublicIpv4Pool.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala(value: Option[String]): PublicIpv4Pool.Builder = {
    value.fold(self) { v => self.poolId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PublicIpv4Pool.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolAddressRangesAsScala(value: Option[Seq[PublicIpv4PoolRange]]): PublicIpv4Pool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolAddressRanges(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalAddressCountAsScala(value: Option[Int]): PublicIpv4Pool.Builder = {
    value.fold(self) { v => self.totalAddressCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalAvailableAddressCountAsScala(value: Option[Int]): PublicIpv4Pool.Builder = {
    value.fold(self) { v => self.totalAvailableAddressCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala(value: Option[String]): PublicIpv4Pool.Builder = {
    value.fold(self) { v => self.networkBorderGroup(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): PublicIpv4Pool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class PublicIpv4PoolOps(val self: PublicIpv4Pool) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala: Option[String] = Option(self.poolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolAddressRangesAsScala: Option[Seq[PublicIpv4PoolRange]] =
    Option(self.poolAddressRanges).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalAddressCountAsScala: Option[Int] = Option(self.totalAddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalAvailableAddressCountAsScala: Option[Int] = Option(self.totalAvailableAddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublicIpv4PoolOps {

  implicit def toPublicIpv4PoolBuilderOps(v: PublicIpv4Pool.Builder): PublicIpv4PoolBuilderOps =
    new PublicIpv4PoolBuilderOps(v)

  implicit def toPublicIpv4PoolOps(v: PublicIpv4Pool): PublicIpv4PoolOps = new PublicIpv4PoolOps(v)

}
