// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticInferenceAcceleratorBuilderOps(val self: ElasticInferenceAccelerator.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): ElasticInferenceAccelerator.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): ElasticInferenceAccelerator.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

}

final class ElasticInferenceAcceleratorOps(val self: ElasticInferenceAccelerator) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticInferenceAcceleratorOps {

  implicit def toElasticInferenceAcceleratorBuilderOps(
      v: ElasticInferenceAccelerator.Builder
  ): ElasticInferenceAcceleratorBuilderOps = new ElasticInferenceAcceleratorBuilderOps(v)

  implicit def toElasticInferenceAcceleratorOps(v: ElasticInferenceAccelerator): ElasticInferenceAcceleratorOps =
    new ElasticInferenceAcceleratorOps(v)

}
