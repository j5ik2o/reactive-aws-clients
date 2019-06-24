// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpuAssociationBuilderOps(val self: ElasticGpuAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuIdAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationIdAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationStateAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationTimeAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationTime(v)
    }
  }

}

final class ElasticGpuAssociationOps(val self: ElasticGpuAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuIdAsScala: Option[String] = Option(self.elasticGpuId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationIdAsScala: Option[String] = Option(self.elasticGpuAssociationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationStateAsScala: Option[String] = Option(self.elasticGpuAssociationState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuAssociationTimeAsScala: Option[String] = Option(self.elasticGpuAssociationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpuAssociationOps {

  implicit def toElasticGpuAssociationBuilderOps(v: ElasticGpuAssociation.Builder): ElasticGpuAssociationBuilderOps =
    new ElasticGpuAssociationBuilderOps(v)

  implicit def toElasticGpuAssociationOps(v: ElasticGpuAssociation): ElasticGpuAssociationOps =
    new ElasticGpuAssociationOps(v)

}
