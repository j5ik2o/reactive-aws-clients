// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DecreaseReplicationFactorRequestBuilderOps(val self: DecreaseReplicationFactorRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DecreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newReplicationFactorAsScala(value: Option[Int]): DecreaseReplicationFactorRequest.Builder = {
    value.fold(self) { v =>
      self.newReplicationFactor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(value: Option[Seq[String]]): DecreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRemoveAsScala(value: Option[Seq[String]]): DecreaseReplicationFactorRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodeIdsToRemove(v.asJava)
    }
  }

}

final class DecreaseReplicationFactorRequestOps(val self: DecreaseReplicationFactorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def newReplicationFactorAsScala: Option[Int] = Option(self.newReplicationFactor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRemoveAsScala: Option[Seq[String]] = Option(self.nodeIdsToRemove).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

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
