// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Ipv6PoolBuilderOps(val self: Ipv6Pool.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala(value: Option[String]): Ipv6Pool.Builder = {
    value.fold(self) { v => self.poolId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Ipv6Pool.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolCidrBlocksAsScala(value: Option[Seq[PoolCidrBlock]]): Ipv6Pool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolCidrBlocks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Ipv6Pool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class Ipv6PoolOps(val self: Ipv6Pool) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala: Option[String] = Option(self.poolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolCidrBlocksAsScala: Option[Seq[PoolCidrBlock]] =
    Option(self.poolCidrBlocks).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpv6PoolOps {

  implicit def toIpv6PoolBuilderOps(v: Ipv6Pool.Builder): Ipv6PoolBuilderOps = new Ipv6PoolBuilderOps(v)

  implicit def toIpv6PoolOps(v: Ipv6Pool): Ipv6PoolOps = new Ipv6PoolOps(v)

}
