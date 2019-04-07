// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class IncreaseReplicationFactorRequestBuilderOps(val self: IncreaseReplicationFactorRequest.Builder)
    extends AnyVal {

  final def withClusterNameAsScala(value: Option[String]): IncreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def withNewReplicationFactorAsScala(value: Option[Int]): IncreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.newReplicationFactor(v)
    }
  } // Int

  final def withAvailabilityZonesAsScala(value: Option[Seq[String]]): IncreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    } // Seq[String]
  }

}

final class IncreaseReplicationFactorRequestOps(val self: IncreaseReplicationFactorRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def newReplicationFactorAsScala: Option[Int] = Option(self.newReplicationFactor) // Int

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

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
