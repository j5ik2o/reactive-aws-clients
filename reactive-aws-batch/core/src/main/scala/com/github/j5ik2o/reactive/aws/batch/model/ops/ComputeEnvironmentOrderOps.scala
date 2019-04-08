// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeEnvironmentOrderBuilderOps(val self: ComputeEnvironmentOrder.Builder) extends AnyVal {

  final def orderAsScala(value: Option[Int]): ComputeEnvironmentOrder.Builder = {
    value.fold(self) { v =>
      self.order(v)
    }
  }

  final def computeEnvironmentAsScala(value: Option[String]): ComputeEnvironmentOrder.Builder = {
    value.fold(self) { v =>
      self.computeEnvironment(v)
    }
  }

}

final class ComputeEnvironmentOrderOps(val self: ComputeEnvironmentOrder) extends AnyVal {

  final def orderAsScala: Option[Int] = Option(self.order)

  final def computeEnvironmentAsScala: Option[String] = Option(self.computeEnvironment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeEnvironmentOrderOps {

  implicit def toComputeEnvironmentOrderBuilderOps(
      v: ComputeEnvironmentOrder.Builder
  ): ComputeEnvironmentOrderBuilderOps = new ComputeEnvironmentOrderBuilderOps(v)

  implicit def toComputeEnvironmentOrderOps(v: ComputeEnvironmentOrder): ComputeEnvironmentOrderOps =
    new ComputeEnvironmentOrderOps(v)

}
