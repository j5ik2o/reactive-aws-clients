// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpuAssociationBuilderOps(val self: ElasticGpuAssociation.Builder) extends AnyVal {

  final def elasticGpuIdAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuId(v)
    }
  }

  final def elasticGpuAssociationIdAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationId(v)
    }
  }

  final def elasticGpuAssociationStateAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationState(v)
    }
  }

  final def elasticGpuAssociationTimeAsScala(value: Option[String]): ElasticGpuAssociation.Builder = {
    value.fold(self) { v =>
      self.elasticGpuAssociationTime(v)
    }
  }

}

final class ElasticGpuAssociationOps(val self: ElasticGpuAssociation) extends AnyVal {

  final def elasticGpuIdAsScala: Option[String] = Option(self.elasticGpuId)

  final def elasticGpuAssociationIdAsScala: Option[String] = Option(self.elasticGpuAssociationId)

  final def elasticGpuAssociationStateAsScala: Option[String] = Option(self.elasticGpuAssociationState)

  final def elasticGpuAssociationTimeAsScala: Option[String] = Option(self.elasticGpuAssociationTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpuAssociationOps {

  implicit def toElasticGpuAssociationBuilderOps(v: ElasticGpuAssociation.Builder): ElasticGpuAssociationBuilderOps =
    new ElasticGpuAssociationBuilderOps(v)

  implicit def toElasticGpuAssociationOps(v: ElasticGpuAssociation): ElasticGpuAssociationOps =
    new ElasticGpuAssociationOps(v)

}
