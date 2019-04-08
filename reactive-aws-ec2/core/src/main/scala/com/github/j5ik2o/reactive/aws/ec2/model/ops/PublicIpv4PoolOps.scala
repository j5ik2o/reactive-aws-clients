// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PublicIpv4PoolBuilderOps(val self: PublicIpv4Pool.Builder) extends AnyVal {

  final def poolIdAsScala(value: Option[String]): PublicIpv4Pool.Builder = {
    value.fold(self) { v =>
      self.poolId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): PublicIpv4Pool.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def poolAddressRangesAsScala(value: Option[Seq[PublicIpv4PoolRange]]): PublicIpv4Pool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.poolAddressRanges(v.asJava)
    }
  }

  final def totalAddressCountAsScala(value: Option[Int]): PublicIpv4Pool.Builder = {
    value.fold(self) { v =>
      self.totalAddressCount(v)
    }
  }

  final def totalAvailableAddressCountAsScala(value: Option[Int]): PublicIpv4Pool.Builder = {
    value.fold(self) { v =>
      self.totalAvailableAddressCount(v)
    }
  }

}

final class PublicIpv4PoolOps(val self: PublicIpv4Pool) extends AnyVal {

  final def poolIdAsScala: Option[String] = Option(self.poolId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def poolAddressRangesAsScala: Option[Seq[PublicIpv4PoolRange]] = Option(self.poolAddressRanges).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def totalAddressCountAsScala: Option[Int] = Option(self.totalAddressCount)

  final def totalAvailableAddressCountAsScala: Option[Int] = Option(self.totalAvailableAddressCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublicIpv4PoolOps {

  implicit def toPublicIpv4PoolBuilderOps(v: PublicIpv4Pool.Builder): PublicIpv4PoolBuilderOps =
    new PublicIpv4PoolBuilderOps(v)

  implicit def toPublicIpv4PoolOps(v: PublicIpv4Pool): PublicIpv4PoolOps = new PublicIpv4PoolOps(v)

}
