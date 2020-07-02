// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PlacementGroupInfoBuilderOps(val self: PlacementGroupInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedStrategiesAsScala(value: Option[Seq[PlacementGroupStrategy]]): PlacementGroupInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedStrategies(v.asJava)
    }
  }

}

final class PlacementGroupInfoOps(val self: PlacementGroupInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedStrategiesAsScala: Option[Seq[PlacementGroupStrategy]] =
    Option(self.supportedStrategies).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementGroupInfoOps {

  implicit def toPlacementGroupInfoBuilderOps(v: PlacementGroupInfo.Builder): PlacementGroupInfoBuilderOps =
    new PlacementGroupInfoBuilderOps(v)

  implicit def toPlacementGroupInfoOps(v: PlacementGroupInfo): PlacementGroupInfoOps = new PlacementGroupInfoOps(v)

}
