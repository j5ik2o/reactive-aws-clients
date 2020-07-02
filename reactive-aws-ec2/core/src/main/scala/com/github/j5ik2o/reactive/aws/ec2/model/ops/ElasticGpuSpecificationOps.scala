// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticGpuSpecificationBuilderOps(val self: ElasticGpuSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): ElasticGpuSpecification.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

}

final class ElasticGpuSpecificationOps(val self: ElasticGpuSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticGpuSpecificationOps {

  implicit def toElasticGpuSpecificationBuilderOps(
      v: ElasticGpuSpecification.Builder
  ): ElasticGpuSpecificationBuilderOps = new ElasticGpuSpecificationBuilderOps(v)

  implicit def toElasticGpuSpecificationOps(v: ElasticGpuSpecification): ElasticGpuSpecificationOps =
    new ElasticGpuSpecificationOps(v)

}
