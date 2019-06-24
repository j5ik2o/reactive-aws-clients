// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class IncreaseReplicationFactorRequestBuilderOps(val self: IncreaseReplicationFactorRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): IncreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newReplicationFactorAsScala(value: Option[Int]): IncreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.newReplicationFactor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(value: Option[Seq[String]]): IncreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

}

final class IncreaseReplicationFactorRequestOps(val self: IncreaseReplicationFactorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newReplicationFactorAsScala: Option[Int] = Option(self.newReplicationFactor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIncreaseReplicationFactorRequestOps {

  implicit def toIncreaseReplicationFactorRequestBuilderOps(
      v: IncreaseReplicationFactorRequest.Builder
  ): IncreaseReplicationFactorRequestBuilderOps = new IncreaseReplicationFactorRequestBuilderOps(v)

  implicit def toIncreaseReplicationFactorRequestOps(
      v: IncreaseReplicationFactorRequest
  ): IncreaseReplicationFactorRequestOps = new IncreaseReplicationFactorRequestOps(v)

}
