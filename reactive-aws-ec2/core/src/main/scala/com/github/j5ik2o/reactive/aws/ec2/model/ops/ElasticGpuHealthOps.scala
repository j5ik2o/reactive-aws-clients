// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpuHealthBuilderOps(val self: ElasticGpuHealth.Builder) extends AnyVal {

  final def statusAsScala(value: Option[ElasticGpuStatus]): ElasticGpuHealth.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class ElasticGpuHealthOps(val self: ElasticGpuHealth) extends AnyVal {

  final def statusAsScala: Option[ElasticGpuStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpuHealthOps {

  implicit def toElasticGpuHealthBuilderOps(v: ElasticGpuHealth.Builder): ElasticGpuHealthBuilderOps =
    new ElasticGpuHealthBuilderOps(v)

  implicit def toElasticGpuHealthOps(v: ElasticGpuHealth): ElasticGpuHealthOps = new ElasticGpuHealthOps(v)

}
