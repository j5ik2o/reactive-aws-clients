// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CoipPoolBuilderOps(val self: CoipPool.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala(value: Option[String]): CoipPool.Builder = {
    value.fold(self) { v =>
      self.poolId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolCidrsAsScala(value: Option[Seq[String]]): CoipPool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.poolCidrs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(value: Option[String]): CoipPool.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CoipPool.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CoipPoolOps(val self: CoipPool) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala: Option[String] = Option(self.poolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolCidrsAsScala: Option[Seq[String]] = Option(self.poolCidrs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCoipPoolOps {

  implicit def toCoipPoolBuilderOps(v: CoipPool.Builder): CoipPoolBuilderOps = new CoipPoolBuilderOps(v)

  implicit def toCoipPoolOps(v: CoipPool): CoipPoolOps = new CoipPoolOps(v)

}
