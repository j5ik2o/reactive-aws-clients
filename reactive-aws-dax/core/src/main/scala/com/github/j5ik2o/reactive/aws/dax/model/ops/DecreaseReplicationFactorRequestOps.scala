// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DecreaseReplicationFactorRequestBuilderOps(val self: DecreaseReplicationFactorRequest.Builder)
    extends AnyVal {

  final def clusterNameAsScala(value: Option[String]): DecreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def newReplicationFactorAsScala(value: Option[Int]): DecreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.newReplicationFactor(v)
    }
  } // Int

  final def availabilityZonesAsScala(value: Option[Seq[String]]): DecreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    } // Seq[String]
  }

  final def nodeIdsToRemoveAsScala(value: Option[Seq[String]]): DecreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeIdsToRemove(v.asJava)
    } // Seq[String]
  }

}

final class DecreaseReplicationFactorRequestOps(val self: DecreaseReplicationFactorRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def newReplicationFactorAsScala: Option[Int] = Option(self.newReplicationFactor) // Int

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def nodeIdsToRemoveAsScala: Option[Seq[String]] = Option(self.nodeIdsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecreaseReplicationFactorRequestOps {

  implicit def toDecreaseReplicationFactorRequestBuilderOps(
      v: DecreaseReplicationFactorRequest.Builder
  ): DecreaseReplicationFactorRequestBuilderOps = new DecreaseReplicationFactorRequestBuilderOps(v)

  implicit def toDecreaseReplicationFactorRequestOps(
      v: DecreaseReplicationFactorRequest
  ): DecreaseReplicationFactorRequestOps = new DecreaseReplicationFactorRequestOps(v)

}
