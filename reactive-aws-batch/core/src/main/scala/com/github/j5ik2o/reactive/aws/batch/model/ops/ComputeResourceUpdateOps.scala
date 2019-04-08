// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ComputeResourceUpdateBuilderOps(val self: ComputeResourceUpdate.Builder) extends AnyVal {

  final def minvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.minvCpus(v)
    }
  }

  final def maxvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.maxvCpus(v)
    }
  }

  final def desiredvCpusAsScala(value: Option[Int]): ComputeResourceUpdate.Builder = {
    value.fold(self) { v =>
      self.desiredvCpus(v)
    }
  }

}

final class ComputeResourceUpdateOps(val self: ComputeResourceUpdate) extends AnyVal {

  final def minvCpusAsScala: Option[Int] = Option(self.minvCpus)

  final def maxvCpusAsScala: Option[Int] = Option(self.maxvCpus)

  final def desiredvCpusAsScala: Option[Int] = Option(self.desiredvCpus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComputeResourceUpdateOps {

  implicit def toComputeResourceUpdateBuilderOps(v: ComputeResourceUpdate.Builder): ComputeResourceUpdateBuilderOps =
    new ComputeResourceUpdateBuilderOps(v)

  implicit def toComputeResourceUpdateOps(v: ComputeResourceUpdate): ComputeResourceUpdateOps =
    new ComputeResourceUpdateOps(v)

}
