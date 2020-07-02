// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpuSpecificationResponseBuilderOps(val self: ElasticGpuSpecificationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): ElasticGpuSpecificationResponse.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

}

final class ElasticGpuSpecificationResponseOps(val self: ElasticGpuSpecificationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpuSpecificationResponseOps {

  implicit def toElasticGpuSpecificationResponseBuilderOps(
      v: ElasticGpuSpecificationResponse.Builder
  ): ElasticGpuSpecificationResponseBuilderOps = new ElasticGpuSpecificationResponseBuilderOps(v)

  implicit def toElasticGpuSpecificationResponseOps(
      v: ElasticGpuSpecificationResponse
  ): ElasticGpuSpecificationResponseOps = new ElasticGpuSpecificationResponseOps(v)

}
