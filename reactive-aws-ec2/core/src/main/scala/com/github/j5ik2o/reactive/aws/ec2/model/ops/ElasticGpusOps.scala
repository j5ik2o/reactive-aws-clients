// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpusBuilderOps(val self: ElasticGpus.Builder) extends AnyVal {

  final def elasticGpuIdAsScala(value: Option[String]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.elasticGpuId(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def elasticGpuTypeAsScala(value: Option[String]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.elasticGpuType(v)
    }
  }

  final def elasticGpuHealthAsScala(value: Option[ElasticGpuHealth]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.elasticGpuHealth(v)
    }
  }

  final def elasticGpuStateAsScala(value: Option[ElasticGpuState]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.elasticGpuState(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): ElasticGpus.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class ElasticGpusOps(val self: ElasticGpus) extends AnyVal {

  final def elasticGpuIdAsScala: Option[String] = Option(self.elasticGpuId)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def elasticGpuTypeAsScala: Option[String] = Option(self.elasticGpuType)

  final def elasticGpuHealthAsScala: Option[ElasticGpuHealth] = Option(self.elasticGpuHealth)

  final def elasticGpuStateAsScala: Option[ElasticGpuState] = Option(self.elasticGpuState)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpusOps {

  implicit def toElasticGpusBuilderOps(v: ElasticGpus.Builder): ElasticGpusBuilderOps = new ElasticGpusBuilderOps(v)

  implicit def toElasticGpusOps(v: ElasticGpus): ElasticGpusOps = new ElasticGpusOps(v)

}
